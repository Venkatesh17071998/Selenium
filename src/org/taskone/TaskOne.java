package org.taskone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TaskOne {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SAM\\eclipse-workspace\\SeleniumTask\\driver\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get( "http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
	
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SAM\\eclipse-workspace\\SeleniumTask\\driver\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.facebook.com/");
		driver1.manage().window().maximize();
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SAM\\eclipse-workspace\\SeleniumTask\\driver\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://www.whatsapp.com/");
		driver2.manage().window().maximize();
	
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SAM\\eclipse-workspace\\SeleniumTask\\driver\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver3 = new ChromeDriver();
		driver3.get("https://twitter.com/i/flow/login?input_flow_data=%7B%22requested_variant%22%3A%22eyJsYW5nIjoiZW4ifQ%3D%3D%22%7D");
		driver3.manage().window().maximize();
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\SAM\\eclipse-workspace\\SeleniumTask\\driver\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver A=new FirefoxDriver();
		A.get("http://www.greenstechnologys.com/");
		A.manage().window().maximize();
		
		
	}

}
