package stepDefinition;
import org.openqa.selenium.WebDriver;
import com.nabati.UIconstants.LoginPageUI;
import com.nabati.library.CommonLibrary;
import io.cucumber.java.en.*;

public class LoginStepsDefinitions {
	private WebDriver driver = CommonLibrary.getDriver();
	private LoginPageUI loginPage = new LoginPageUI(driver);
	
	@Given("I Navigate To The Tokopedia Website")
	public void iNavigationToTheTokopediaWebsite() {
		driver.get("https://www.tokopedia.com/");
	}
	
	@And("I Click Button Masuk Login")
	public void iClickButtonMasukLogin() {
		driver.navigate().refresh();
		loginPage.iClickButtonMasuk();
	}
	
	@When("^I Enter Phone Number Or Email \"([^\"]*)\"$")
	public void iEnterNumberPhoneEmail(String fieldNumberPhoneEmail) {
		loginPage.setNumberPhoneEmail(fieldNumberPhoneEmail);
	}
	
	@When("^I Enter Password \"([^\"]*)\"$")
	public void iEnterPassword(String fieldEnterPassword) {
		loginPage.setEnterPassword(fieldEnterPassword);
	}
	
	@And("I Click Button Login After Input Email & Password")
	public void iClickButtonLoginAfterInputEmail() {
		loginPage.clickLoginButtonEmail();
	}
	
	@And("I Click Button Login or Selanjutnya")
	public void iClickButtonLoginOrSelanjutnya() {
		loginPage.clickLoginButton();
	}
	
	@And("I Click Verifikasi Login By SMS")
	public void iSelectVerifikasiLoginBySMS() throws InterruptedException {
		loginPage.verifikasiLoginBySMS();
	}
	
	@And("I Click Locator Button Not Found")
	public void iClickLocatorButtonNotFound() {
		loginPage.failedFoundBugLogin();
		driver.close();
		driver.quit();
	}
	
	@Then("Verify Result Message Displayed After Login Number Phone And Close Modal PopUp")
	public void testTextAssertion() throws InterruptedException {
		loginPage.testTextAssertion();
	}
	
	@Then("Verify Result Message Displayed After Login Email And Close Modal PopUp")
	public void testTextAssertionResultGagalProses() throws InterruptedException {
		loginPage.testTextAssertionResultGagalProses();
	}
	
}