
package tests;

import java.io.IOException;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.ProcennePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethod;
import utilities.TestBaseRapor;

public class ProcenneTest extends TestBaseRapor {
    ProcennePage procennePage;
    JavascriptExecutor js;
    Faker faker ;

    public ProcenneTest() {
    }

    @Test
    public void test01() throws InterruptedException, IOException {
        extentTest = extentReports.createTest("procenne_Test", "Mesaj Gönderilmeli");

        procennePage = new ProcennePage();
        js = (JavascriptExecutor)Driver.getDriver();
        faker= new Faker();
        Driver.getDriver().get(ConfigReader.getProperty("procenneUrl"));
        extentTest.info("https://www.procenne.com Url Adresine Gidildi");

        procennePage.iletisimTabı.click();
        extentTest.info("İletisim Tabina Tiklandi");

        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,950)","");
        Thread.sleep(1000);

        procennePage.isim.sendKeys("kadir");
        extentTest.info("İsim Yazildi");

        procennePage.soyİsim.sendKeys("okumus");
        extentTest.info("Soyisim Yazildi");

        procennePage.şirket.sendKeys("procenne");
        extentTest.info("Sirket Yazildi");

        procennePage.ePostaAdresi.sendKeys(faker.internet().emailAddress());
        extentTest.info("E-Posta Yazildi");

        procennePage.mesaj.sendKeys("TEST TAKIMI MERHABA");
        extentTest.info("Mesaj Girildi");

        procennePage.kişiselVerilerCheckBox.click();
        Thread.sleep(3000);
       // ReusableMethod.waitForVisibility(procennePage.buradan,15);
        js.executeScript("arguments[0].scrollIntoView(true)", procennePage.buradan);
       // ReusableMethod.waitForVisibility(procennePage.okudum,15);
        Thread.sleep(3000);
        procennePage.okudum.click();
        extentTest.info("Kisisel Veriler Okundu,Onaylandi");
        Thread.sleep(2000);

        procennePage.kampanyaDuyurularCheckBox.click();
        //ReusableMethod.waitForVisibility(procennePage.buradan,15);
        Thread.sleep(3000);
        js.executeScript("arguments[0].scrollIntoView(true)", procennePage.buradan);
        Thread.sleep(3000);
        //ReusableMethod.waitForVisibility(procennePage.okudum,15);
        procennePage.okudum.click();
        extentTest.info("Kampanyalar ve Duyurular Okundu,Onaylandı");
        Thread.sleep(2000);

        procennePage.gönder.click();
        extentTest.info("Mesaj Gönderildi");


    }
}
