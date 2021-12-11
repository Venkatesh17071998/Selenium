

package org.taskone;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;

public class Locators {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\SAM\\\\eclipse-workspace\\\\SeleniumTask\\\\driver\\\\chromedriver_win32\\\\chromedriver.exe");
		//implict waits
		/*WebDriver l = new ChromeDriver();
		l.navigate().to("https://www.facebook.com");
		l.manage().window().maximize();
		l.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebElement txtUserName = l.findElement(By.id("email"));
		txtUserName.sendKeys("venkat");
		WebElement textpassword = l.findElement(By.id("pass"));
		textpassword.sendKeys("12345689");
		WebElement click = l.findElement(By.xpath("//button[@value='1']"));
		click.click();
		*/
		
		//explict waits/webdriver waits
		/*WebDriver l = new ChromeDriver();
		l.navigate().to("https://www.facebook.com");
		l.manage().window().maximize();
		WebDriverWait w=new WebDriverWait(l,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		WebElement txtUserName = l.findElement(By.id("email"));
		txtUserName.sendKeys("venkat");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
		WebElement textpassword = l.findElement(By.id("pass"));
		textpassword.sendKeys("12345689");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@value='1']")));
		WebElement click = l.findElement(By.xpath("//button[@value='1']"));
		click.click();
		*/
		
		//explict waits//fluentwaits
		WebDriver l = new ChromeDriver();
		l.navigate().to("https://www.facebook.com");
		l.manage().window().maximize();
		Wait w=new FluentWait(l).withTimeout(1000, TimeUnit.MILLISECONDS).pollingEvery(10,TimeUnit.MILLISECONDS);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		WebElement txtUserName = l.findElement(By.id("email"));
		txtUserName.sendKeys("venkat");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
		WebElement textpassword = l.findElement(By.id("pass"));
		textpassword.sendKeys("12345689");
		WebElement click = l.findElement(By.xpath("//button[@value='1']"));
		click.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//navigation
	/*	WebDriver l = new ChromeDriver();
		l.navigate().to("https://www.facebook.com");
		l.manage().window().maximize();
		WebElement txtUserName = l.findElement(By.id("email"));
		txtUserName.sendKeys("venkat");
		WebElement textpassword = l.findElement(By.id("pass"));
		textpassword.sendKeys("12345689");
		WebElement click = l.findElement(By.xpath("//button[@value='1']"));
		click.click();
		Thread.sleep(15000);
		l.navigate().back();
		l.navigate().forward();
		l.navigate().refresh();
		*/
		

	/*	//Screenshot
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		File f=new File("C:\\Users\\SAM\\Pictures\\New folder\\task.png");
		FileUtils.copyFile(screenshotAs, f);
		
		
		//Screenshot
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.facebook.com/");
		driver1.manage().window().maximize();
		WebElement element1 = driver1.findElement(By.id("email"));
		element1.sendKeys("Venkat");
		File screenshotAs1 = element1.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs1);
		File f1=new File("C:\\Users\\SAM\\Pictures\\New folder\\task1.png");
		FileUtils.copyFile(screenshotAs1, f1);
		*/
		
