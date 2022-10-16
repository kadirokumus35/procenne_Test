
package tests;

import java.io.IOException;

import com.github.javafaker.Faker;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.ProcennePage;
import utilities.*;

public class ProcenneCrossBrowser extends TestBaseCross {
    ProcennePage procennePage;
    JavascriptExecutor js;
    Faker faker ;

    public ProcenneCrossBrowser() {
    }

    @Test
    public void test01() throws InterruptedException, IOException {

        procennePage = new ProcennePage();
        js = (JavascriptExecutor)Driver.getDriver();
        faker= new Faker();
        Driver.getDriver().get(ConfigReader.getProperty("procenneUrl"));

        procennePage.iletisimTabı.click();

        Thread.sleep(1000);
        js.executeScript("window.scrollBy(0,950)","");
        Thread.sleep(1000);

        procennePage.isim.sendKeys("kadir");

        procennePage.soyİsim.sendKeys("okumus");


        procennePage.şirket.sendKeys("procenne");

        procennePage.ePostaAdresi.sendKeys(faker.internet().emailAddress());

        procennePage.mesaj.sendKeys("TEST TAKIMI MERHABA");

        procennePage.kişiselVerilerCheckBox.click();
        Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView(true)", procennePage.buradan);
        Thread.sleep(2000);
        procennePage.okudum.click();
        Thread.sleep(1000);

        procennePage.kampanyaDuyurularCheckBox.click();
        Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView(true)", procennePage.buradan);
        Thread.sleep(2000);
        procennePage.okudum.click();
        Thread.sleep(1000);

        procennePage.gönder.click();


    }
}
