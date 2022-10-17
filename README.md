# com.procenne_Test.TestNG
<hr/>

www.procenne.com sitesinin testlerini gerçekleştirdiğim bu projemde 
Hem her adimda raporlama hemde cross browser ile paralel test calistirma icin
TestNG frameworkü ile calistim

TestNG Framework'ünde OOP (object oriented programming) konseptine uyarak  POM (page object model) dizayn modelini kullandim

<br/>

### pages dosyasi <br/>
bu dosyamizda elimizde bulunan sitenin testlerini gerceklestirecegim elementlerin locatelerini sakladıgim classim bulunmakta.
İstedigim locate almak icin olusturdugum classin adinda constructar olusturdum ve icine <b> PageFactory </b> classini cagirip
icerisine olusturdugum driveri cagirip burada olduğunu belli ettigim <b> this </b> key kullanildi. Locatelerimi cagirabilinmek için de <b> FindBy </b> notasyonu ile locatelerimmi olusturdum

### tests dosyasi <br/>
tests classimda TestNG'de rapor almak icin TestBaseRapor class ile extends yaparak parent-child iliskisi kurdum. Her aksiyon sonrasi yaptigim islemleri raporladim. Ayri bir class ile de hem chrome hemde firefox ile testlerimi run edebilmek icim xml dosyalari olusturup paralel calistirmayi sagladim, TestNG'de hem raporlama hemde paralel test calistirma ayni anda olmadigindan dolayi ayri classlarda olusturmak zorunda kaldim. 
 
### utilities dosyası <br/>
yardimci classimiz. Bu dosyamda sürekli lazim olan classlarimiz ve methodlarimiz bulunmaktadir. İcerisinde  projemi daha anlasilir hale getirecek classlarim ve methodlarim var bunlar
<b> Driver.class </b> , <b> CrossDriver.class </b> , <b> ConfigReader.class </b> , <b> ReusableMehod.class </b> , <b> TestBaseRapor.class </b> vb. dosyalarim bulunmaktadir. 

### <b> Configuration.properties </b>
properties dosyamda sürekli kullandıigim variablelarim bulunmakta , bu veriabları kullanmak için properties dosyası <b> Key  =  value </b> olarak oluşturulmakta buradaki bilgileri baska classlara cagirabilmek icin utilities dosyasindan
<b> ConfigReader </b> classi çagirilarak icindeki method sayesinde bu dosyada bulunan bilgileri istediğim yere cagirabildim

## pom.xml
bu dosyada kullanmak istedigim kodlarin kutuphanesini  <b> dependencies </b> taginin icerisine yerlestirip guncel bilgilerini sürekli olarak kullanmayi amacladim. Burası sayesinde tum kodlara erisim sagladim

<hr/>

# Selenium Testi

<br/>

Java11  ve Maven projesi olusturulup TestNG framework kullanilarak olusturulmustur

<br/>

<a href="https://www.java.com" target="_blank" rel="noreferrer"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="50" height="50"/> </a>
<a href="https://git-scm.com/" target="_blank" rel="noreferrer"> <img src="https://www.vectorlogo.zone/logos/git-scm/git-scm-icon.svg" alt="git" width="40" height="40"/> </a>
<a href="https://www.selenium.com" target="_blank" rel="noreferrer"> <img src="https://camo.githubusercontent.com/4b95df4d6ca7a01afc25d27159804dc5a7d0df41d8131aaf50c9f84847dfda21/68747470733a2f2f73656c656e69756d2e6465762f696d616765732f73656c656e69756d5f6c6f676f5f7371756172655f677265656e2e706e67" alt="Selenium" width="50" height="50"/> </a>
<a href="https://www.intelj.com" target="_blank" rel="noreferrer"> <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQak-N8W03mK25slV1lwM80i0y1obRPPJOaLA&usqp=CAU" alt="intelj" width="80" height="40"/> </a>
<a href="https://www.maven.com" target="_blank" rel="noreferrer"> <img src="https://koraypeker.com/wp-content/uploads/2018/06/1_xsrKVt69q3JsZzLD-ldekQ.jpeg" alt="git" width="100" height="40"/> </a>

<br/>
