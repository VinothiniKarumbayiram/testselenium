package com.selenium.test.maven_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MavenProject {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/selenium chrome/New folder/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://connect.maveric-systems.com/index.php/site/login");
		driver.findElement(By.id("LoginForm_username")).sendKeys("vinothinik");
		driver.findElement(By.id("LoginForm_password")).sendKeys("Vino@321");
		driver.findElement(By.name("yt0")).click();
	}
}

