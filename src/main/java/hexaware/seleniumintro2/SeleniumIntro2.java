
package hexaware.seleniumintro2;

//import java.util.List;
import java.awt.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
public class SeleniumIntro2 {

    public static void main(String[] args) {
       
                              //setting this key              with this value         
         System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
            // creating the object in order to access the methods of chromedriver
            //contained in webdriver interface 
          WebDriver driver = new ChromeDriver();
          // By searchButtonSelector = By.className("search_button");
   // WebDriverWait wait = new WebDriverWait(driver, 10);
          // maximizes the size of the window in the browser 
           driver.manage().window().maximize();
         // awaiting 10 seconds loading  
          driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // it opens the page that we require 
         driver.get("http://automationpractice.com/index.php");
        // click on sing in link 
        driver.findElement(By.className("login")).click();
        // enter invalid email address in the email box and click enter 
        WebElement email = driver.findElement(By.id("email_create"));
        email.sendKeys("abiubfuroov@gmail.com");
        driver.findElement(By.name("SubmitCreate")).click();  
        //validate that an error message is displaying saying "invalid email address"
        
       //  WebElement searchButton = wait.until(                
       //   visibilityOfElementLocated
        //  (searchButtonSelector)); 
       //Boolean exist = driver.findElements(By.id("alert alert-danger")).isEmpty();
       // System.out.println(exist);
      // driver.close();
//         if(existeElemento){
//        System.out.println("Existe elemento");
//         }else{//0, elemento no esta presente.
//          System.out.println("Elemento no existe");
//         }
        
    }
}
