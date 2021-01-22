package test;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebElement;
/**
 * @author Nils Schuette via frontendtest.org
 */
public class ydebaudus {
    static WebDriver webDriver;
    
    WebElement Commentaires;
    /**
     * @param args
     * @throws InterruptedException
     */
    public static void main(final String[] args) throws InterruptedException {
        // Telling the system where to find the chrome driver
        System.setProperty(
                "webdriver.chrome.driver","C:\\Users\\Yann\\Desktop\\animation\\chromedriver.exe");

        // Open the Chrome browser
        webDriver = new ChromeDriver();

        // Maximize the browser window
        webDriver.manage().window().maximize();

        if (useCase()) {
            System.out.println("Test Wordpress Login: Passed");
        } else {
            System.out.println("Test Wordpress Login: Failed");

        }

        // Close the browser and WebDriver
        webDriver.close();
        webDriver.quit();
    }
    
   
    	
    

    private static boolean useCase() {
        try {
            // Open google.com
            webDriver.navigate().to("https://www.amazon.fr/");
            
           // Methode avec adresse mail + identifiants generiques 
                       
            // Look for the identification  
         //   webDriver.findElement(By.id("nav-link-accountList-nav-line-1")).click(); 
            
            // Click on the identification button & paste the mail adress
         //   webDriver.findElement(By.id("ap_email")).sendKeys("yann"); 
            
            //Click on the continue button 
          //  webDriver.findElement(By.id("continue")).click();
            
            // Paste the password
          //  webDriver.findElement(By.id("ap_email")).sendKeys("testos"); 

            // Type in the username
     //      webDriver.findElement(By.id("user_login")).sendKeys("YOUR_USERNAME");

            // Type in the password
      //      webDriver.findElement(By.id("user_pass")).sendKeys("YOUR_PASSWORD");

            //Look for a PS5
            webDriver.findElement(By.id("twotabsearchtextbox")).sendKeys("Playstation 5");
            
            //Hit the searchkey 
            webDriver.findElement(By.id("nav-search-submit-button")).click();
            
            
            
            
            
            webDriver.findElement(By.className("a-dropdown-container")).click(); 
            
            webDriver.findElement(By.name("Prix : par ordre décroissant")).click(); 
            
            //Select a 50 euros item
            webDriver.findElement(By.xpath("//a[contains(text(), 'Plus de 50 EUR')]")).click();
           
            //Cliquer on tyhe first item showing up 
            webDriver.findElement(By.cssSelector("div[class='s-include-content-margin s-border-bottom s-latency-cf-section']"));
            
            //Look for commentaries and screenshot them
            
            WebElement Commentaires= webDriver.findElement(By.id("reviewsRefinements"));
            click(Commentaires); 
            
            File scrFile = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
            // Now you can do whatever you need to do with it, for example copy somewhere
            FileUtils.copyFile(scrFile, new File("c:\\tmp\\screenshot.png"));
            

            

            //wait a bit  
            Thread.sleep(7000);

           //handle alert
            Alert alert = driver.switchTo().alert(); // switch to alert
            String alertMessage = driver.switchTo().alert().getText(); 
            System.out.println(alertMessage); // print alert message 
            Thread.sleep(5000); 
            alert.accept(); 
            
            

        // SI quelque chose se passe mal, return false
        } catch (final Exception e) {
            System.out.println(e.getClass().toString());
            return false;
        }
    }





	private static void click(WebElement commentaires2) {
		// TODO Auto-generated method stub
		
	}
}

