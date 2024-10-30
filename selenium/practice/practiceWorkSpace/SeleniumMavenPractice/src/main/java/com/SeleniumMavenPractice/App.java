package com.SeleniumMavenPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class App {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//types of Selectors
		/*
		 * driver.get("https://github.com/login"); Thread.sleep(3000); highlight(driver,
		 * driver.findElement(By.id("login_field"))); Thread.sleep(3000);
		 * highlight(driver, driver.findElement(By.name("password")));
		 * Thread.sleep(3000); highlight(driver,
		 * driver.findElement(By.className("header-logo"))); Thread.sleep(3000);
		 * highlight(driver, driver.findElement(By.linkText("Forgot password?")));
		 * Thread.sleep(3000); highlight(driver,
		 * driver.findElement(By.partialLinkText("Create an"))); Thread.sleep(3000);
		 * highlight(driver, driver.findElement(By.tagName("h1"))); Thread.sleep(3000);
		 * highlight(driver, driver.findElement(By.
		 * xpath("//label[contains(text(), 'Username or email address')]")));
		 * Thread.sleep(3000); highlight(driver,
		 * driver.findElement(By.cssSelector("input[name='commit']")));
		 */
		
		//Handling Text Boxes
		/*driver.get("https://github.com/login");
		Thread.sleep(3000);
		WebElement usernameTxt = driver.findElement(By.id("login_field"));
		if(usernameTxt.isDisplayed()) {
			if(usernameTxt.isEnabled()) {
				usernameTxt.sendKeys("HYR");
				String enteredText = usernameTxt.getAttribute("value");
				System.out.println(enteredText);
				Thread.sleep(3000);
				//usernameTxt.clear();
				usernameTxt.sendKeys("Tutorials");
			}
			else
				System.err.println("username textbox is not enabled");			
		}
		else
			System.err.println("username textbox is not displayed");
		}*/
		
		//Handling Buttons, Checkbox, Radiobuttons, Link, 
		/*driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(3000);
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(3000);
		WebElement hindiChk = driver.findElement(By.id("hindichbx"));
		hindiChk.click(); // check
		Thread.sleep(3000);
		if(hindiChk.isSelected())
			hindiChk.click(); //uncheck
		Thread.sleep(3000);
		driver.findElement(By.id("registerbtn")).click();
		System.out.println(driver.findElement(By.id("msg")).getText());
		Thread.sleep(3000);
		driver.findElement(By.linkText("Click here to navigate to the home page")).click();
		*/
		
		//Navigation Methods
		/*driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("HYR Tutorials");
		driver.findElement(By.name("q")).submit();
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("test@gmail.com");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.quit();
		*/
		
		//Handling Dropdown
//		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
//		Thread.sleep(3000);
//		WebElement courseElement = driver.findElement(By.id("course"));
//		Select courseNameDropdown = new Select(courseElement);
//		List<WebElement> courseNameDropdownOptions = courseNameDropdown.getOptions();
//		for (WebElement option : courseNameDropdownOptions) {
//			System.out.println(option.getText());
//		}
//		courseNameDropdown.selectByIndex(1);//Java
//		Thread.sleep(3000);
//		courseNameDropdown.selectByValue("net"); //Dot net
//		Thread.sleep(3000);
//		courseNameDropdown.selectByVisibleText("Javascript"); //Javascript
//		Thread.sleep(3000);
//		
//		String selectedText = courseNameDropdown.getFirstSelectedOption().getText();
//		System.out.println("Selected visible text - " +selectedText);
		
		/*WebElement ideElement = driver.findElement(By.id("ide"));
		Select ideDropdown = new Select(ideElement);
		List<WebElement> ideDropdownOptions = ideDropdown.getOptions();
		for (WebElement option : ideDropdownOptions) {
			System.out.println(option.getText());
		}
		ideDropdown.selectByIndex(0);//Eclipse
		Thread.sleep(3000);
		ideDropdown.selectByValue("ij"); //IntelliJ IDEA
		Thread.sleep(3000);
		ideDropdown.selectByVisibleText("NetBeans"); //NetBeans
		Thread.sleep(3000);
		
		ideDropdown.deselectByVisibleText("IntelliJ IDEA");
		
		List<WebElement> selectedOptions = ideDropdown.getAllSelectedOptions();
		for (WebElement selectedOption : selectedOptions) {
			System.out.println("Selected visible text - " +selectedOption.getText());
		}*/
	}
	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border: 2px solid red; background: yellow')", element);
	}

}
