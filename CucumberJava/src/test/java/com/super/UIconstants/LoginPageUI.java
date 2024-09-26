package com.nabati.UIconstants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class LoginPageUI {
	private WebDriver driver;
	
	// Locators
	private By buttonMasuk = By.xpath("//button[contains(text(),'Masuk')]");
	private By fieldNumberPhoneEmail = By.xpath("//input[@id='email-phone']");
	private By fieldEnterPassword = By.xpath("//input[@id='password-input']");
	private By buttonSelanjutnya = By.xpath("//span[contains(text(),'Selanjutnya')]");
	private By CloseModalView = By.xpath("//button[@aria-label='Tutup tampilan modal']");
	private By cardVerifikasiLogin = By.xpath("//div[@class='unf-card css-1dns7ds-unf-card eh33ozn0']");
	private By buttonLogin = By.xpath("//span[@aria-label='login-button']");
	
	
	public LoginPageUI(WebDriver driver) {
		this.driver = driver;
	}
	
	public void iClickButtonMasuk() {
        driver.findElement(buttonMasuk).click();
    }

    public void setNumberPhoneEmail(String inputPhoneEmail) {
        driver.findElement(fieldNumberPhoneEmail).sendKeys(inputPhoneEmail);
    }
    
    public void setEnterPassword(String inputPassword) {
    	driver.findElement(fieldEnterPassword).sendKeys(inputPassword);
    }

    public void clickLoginButton() {
        driver.findElement(buttonSelanjutnya).click();
    }
    
    public void clickLoginButtonEmail() {
    	driver.findElement(buttonLogin).click();
    }
    
    public void failedFoundBugLogin() {
    	try {
    		WebElement loginButton = driver.findElement(By.xpath("buttonSelanjutnya"));
    		loginButton.click();
    		System.out.println("Login button found and clicked successfully.");
    	} catch (org.openqa.selenium.NoSuchElementException e) {
    		System.out.println("BUG: Login button not found. Check the page structure or element locator.");
    	}
    }
    
    public void verifikasiLoginBySMS() throws InterruptedException {
    	Thread.sleep(2000);
    	Actions actions = new Actions(driver);
    	WebElement element = driver.findElement(By.xpath("//div[@class='unf-card css-1dns7ds-unf-card eh33ozn0']"));
    	actions.moveToElement(element).perform();
    	driver.findElement(cardVerifikasiLogin).click();
    }
    public void testTextAssertion() throws InterruptedException {
    	Thread.sleep(3000);
    	driver.getPageSource().contains("Masukkan Kode Verifikasi");
    	Thread.sleep(3000);
    	driver.findElement(CloseModalView).click();
    }
    
    public void testTextAssertionResultGagalProses() throws InterruptedException {
    	Thread.sleep(3000);
    	driver.getPageSource().contains("Permintaanmu gagal diproses");
    	Actions actions = new Actions(driver);
    	actions.moveByOffset(1155, 250).click().build().perform();
    	Thread.sleep(3000);
    	driver.findElement(CloseModalView).click();
    }
    
    
}
