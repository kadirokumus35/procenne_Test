package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProcennePage {
    public ProcennePage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//*[text()='İletişim'][1]")
    public WebElement iletisimTabı;

    @FindBy (xpath = "//*[@name='first_name']")
    public WebElement isim;

    @FindBy (xpath = "//*[@name='last_name']")
    public WebElement soyİsim;

    @FindBy (xpath = "//*[@name='company']")
    public WebElement şirket;

    @FindBy (xpath = "//*[@name='email'][1]")
    public WebElement ePostaAdresi;

    @FindBy (xpath = "//*[@name='message']")
    public WebElement mesaj;

    @FindBy (xpath = "//*[@class='mr-2'][1]")
    public WebElement kişiselVerilerCheckBox;

    @FindBy (xpath = "//*[text()='Okudum']")
    public WebElement okudum;

    @FindBy (xpath = "(//input[@type='checkbox'])[2]")
    public WebElement kampanyaDuyurularCheckBox;

    @FindBy (xpath = "//button[text()='Gönder']")
    public WebElement gönder;

    @FindBy (xpath = "    //*[@class='text-gray w-full h-full overflow-auto outline outline-dark/[.04] outline-offset-4 outline-2 rounded']\n")
    public WebElement yanCubuk;


    @FindBy (xpath = "  //a[@class='text-primary']")
    public WebElement buradan;




}
