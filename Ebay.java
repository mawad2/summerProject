/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebay;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDrizverWait;

/**
 *
 * @author MohammedPC
 * @author Abdullahi Munye
 */
public class Ebay {

       
    
    /**
     * @param args the command line arguments
     */
    
    public void OpenGmail(){
       
        
       
         
        
    
    }
    
    public String checkYValue(int y){
    
        return null;
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
         try {
      System.out.println("We are trying to do something cool");
      System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String gmail = "https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
       
        driver.get(gmail);
        
        driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("salehhamza00@gmail.com"); //salehhamza00@gmail.com
       
            Thread.sleep(1000);
        //This is to click next
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]")).click();
        
        Thread.sleep(1000);
            //This is to put in the password Cairo2000
     driver.findElement(By.cssSelector(".aCsJod.oJeWuf div div input" )).sendKeys("Cairo2000");
     driver.findElement(By.cssSelector("#passwordNext")).click();
     //tempGmail.sendKeys(Keys.SHIFT, Keys.TAB);
     //driver.findElement(By.xpath("//*[@id=\"passwordNext\"]")).sendKeys("Awad9911677");
       //driver.findElement(By.xpath("//*[@id=\"identifierNext\"]")).click();
         
        
         Thread.sleep(1000);
           WebElement PageChecker = (new WebDriverWait(driver, 10000)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\":ha\"]/div/div")));
       
         System.out.println("We should be in the email now to check the stuff");
         
         
         for(int x = 0; x <= 17; x++){
         System.out.println("the while loop"); 
         String ca = "a";
          
        switch (x) {
            case 0:  ca = "0";
                     break;
            case 1:  ca = "1";
                     break;
            case 2:  ca = "2";
                     break;
            case 3:  ca = "3";
                     break;
            case 4:  ca = "4";
                     break;
            case 5:  ca = "5";
                     break;
            case 6:  ca = "6";
                     break;
            case 7:  ca = "7";
                     break;
            case 8:  ca = "8";
                     break;
            case 9:  ca = "9";
                     break;
            case 10: ca = "a";
                     break;
            case 11: ca = "b";
                     break;
            case 12: ca = "c";
                     break;
            case 13: ca = "d";
                     break;
            case 14: ca = "e";
                     break;
            case 15: ca = "f";
                     break;
            case 16: ca = "g";
                     break;  
            default: ca = "g";
                     break;
        }
         //This is the innerloop
              for(int y = 0; y <= 36; y++){
                  
              String da;
             //da = checkYValue(y);
              switch (y) {
            case 0:  da = "0";
                     break;
            case 1:  da = "1";
                     break;
            case 2:  da = "2";
                     break;
            case 3:  da = "3";
                     break;
            case 4:  da = "4";
                     break;
            case 5:  da = "5";
                     break;
            case 6:  da = "6";
                     break;
            case 7:  da = "7";
                     break;
            case 8:  da = "8";
                     break;
            case 9:  da = "9";
                     break;
            case 10: da = "a";
                     break;
            case 11: da = "b";
                     break;
            case 12: da = "c";
                     break;
            case 13: da = "d";
                     break;
            case 14: da = "e";
                     break;
            case 15: da = "f";
                     break;
            case 16: da = "g";
                     break; 
            case 17: da = "h";
                     break; 
            case 18: da = "i";
                     break; 
            case 19: da = "j";
                     break; 
            case 20: da = "k";
                     break; 
            case 21: da = "l";
                     break; 
            case 22: da = "m";
                     break; 
            case 23: da = "n";
                     break; 
            case 24: da = "o";
                     break; 
            case 25: da = "p";
                     break; 
            case 26: da = "q";
                     break; 
            case 27: da = "r";
                     break; 
            case 28: da = "s";
                     break; 
            case 29: da = "t";
                     break; 
            case 30: da = "u";
                     break; 
            case 31: da = "v";
                     break; 
            case 32: da = "w";
                     break; 
            case 33: da = "x";
                     break; 
            case 34: da = "y";
                     break; 
            case 35: da = "z";
                     break;   
            default: da = "g";
                     break;
        }
              
             System.out.println("Check CA and DA " + ca + " X" ); 
             
            if( x <= 3 && y <= 2){ // if ID = 31 skip it duh
                        
             if( driver.findElements(By.xpath("//*[@id=\":" + ca + da + "\"]")).size() != 0){
                 
             System.out.println("Check CA and DA" + ca + " " + da); 
             //*[@id=":6t"]
             //TODO: Search based on sender of email //*[@id=\":" + ca + da + "\"]"   //*[@id=":v7"]/b/text()
              System.out.println(driver.findElement(By.id((":" + ca + da))).getText().contains("Instant payment received from"));
                  
                 //System.out.println(driver.findElement(By.xpath("//*[@id=\":" + ca + da + "\"]")).getText());
                 System.out.println(driver.findElement(By.id(":" + ca + da)).getText());
                  System.out.println("We are here");
                  
                  //if(driver.findElement(By.cssSelector(".zA.zE")).getCssValue(gmail)){ //this is to find if it is unread  //Old Code .getText().contains("Instant payment received from")
                    if(driver.findElement(By.id(":" + ca + da)).getText().contains("Instant payment received from")) {
                        
                 
                         System.out.println("We found an unread email");
                         driver.findElement(By.xpath("//*[@id=\":" + ca + da + "\"]")).click();
                       // WebElement tempEmail = driver.findElement(By.xpath("//*[@id=\":" + ca + da + "\"]"));
                       // System.out.println(tempEmail.getCssValue(".zE") + " This is to see if it unread");
                       // if(tempEmail.getCssValue(".zE") == "True"){
                        System.out.println("We are unread now click");
                       // tempEmail.click();
                       // }
                        //driver.findElement(By.cssSelector(".zE")).click(); //tr[class=zA zE]
                        Thread.sleep(1000); 
                        System.out.println(driver.findElement(By.xpath("//*[@id=\":k1\"]/div[2]/table/tbody/tr/td[2]/table[1]/tbody/tr/td/table/tbody/tr[3]/td/table[2]/tbody/tr/td[2]/div/span[2]/a")).getText());
                        //driver.findElement(By.xpath("//*[@id=\":k1\"]/div[2]/table/tbody/tr/td[2]/table[1]/tbody/tr/td/table/tbody/tr[3]/td/table[2]/tbody/tr/td[2]/div/span[2]/a")).click();
                        Thread.sleep(500); 
                         
                         //WebElement tempSubject =  driver.findElement(By.xpath("//*[@id=\":k0\"]/div[1]/div[2]/div[1]/table/tbody/tr[1]/td[4]/div[1]"));
                        // tempSubject.click();
                        // Thread.sleep(100);
                        // tempSubject.sendKeys(Keys.TAB);
                         for(int i=0; i <= 20 ; i++){
                         Thread.sleep(100);
                         
                        // tempSubject.sendKeys(Keys.TAB);
                         System.out.print(i);
                         }
                         Thread.sleep(100);
                        // tempSubject.sendKeys(Keys.TAB, Keys.SHIFT);
                        
                         /*tempSubject.sendKeys("Where is your 2 Day / 48 hours xbox live code");
                        tempSubject.sendKeys(Keys.TAB);*/
                         
                          // Thread.sleep(1000);
                         /*
                         tempSubject.sendKeys(Keys.TAB);
                         tempSubject.sendKeys(Keys.TAB);
                         tempSubject.sendKeys("Where is your 2 Day / 48 hours xbox live code");
                          
                          */
                         //tempSubject.sendKeys(Keys.TAB);
                         
                        // tempSubject.sendKeys("Thank you for your purchase of 2 day Xbox live trial. We hope that your purchase. Don't forget to leave us feedback. Here's your code:        If there is any issues don't hesitate to contact us!");
                        //*[@id=":on"]
//                        driver.findElement(By.cssSelector("LW-avf")).sendKeys("Thank you for your purchase of 2 day Xbox live trial. We hope that your purchase. Don't forget to leave us feedback. Here's your code:        If there is any issues don't hesitate to contact us!");
                        
                        
                        break;
                    }
                 }
              
                }
               if(x == 16 && y == 16){ //stop at gg
                  break;
                }
             }
         
             if(x == 16){ //stop at gg
                    break;
             } 
         }  
         
         //String tempString = driver.findElement(By.xpath("//*[@id=\":dc\"]")).getText(); "//*[@id=\":" + ca + da + "\"]"
         //String tempString1 = driver.findElement(By.xpath("//*[@id=\":dc\"]")).getText();
         //System.out.println(tempString);
         //System.out.println(tempString1);
         
         
         System.out.println("We are in the RIGHT EMAIL ADDRESS");
        
         
        
        
        
      } catch (InterruptedException ex) {
            Logger.getLogger(Ebay.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
    } 
}
