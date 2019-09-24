package page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HumanityHome;
import page.objects.HumanityStaff;

public class HumanityMainAdd {
	public static void Metodadruga() {
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
		
		HumanityHome.getLoginButton(driver);
		HumanityHome.clickLoginButton(driver);

		HumanityHome.fillMailLogInput(driver, "jiseceme@mail-card.net");
		HumanityHome.fillPasswordInput(driver, "broj123");
		HumanityHome.clickLogButton(driver);
		HumanityStaff.clickStafeButton(driver);
		HumanityStaff.clickAddEButton(driver);
		HumanityStaff.fillNameInput(driver, "Pera");
		HumanityStaff.fillLastNameInput(driver, "Peric");
		HumanityStaff.fillEEMAILInput(driver, "peraperic@gmail.com");
	}

}
