package com.SimpleJenkins.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Simple {
	@Test

	public void simple()
	
	{
		System.out.println("Sample Jenkins");
		WebDriver driver=null;
	String browser="chrome";
	String url="httpe://localhost:8888"; 
	switch (browser) {
	case "chrome":
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		break; 
	case"firefox":
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		break;
	case "edge":
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		break;
	default:
		System.out.println("please specify proper browser key");
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		break;
	}
	driver.get(url);
	driver.close();
	}
	

public void simple()
{
	System.out.println("Sample Jenkins hello");
}

}