		//ashot
	/*	WebDriver driver2 = new ChromeDriver();
		driver2.get("http://www.greenstechnologys.com/testimonial.html");
		driver2.manage().window().maximize();
		Screenshot ss = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(2000)).takeScreenshot(driver2);
		ImageIO.write(ss.getImage(), "png", new File("C:\\Users\\SAM\\Pictures\\New folder\\task2.png"));*/
		
	
	/*	//frames
		// tofind num of frames and using windows handling
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		List<WebElement> g = driver.findElements(By.tagName("iframe"));
		int h = g.size();
		System.out.println(h);
		driver.switchTo().frame(1);
		WebElement a = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		a.click();
		String z = driver.getWindowHandle();
		System.out.println(z);
		Set<String> x = driver.getWindowHandles();
		System.out.println(x);
		for(String y:x) {
			if(!y.equals(x)) {
			driver.switchTo().window(y);
			}
		}
			WebElement s = driver.findElement(By.xpath("//*[@id=\"awf_field-93653884\"]"));
			s.sendKeys("mrvnkatsh1998@gmail.com");
			
		
		*/
		//2
		/*WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.245541762.748733755.1635099478-709325071.1635099478");
		driver.manage().window().maximize();
		WebElement a = driver.findElement(By.xpath("//frame[@name='login_page']"));
		//switch toframes
		driver.switchTo().frame(a);
		WebElement b = driver.findElement(By.xpath("//input[@type='text']"));		
		b.sendKeys("12345689");
		String c = b.getAttribute("value");
		System.out.println(c);
		
		*/
		
	
		
/*		//webtable
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		driver.manage().window().maximize();
		WebElement a = driver.findElement(By.id("main_table_countries_today"));
		List<WebElement> b = a.findElements(By.tagName("tr"));
		int c = b.size();
		System.out.println(c);
		for (int i = 0; i < b.size(); i++) {
			WebElement d = b.get(i);
			List<WebElement> e = d.findElements(By.tagName("td"));
			for (int j = 0; j < e.size(); j++) {
				WebElement g = e.get(j);
				String h = g.getText();
				if (h.equals("India")) {
					System.out.println(h);
					System.out.println("row" + i);
					System.out.println("column" + j);
				}
			}*/
		}

		/*for(int i = 0;i<b.size();i++) {
			WebElement c = b.get(i);
			List<WebElement> d = a.findElements(By.tagName("td"));
			for(int j=0; j<d.size();j++) {
				WebElement f = d.get(j);
				String g = f.getText();
				System.out.println(g);
				
			}
			*/
			//String d = c.getText();
			//System.out.println(d);
		
		
		
		
		/*WebDriver driver= new ChromeDriver();
		driver.get("https://www.worldometers.info/coronavirus/");
		driver.manage().window().maximize();
		WebElement a = driver.findElement(By.id("main_table_countries_today"));
		WebElement b = a.findElement(By.xpath("(//tr[@class='odd'])[2]"));
		String c = b.getText();
		System.out.println(c);
				
		*/
		
		
		
	
 //dropdown
		/*WebDriver driver = new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/sample-webpage-to-automate/");
		driver.manage().window().maximize();
		WebElement a = driver.findElement(By.name("multipleselect[]"));
		Select b = new Select(a);
		b.selectByIndex(0);
		b.selectByIndex(1);
		WebElement c = b.getFirstSelectedOption();
		String d = c.getText();
		System.out.println(d);
	*/
		 
		    
	
		/*c.size();
		for(int i=0; i<c.size();i++) {
			WebElement d = c.get(i);
			String f = d.getText();*/
			//b.selectByVisibleText("Performance Testing");
	
		
		
		/*
		b.selectByIndex(0);
		b.selectByIndex(1);
		b.selectByIndex(2);
		b.deselectByIndex(3);
		List<WebElement> c = b.getAllSelectedOptions();
		 c.size();
	    for (int i=0;i<c.size();i++) {
	    	WebElement d = c.get(i);
	    	String f = d.getText();
	    	System.out.println(f);
	    }*/
		
	   /* boolean c = b.isMultiple();
	    System.out.println(c);
		*/
		
		

		
		/*
		// dropdown
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB");
		driver.manage().window().maximize();
		WebElement b = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select c = new Select(b);
		List<WebElement> options = c.getOptions();
		options.size();
		for (int i = 1; i < options.size(); i += 2) {
			WebElement d = options.get(i);
			String e = d.getText();
			System.out.println(e);*/
		
		 //String d = b.getText();
		 //System.out.println(d);
		/*WebElement e = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select c = new Select(e);
		List<WebElement> d = c.getOptions();
		int f = d.size();
		int g = f - 1;
		WebElement m = d.get(g);
		String h = m.getText();
		System.out.println(h);
	*/
		/*int g = d.size();
		System.out.println(g);
		Set<WebElement> h = new LinkedHashSet<>(d);
		h.addAll(d);
		int i = h.size();
		System.out.println(i);
		*/
		
		
		/*for (int i = 0; i < d.size(); i += 2) {
		WebElement f =d.get(i);
		String g = f.getText();
		System.out.println(g);
		}
		*/
		
	 // String f = e.getText();
	  //System.out.println(f);
	  //WebElement g= driver.findElement(By.xpath("//select[@aria-label='Year']"));
	  //String h = g.getText();
	  //System.out.println(h);
	  
	
	  
	 /* List<WebElement> d = c.getOptions();
	  //iterate
	  for (int i = 5; i < d.size()-6; i++) {
		WebElement e = d.get(i);
		String f = e.getText();
		System.out.println(f);
	}
	  */
	
		
		//WindowHandle
		/*WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement a = driver.findElement(By.id("twotabsearchtextbox"));
		a.sendKeys("iphone",Keys.ENTER);
		WebElement b = driver.findElement(By.xpath("(//span[text()='Apple iPhone 11 (64GB) - White'])[3]"));
		b.click();
		//to find the parnt class win id
		String c = driver.getWindowHandle();
		System.out.println(c);
		//to find all win id
		Set<String> d = driver.getWindowHandles();
		System.out.println(d);
		//to find the child class win id
		for(String f: d) {
		
		if (!c.equals(f)) {
			driver.switchTo().window(f);
		}
		}
		WebElement h = driver.findElement(By.xpath("//span[@id='priceblock_ourprice']"));
		String i = h.getText();
		System.out.println(i);
		WebElement g = driver.findElement(By.id("add-to-cart-button"));
		g.click();
		driver.switchTo().window(c);
		
		WebElement j = driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (256GB) - Pink']"));
		j.click();
		Set<String> k = driver.getWindowHandles();
		System.out.println(k);
		
		for(String l:k) {
			if (!d.equals(l)) {
				driver.switchTo().window(l);
		}
		}
		WebElement m = driver.findElement(By.id("add-to-cart-button"));
		m.click();
		*/
		
	
		
		
		//javascript
	/*	WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement down = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
		JavascriptExecutor b=(JavascriptExecutor)driver;
		b.executeScript("arguments[0].scrollIntoView(true)",down);
		String text = down.getText();
		System.out.println(text);
		driver.quit();*/
	
		
		
		
		//javascript 
