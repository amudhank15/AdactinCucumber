package com.adactin.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	// webdriver method
	public static WebDriver driver;

// browser type and location
	public static WebDriver getBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Amudhan\\eclipse-workspace\\Maven_Project\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();

		}

		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Amudhan\\eclipse-workspace\\Maven_Project\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		driver.manage().window().maximize(); // maximize
		return driver;

	}

	// url get launch method
	public static void geturl(String url) {
		driver.get(url);

	}

	// click
	public static void clickonElement(WebElement element) {
		element.click();

	}

	// sendkeys
	public static void inputText(WebElement element, String value) {
		element.sendKeys(value);

	}

	// clear
	public static void clear(WebElement element) {
		element.clear();

	}

	// close
	public static WebDriver close() {
		driver.close();
		return driver;
		

	}

	// quit
	public static void quit() {
		driver.quit();

	}

	// drop down
	public static void dropdown(WebElement element, String type, String value) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("byvalue")) {
			s.selectByValue(value);

		} else if (type.equalsIgnoreCase("byindex")) {
			int data = Integer.parseInt(value);
			s.selectByIndex(data);

		} else if (type.equalsIgnoreCase("byvisibletext")) {
			s.selectByVisibleText(value);

		}

	}

	// navigateto
	public static void navigateto(String url) {
		driver.navigate().to(url);

	}

	// navigateback

	public void navigateback() {
		driver.navigate().back();

	}

	// navigate forward
	public static void navigateforward() {
		driver.navigate().forward();

	}

	// refresh
	public static void refresh() {
		driver.navigate().refresh();

	}

	// alert -accept, dismiss, prompt

	public void accept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	public void dismiss() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();

	}

	public void prompt() {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("text");
		alert.accept();

	}

	// mainpage to frame
	public static void frames() {
		driver.switchTo().frame("frameElement");

	}

	// frame to mainpage
	public static void iframe() {
		driver.switchTo().defaultContent();

	}

	// frame child to parent
	public static void parentframe() {
		driver.switchTo().parentFrame();

	}

	// window handles
	public static void windowhandling() throws AWTException {
		Actions ac = new Actions(driver);
		Robot rb = new Robot();

	}

	// isdisplayed
	public static void isdisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		System.out.println(displayed);

	}

	// isenabled
	public static void isenabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);

	}

	// isselected
	public static void isselected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);

	}

	// getoption
	public static void getoption(WebElement element) {

		Select s1 = new Select(element);
		List<WebElement> alloptions = s1.getOptions();
		for (WebElement all : alloptions) {
			String text = all.getText();
			System.out.println(text);

		}

	}

	// getallselectedoptions
	public static void getallselectedoptions(WebElement element) {
		Select s2 = new Select(element);
		List<WebElement> allSelectedOptions = s2.getAllSelectedOptions();
		for (WebElement selected : allSelectedOptions) {
			String text2 = selected.getText();
			System.out.println(text2);

		}

	}

	// get title

	public static void gettitle() {
		driver.getTitle();

	}

	// get current url
	public static void currenturl() {
		driver.getCurrentUrl();

	}

	// takescreenshot

	public static void screenshot(String value) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(value);
		FileUtils.copyFile(src, des);

	}

	// window handles

	public static void windowhandles() {
		Set<String> windowHandles = driver.getWindowHandles();

	}

	// action

	public static void actions() throws AWTException {
		Actions ac = new Actions(driver);
		Robot rb = new Robot();

	}

	// js executor

	public static void jsClick(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click()", element);

	}

}
