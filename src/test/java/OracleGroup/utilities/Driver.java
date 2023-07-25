package OracleGroup.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;
public class Driver {
    /*
    Driver class`indaki temel mantik extends yontemiyle degil yani TestBase class`ina extends etmek yerine,
    Driver class`indan static methodlar kullanarak driver olustururuz. Static oldugu icin class ismi ile her yerden
    method() a ulasabilecegiz.
     */
    /*
    Singleton Pattern: Tekli kullanim kalibi.
        Bir class`tan object olusturulmasinin onune gecilmesi icin kullanilan ifade.
        Bunun icin bir class`tan object olusturmanin onune gecmek icin default constructor`in kullanimini engellemek icin
        private access modifire  kullanarak bir constructor olstururuz.
     */
    private  Driver(){

    }
    static WebDriver driver;
    public static WebDriver getDriver(){

        /*
            Driver`i her cagirdiginda yeni bir penceere acilmasinin onune gecmek icin
        If blogu icinde eger driver`a deger atanmamissa deger ata, eger deger atanmissa
        driver`i ayni sayfada return et. Bunun icin sadece yapmamiz gereken if (driver==null) kullanmaktir.
         */

        if(driver==null){
            switch (ConfigReader.getProperty("browser")) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
                    break;

                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver=new EdgeDriver(new EdgeOptions().addArguments("--remote-allow-origins=*"));
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));

            }

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }

        return driver;
    }
    public static void closeDriver(){
        if(driver!=null){//driver`a deger atanmissa kapat
            driver.close();
            driver=null;
        }

    }
    public static void quitDriver() {
        if (driver != null) {//driver`a deger atanmissa cik
            driver.quit();
            driver = null;
        }

    }
}