/*		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement down = driver.findElement(By.xpath("//*[@id=\"email\"]"));
		JavascriptExecutor b=(JavascriptExecutor)driver;
		b.executeScript("arguments[0].setAttribute('value','Venkatesh1998')",down);
		Object c = b.executeScript("return arguments[0].getAttribute('value')",down);
		System.out.println(c);
		WebElement up = driver.findElement(By.xpath("//*[@id='pass']"));
		b.executeScript("arguments[0].setAttribute('value','12345689')", up);
		Object d = b.executeScript("return arguments[0].getAttribute('value')", up);
		System.out.println(d);
		WebElement l = driver.findElement(By.xpath("//button[@value=\"1\"]"));
		b.executeScript("arguments[0].click()", l);
		*/
		
		
		
		
	
		
		//keysdown and up
		/*WebDriver driver= new ChromeDriver();
		driver.get("https://sarans1998.github.io/ToolManager/");
		driver.manage().window().maximize();
		//Robot a= new Robot();
		Actions a = new Actions(driver);
		a.keyDown(Keys.TAB).keyUp(Keys.TAB);
		a.keyDown(Keys.TAB).keyUp(Keys.TAB);
		a.keyDown(Keys.TAB).keyUp(Keys.TAB);
		a.keyDown(Keys.TAB).keyUp(Keys.TAB);*/
		/*for(int i =1; i<=11;i++) {
			a.keyPress(KeyEvent.VK_TAB);
			a.keyRelease(KeyEvent.VK_TAB);
		
			a.keyPress(KeyEvent.VK_ENTER);
			a.keyRelease(KeyEvent.VK_ENTER);*/
			
		
		

		//alerts
		/*WebDriver driver= new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		WebElement a = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
		a.click();
		WebElement b = driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button"));
		b.click();
		Alert c = driver.switchTo().alert();
		c.sendKeys("Venkatesh");
		c.accept();
		WebElement d = driver.findElement(By.xpath("//p[contains(text(),'How')]"));
		String e = d.getText();
		System.out.println(e);
		
		*/
		
		
		
		//keyword actions adact
		/*WebDriver driver= new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		Robot robot = new Robot();
		for(int i=1; i<=3;i++) {
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		}
		robot.keyPress(KeyEvent.VK_SHIFT);
		
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_E);
		
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		
		robot.keyRelease(KeyEvent.VK_SHIFT);
	
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_SHIFT);
		
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);
		
		robot.keyRelease(KeyEvent.VK_SHIFT);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		*/
		
		
		
		
		
	/*//move to mob t-mob
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.t-mobile.com/?src=spr&rdpage=%2F");
		driver.manage().window().maximize();
		Actions sprint = new Actions(driver);
		WebElement c = driver.findElement(By.xpath("(//button[@tabindex='0'])[7]"));
		c.click();
		WebElement a = driver.findElement(By.id("digital-header-nav-link-head-1"));
		sprint.moveToElement(a).perform();
		WebElement b = driver.findElement(By.xpath("//*[@id=\"nav-link-contaniner-1\"]/div/div/div/a[2]/span"));
		sprint.moveToElement(b).perform();
		b.click();
		WebElement d = driver.findElement(By.xpath("//a[@id='digital-footer-bottom-link-bottom-9']"));
		String e = d.getText();
		System.out.println(e);*/
		
		
		
	
		
	//mouse action
	/*	WebDriver driver= new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-training-in-chennai.html");
		driver.manage().window().maximize();
		Actions greens = new Actions(driver);
		
		WebElement course = driver.findElement(By.className("activeLink"));
		greens.moveToElement(course).perform();
		WebElement java = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/ul/li[3]/ul/li[4]/a"));
		greens.moveToElement(java).perform();
		WebElement corejava = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/ul/li[3]/ul/li[4]/ul/li[1]/a"));
		greens.moveToElement(corejava).perform();
		corejava.click();*/
		
		
		//drag and drop guru99
		/*WebDriver red= new ChromeDriver();
		red.get("http://demo.guru99.com/test/drag_drop.html");
		red.manage().window().maximize();
		
		Actions bank = new Actions(red);
		WebElement h = red.findElement(By.id("credit2"));
		WebElement m = red.findElement(By.id("bank"));
		bank.dragAndDrop(h, m).perform();
		
		WebElement s = red.findElement(By.id("credit1"));
		WebElement t = red.findElement(By.id("loan"));		
		bank.dragAndDrop(s,t).perform();
		

		WebElement v = red.findElement(By.id("fourth"));
		WebElement e = red.findElement(By.id("amt7"));		
		bank.dragAndDrop(v,e).perform();
		
		WebElement u = red.findElement(By.id("fourth"));
		WebElement k = red.findElement(By.id("amt8"));		
		bank.dragAndDrop(u,k).perform();
		
		WebElement p = red.findElement(By.xpath("//div[@class='table4_result']"));
		String attribute = p.getText();
		System.out.println(attribute);
		*/
		
		
		
		
		/*
		
		//redbus
		WebDriver red= new ChromeDriver();
		red.get("https://www.redbus.com/");
		red.manage().window().maximize();
		WebElement h = red.findElement(By.id("signin-block"));
		h.click();
		WebElement o = red.findElement(By.id("signInLink"));
		o.click();
		Thread.sleep(3000);
		WebElement n = red.findElement(By.xpath("//*[@id=\"signInView\"]/div[2]/div/div[1]/div[4]"));
		n.sendKeys("1234567893");*/
		
		
		
		
		
		
	/*	
		WebDriver l = new ChromeDriver();
		l.get("https://www.facebook.com/");
		l.manage().window().maximize();
		WebElement crtacc =l.findElement(By.xpath("(//a[@role='button'])[2]"));
		crtacc.click();
		Thread.sleep(3000);
		WebElement a= l.findElement(By.name("firstname"));
		a.sendKeys("Venkatesh");
		String u = a.getAttribute("value");
		System.out.println(u);
		
		*/
		
		

		
		
		
		/*//using thread sleep method
		WebDriver g= new ChromeDriver();
		g.get("http://www.greenstech.in/selenium-course-content.html");
		g.manage().window().maximize();
		WebElement k = g.findElement(By.xpath("(//span[@class='text'])[3]"));
		k.click();
		Thread.sleep(3000);
		WebElement z = g.findElement(By.xpath("(//p[contains(text(),'best')])[1]"));
		String f=z.getText();
		System.out.println(f);
		*/
		
		
