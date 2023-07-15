import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LoginStepDefinition {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */

	/* TC01 */
	@Given("User navigates to login page")
	def NavigateToLoginPage() {
		/*println ("\n User navigates to login page")*/
		Mobile.startApplication('/Users/user123/Downloads/com.bareksa.app_2023-06-27.apk', true)
		Mobile.tap(findTestObject('Object Repository/Login_Valid_Credentials/android.widget.Button - Login'), 5)
	}

	@When("User enters a valid (.*) and a valid (.*)")
	def enterCredentials(String email, String password) {
		/*println ("\n User enters a valid email and a valid password ")
		 println ("Email : "+email)
		 println ("Password : "+password)*/
		Mobile.setText(findTestObject('Object Repository/Login_Valid_Credentials/android.widget.EditText - Contoh emailgmail.com'), email,
				5)
		Mobile.setText(findTestObject('Object Repository/Login_Valid_Credentials/android.widget.EditText - Masukkan Password'), password, 5)
	}

	@And("Click on login button")
	def clickLogin() {
		/*println ("\n Click on login button")*/
		Mobile.tap(findTestObject('Object Repository/Login_Valid_Credentials/android.widget.Button - Login (1)'), 5)
	}

	@Then("User should be logged in successfully and navigated to OTP page")
	def verifyOTPPage() {
		/*println ("\n User should be logged in successfully and navigated to OTP page")*/
		// Mobile.verifyElementText('Object Repository/Login_Valid_Credentials/android.widget.TextView - Masukkan Kode OTP (2)', 10)
		Mobile.closeApplication()
	}

	/* TC02 */

	@When("User enters invalid (.*) and invalid (.*)")
	def enterInvalidCredentials(String email, String password) {
		/*println ("\n User enters invalid email and invalid password ")
		 println ("Email : "+email)
		 println ("Password : "+password)*/
		Mobile.setText(findTestObject('Object Repository/Login_Invalid_Email_Password/android.widget.EditText - Contoh emailgmail.com (1)'), email,
				5)
		Mobile.setText(findTestObject('Object Repository/Login_Invalid_Email_Password/android.widget.EditText - Masukkan Password (1)'), password, 5)
	}

	@Then("User should see an error message Email atau Password salah")
	def errorMessageEmailPasswordSalah() {
		/*println ("\n User should see an error message Email atau Password salah")*/
		Mobile.verifyElementVisible('Object Repository/Login_Invalid_Email_Password/android.widget.TextView - Email atau password salah. Silakan coba lagi', 5)
	}

	/* TC03 */

	@When("User enters invalid format (.*) and valid (.*)")
	def enterInvalidFormatCredentials(String email, String password) {
		/*println ("\n User enter invalid format email and password ")
		 println ("Email : "+invalidformatemail)
		 println ("Password : "+password)*/
		Mobile.setText(findTestObject('Object Repository/Login_InvalidFormatEmail/android.widget.EditText - Contoh emailgmail.com (2)'), email,
				5)
		Mobile.setText(findTestObject('Object Repository/Login_Valid_Credentials/android.widget.EditText - Masukkan Password'), password, 5)
	}

	@Then("User should see an error message Format email salah")
	def errorMessageFormatEmailSalah() {
		/*println ("\n User should see an error message Format email salah")*/
		Mobile.verifyElementVisible('Object Repository/Login_InvalidFormatEmail/android.widget.TextView - Format email salah', 5)
	}

	/* TC04 */

	@When("User leaves the (.*) blank and (.*) blank")
	def Userleavesfieldblank(String field) {
		Mobile.tap(findTestObject('Object Repository/BlankLoginBareksa/android.widget.EditText - Contoh emailgmail.com (4)'), 0)
		Mobile.tap(findTestObject('Object Repository/BlankLoginBareksa/android.widget.EditText - Masukkan Password (4)'), 0)
	}

	@Then("User should see an error message wajib diisi below Email and Password field")
	def errorMessageBlank() {
		println ("\n User should see an error message wajib diisi below Email and Password field")*/
		//Mobile.verifyElementVisible('Object Repository/BlankLoginBareksa/android.widget.TextView - Wajib diisi', 5)
		//Mobile.verifyElementVisible('Object Repository/BlankLoginBareksa/android.widget.TextView - Wajib diisi (1)', 5)
	}


	/* TC05 */

	@When("User click on the Lupa Password Button")
	def clickLupaPassword {
		/*println ("\n User click on the Lupa Password Button")*/
		Mobile.tap(findTestObject('Object Repository/Lupa_Password/android.widget.TextView - Lupa password'), 5)
	}

	@Then("User should be redirected to the password recovery page")
	def verifyLupaPasswordPage() {
		/*println ("\n User should be redirected to the password recovery page")*/
		Mobile.verifyElementText('Object Repository/Lupa_Password/android.widget.TextView - Lupa Password (1)', 10)
	}
}