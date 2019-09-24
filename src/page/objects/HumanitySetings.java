package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HumanitySetings {
	private static final String SETINGS = "//i[@class='primNavQtip__icon icon-gear']";
	private static final String COUNTRY = "//select[@id='country']";
	private static final String LANGUATE = "//select[@name='language']";
	private static final String TIME = "//select[@name='pref_24hr']";
	
//	public static Select getCountry(WebDriver driver) {
//	getCountry(driver).selectByVisibleText(COUNTRY);
//	}
//	public static Select clickCountry(WebDriver driver) {
//		getCountry(driver).selectByVisibleText("Qatar");
//	}
	
	public static WebElement getSetingsButton(WebDriver driver) {
		return driver.findElement(By.xpath(SETINGS));
	}

	public static void clickSetingsButton(WebDriver driver) {
		getSetingsButton(driver).click();
	}
}
