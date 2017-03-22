package LearnTestNG;

import com.util.Config;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Properties;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;

public class SearchNameTest {
   
   WebDriver webDriver ;
   WebElement webelement;
   Config objt;
   Properties prop;
  
   @BeforeTest
   public void startup(){
	   objt  = new Config();
		 objt.wbdrver();
		 prop=objt.propt();
   }
	 @Test
	public void SearchNameOnGoogle(){
		 
		 objt.openUrl();
		 webelement=objt.wblmt("lst-ib");
		 webelement.sendKeys(prop.getProperty("name"));
		 webelement=objt.wblmt("_fZl");
		 webelement.click();
	   
       
   }
   
}