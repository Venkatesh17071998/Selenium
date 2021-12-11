package org.taskone;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class TaskTwo {
public static void main(String[]args) {
	System.setProperty("webdriver.ie.driver","C:\\Users\\SAM\\eclipse-workspace\\SeleniumTask\\driver\\IEDriverServer_x64_3.150.2\\IEDriverServer.exe");
	WebDriver driver =new InternetExplorerDriver();
	driver.get("http://www.greenstechnologys.com/");
	driver.manage().window().maximize();
	
	System.setProperty("webdriver.ie.driver","C:\\Users\\SAM\\eclipse-workspace\\SeleniumTask\\driver\\IEDriverServer_x64_3.150.2\\IEDriverServer.exe");
	WebDriver driver1= new InternetExplorerDriver();
	driver1.get("https://www.facebook.com/");
	driver1.manage().window().maximize();
	
	System.setProperty("webdriver.ie.driver","C:\\Users\\SAM\\eclipse-workspace\\SeleniumTask\\driver\\IEDriverServer_x64_3.150.2\\IEDriverServer.exe");
	WebDriver driver2=new InternetExplorerDriver();
	driver2.get(" http://www.greenstechnologys.com/");
	driver2.manage().window().maximize();
	
	System.setProperty("webdriver.ie.driver","C:\\Users\\SAM\\eclipse-workspace\\SeleniumTask\\driver\\IEDriverServer_x64_3.150.2\\IEDriverServer.exe");
	WebDriver driver3= new  InternetExplorerDriver();
	driver3.get("http://greenstech.in/selenium-course-content.html");
	driver3.manage().window().maximize();
	
	
	
	
	
	
}
}
