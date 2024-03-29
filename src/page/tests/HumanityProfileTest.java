package page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.objects.HumanityHome;
import page.objects.HumanityProfile;

public class HumanityProfileTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String url = "https://www.humanity.com/";
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		// logovanje
		Thread.sleep(3000);
//		HumanityHome.getLoginButton(driver);
		HumanityHome.clickLoginButton(driver);
		HumanityHome.fillMailLogInput(driver, "jiseceme@mail-card.net");
		HumanityHome.fillPasswordInput(driver, "broj123");
		HumanityHome.clickLogButton(driver);
		Thread.sleep(3000);

		// opadajuci meni
//		HumanityProfile.getMenuButton(driver);
		HumanityProfile.clickMenuButton(driver);
		Thread.sleep(3000);

		// profil i vrati se na stranu
//		HumanityProfile.getProfileButton(driver);
		HumanityProfile.clickProfileButton(driver);
		Thread.sleep(3000);
		driver.navigate().back();

		// podesavanje i vrati se na stranu
//		HumanityProfile.getMenuButton(driver);
		HumanityProfile.clickMenuButton(driver);
		Thread.sleep(3000);
//		HumanityProfile.getSettingsButton(driver);
		HumanityProfile.clickSettingsButton(driver);
		Thread.sleep(3000);
		driver.navigate().back();

//		prisustvo i vrati se na stranu
//		HumanityProfile.getMenuButton(driver);
		HumanityProfile.clickMenuButton(driver);
		Thread.sleep(3000);
//		HumanityProfile.getAvailabiilityButton(driver);
		HumanityProfile.clickAvailabiilityButton(driver);
		Thread.sleep(3000);
		driver.navigate().back();

//		verzija app
//		HumanityProfile.getMenuButton(driver);
		HumanityProfile.clickMenuButton(driver);
		Thread.sleep(3000);
//		HumanityProfile.getVersionButton(driver);
		HumanityProfile.clickVersionButton(driver);

//		odlogovanje
//		HumanityProfile.getSingButton(driver);
		HumanityProfile.clickSingButton(driver);
		
		Thread.sleep(3000);
		driver.quit();
	}

}