/*		
		WebDriver r = new ChromeDriver();
		r.get("https://www.facebook.com/");
		r.manage().window().maximize();
		WebElement grnn= r.findElement(By.xpath("//h2[contains(text(),'F')]"));
		String txt = grnn.getText();
		System.out.println(txt);
		*/
		
		// adactin hotel get text
		/*WebDriver y = new ChromeDriver();
		y.get("http://adactinhotelapp.com");
		y.manage().window().maximize();
		WebElement adactin=y.findElement(By.xpath("//p[text()='Adactin Launches The Adactin Hotel App! ']"));
		String i = adactin.getText();
		System.out.println(i);
		*/
		
		
		
		
		
		/*WebDriver z = new ChromeDriver();
		z.get("http://greenstech.in/selenium-course-content.html");
		z.manage().window().maximize();
		WebElement mob = z.findElement(By.id("heading201"));
		mob.click();
		WebElement rsm=z.findElement(By.xpath("(//a[@title='Model Resume training in chennai'])[2]"));
		rsm.click();*/
		
	
		
		
		
		//greens
		/*WebDriver j = new ChromeDriver();
		j.get(" http://greenstech.in/selenium-course-content.html");
		j.manage().window().maximize();
		WebElement intrw = j.findElement(By.id("heading20"));
		intrw.click();
		WebElement cts = j.findElement(By.xpath("(//a[@title='Interview Questions'])[6]"));
		cts.click();
		*/
		
	/*	// greens
		WebDriver g = new ChromeDriver();
		g.get(" http://demo.automationtesting.in/Register.html");
		g.manage().window().maximize();
		WebElement frstnam = g.findElement(By.xpath("(//input[@type='text'])[1]"));
		frstnam.sendKeys("venkatesh");
		WebElement lastnam = g.findElement(By.xpath("(//input[@type='text'])[2]"));
		lastnam.sendKeys("M");
		WebElement addrss = g.findElement(By.xpath("//textarea[@rows='3']"));
		addrss.sendKeys("2/11,senthamilnagar, trichy-621216");
		WebElement mail = g.findElement(By.xpath("//input[@type='email']"));
		mail.sendKeys("vnkat1998@gmail.com");
		WebElement phon = g.findElement(By.xpath("//input[@type='tel']"));
		phon.sendKeys("1234568945");
		WebElement gndr = g.findElement(By.xpath("(//input[@type='radio'])[1]"));
		gndr.click();
		WebElement countrysl = g.findElement(By.xpath("//input[@class='select2-search__field']"));
		countrysl.sendKeys("india");
		WebElement india = g
				.findElement(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']"));
		india.click();
		WebElement pass = g.findElement(By.xpath("//input[@id='firstpassword']"));
		pass.sendKeys("12345689");
		WebElement cnfrmpass = g.findElement(By.xpath("//input[@id='secondpassword']"));
		cnfrmpass.sendKeys("12345689");
		WebElement submit = g.findElement(By.id("submitbtn"));
		submit.click();

		WebDriver f = new ChromeDriver();
		f.get("https://www.facebook.com/");
		f.manage().window().maximize();
		WebElement login = f.findElement(By.xpath("//input[@type='text']"));
		login.sendKeys("venkat@1998");
		WebElement pass1 = f.findElement(By.xpath("//input[@type='password']"));
		pass1.sendKeys("12345689");
		WebElement click = f.findElement(By.xpath("//button[@value='1']"));
		click.click();

		// amazon
		WebDriver h = new ChromeDriver();
		h.get(" https://www.amazon.in/");
		h.manage().window().maximize();
		WebElement d = h.findElement(By.id("twotabsearchtextbox"));
		d.click();
		d.sendKeys("iphone");
		WebElement amazon = h.findElement(By.id("nav-search-submit-button"));
		amazon.click();
*/
		/*// facebook
		WebDriver l = new ChromeDriver();
		l.get("https://www.facebook.com/");
		l.manage().window().maximize();
		WebElement txtUserName = l.findElement(By.id("email"));
		txtUserName.sendKeys("venkat");
		String name=txtUserName.getAttribute("value");
		System.out.println(name);
		WebElement textpassword = l.findElement(By.id("pass"));
		textpassword.sendKeys("12345689");
		*/
/*
		// adactin hotel
		WebDriver y = new ChromeDriver();
		y.get("http://adactinhotelapp.com");
		y.manage().window().maximize();
		WebElement r = y.findElement(By.id("username"));
		r.sendKeys("venkat1998");
		WebElement adact = y.findElement(By.id("password"));
		adact.sendKeys("12345689");

		// gmail
		WebDriver u = new ChromeDriver();
		u.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&");
		u.manage().window().maximize();
		WebElement j = u.findElement(By.name("identifier"));
		j.sendKeys("venkat1998@gmail.com");

		// binance
		WebDriver t = new ChromeDriver();
		t.get("https://accounts.binance.com/en/login");
		t.manage().window().maximize();
		WebElement w = t.findElement(By.name("email"));
		w.sendKeys("venkat1998@gmail.com");
		WebElement i = t.findElement(By.name("password"));
		i.sendKeys("12345689");
*/
	}




