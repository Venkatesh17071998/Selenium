package org.taskone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TaskThree {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\Users\\SAM\\eclipse-workspace\\SeleniumTask\\driver\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	WebDriver A=new FirefoxDriver();
	A.get("http://www.greenstechnologys.com/");
	A.manage().window().maximize();
	
	
	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\SAM\\eclipse-workspace\\SeleniumTask\\driver\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	WebDriver C=new FirefoxDriver();
	C.get("https://www.amazon.in");
	C.manage().window().maximize();	
	
	System.setProperty("webdriver.gecko.driver","C:\\Users\\SAM\\eclipse-workspace\\SeleniumTask\\driver\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	WebDriver D=new FirefoxDriver();
	D.get("http://greenstech.in/selenium-course-content.html");
	D.manage().window().maximize();	
	
	
}
}
