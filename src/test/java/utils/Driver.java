package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {

        private static WebDriver driver;

        private Driver(){
        }



        public static WebDriver getDriver(){

            String browser=ConfigReader.getProperty("browser");

            if(driver == null){

                switch (browser){

                    case "firefox":

                        WebDriverManager.firefoxdriver().setup();
                        driver = new ChromeDriver();
                        break;

                    case "edge":

                        WebDriverManager.edgedriver().setup();
                        driver = new ChromeDriver();
                        break;

                    default:
                        WebDriverManager.chromedriver().setup();
                        driver = new ChromeDriver();
                        break;

                }


                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            }

            return driver;
        }


        public static void closeDriver(){
            if(driver != null){
                driver.quit();
                driver = null;
            }
        }

    }



