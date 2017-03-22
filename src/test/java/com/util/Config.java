package com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;

public class Config {
	
	WebDriver webDriver ;
	WebElement webelement;
	Properties prop = new Properties();
	
	public Properties propt() {

			
				InputStream input = null;
				try {
					input = new FileInputStream("myvalues.properties");
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				try {
					prop.load(input);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return prop;
		}
	
	public WebDriver wbdrver(){
		 System.setProperty("webdriver.chrome.driver","resource/chromedriver");
	 	 webDriver = new ChromeDriver();	
	 	 return webDriver; 	
	}
	public void openUrl(){
		webDriver.get(prop.getProperty("urlValue"));
	}
	public WebElement wblmt(String a){
	   return webDriver.findElement(By.id(a));
	}
	}
