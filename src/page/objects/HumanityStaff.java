package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityStaff {
	private static final String STAFF = "//a[@id='sn_requests']//span[@class='primNavQtip__inner']";
	private static final String ADDE = "//button[@id='act_primary']";
	private static final String CLIK_NAME = "//a[contains(text(),'')]";
	private static final String NAME = "//input[@id='_asf1']";
	private static final String LASTNAME = "//input[@id='_asl1']";
	private static final String EMAIL = "//input[@id='_ase1']";
	private static final String SAVE = "//button[@id='_as_save_multiple']";

	// da ode na stranicu
	public static WebElement getStafeButton(WebDriver driver) {
		return driver.findElement(By.xpath(STAFF));
	}

	public static void clickStafeButton(WebDriver driver) {
		getStafeButton(driver).click();
	}

	public static WebElement getClikButton(WebDriver driver) {
		return driver.findElement(By.xpath(CLIK_NAME));
	}

	public static void clickClikEButton(WebDriver driver) {
		getClikButton(driver).click();
	}

	// za ovo nisam sigurna da li tako ide
	private static WebElement getClikNameInput(WebDriver driver) {
		return driver.findElement(By.xpath(CLIK_NAME));
	}

	public static void fillClikNameInput(WebDriver driver, String data) {
		getClikNameInput(driver).sendKeys(data);
	}

//da doda zaposlenog
	public static WebElement getAddEButton(WebDriver driver) {
		return driver.findElement(By.xpath(ADDE));
	}

	public static void clickAddEButton(WebDriver driver) {
		getAddEButton(driver).click();
	}

//da ubaci ime
	public static WebElement getNameInput(WebDriver driver) {
		return driver.findElement(By.xpath(NAME));
	}

	public static void fillNameInput(WebDriver driver, String data) {
		getNameInput(driver).sendKeys(data);
	}

//da ubaci prezime
	public static WebElement getLastNameInput(WebDriver driver) {
		return driver.findElement(By.xpath(LASTNAME));
	}

	public static void fillLastNameInput(WebDriver driver, String data) {
		getLastNameInput(driver).sendKeys(data);
	}

//da ubaci mail
	public static WebElement getEEMAILInput(WebDriver driver) {
		return driver.findElement(By.xpath(EMAIL));
	}

	public static void fillEEMAILInput(WebDriver driver, String data) {
		getEEMAILInput(driver).sendKeys(EMAIL);
	}

	// da sacuva
	public static WebElement getSaveButton(WebDriver driver) {
		return driver.findElement(By.xpath(SAVE));
	}

	public static void clickSaveButton(WebDriver driver) {
		getSaveButton(driver).click();
	}
}
