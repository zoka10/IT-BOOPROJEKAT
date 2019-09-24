package page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HumanityHome;

public class HumanityMainHome {
	public static void Metoda() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

//go to website 
		String url = "https://www.humanity.com/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		HumanityHome.getLoginButton(driver);
		HumanityHome.clickLoginButton(driver);

		HumanityHome.fillMailLogInput(driver, "jiseceme@mail-card.net");
		HumanityHome.fillPasswordInput(driver, "broj123");
		HumanityHome.clickLogButton(driver);
//		HumanityHome.clickLogoutButton(driver);
//		HumanityHome.clickSingButton(driver);
		Thread.sleep(3000);
		driver.quit();
		
	}
}
