import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('/Users/user123/Downloads/com.bareksa.app_2023-06-27.apk', true)

Mobile.tap(findTestObject('Object Repository/Login_Valid_Credentials/android.widget.Button - Login'), 0)

Mobile.setText(findTestObject('Object Repository/Login_Valid_Credentials/android.widget.EditText - Contoh emailgmail.com'), 
    'melindalvionita27@gmail.com', 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Login_Valid_Credentials/android.widget.EditText - Masukkan Password'), 
    'ptP751IrPEi6t1HYxEI+og==', 0)

Mobile.verifyElementVisible(findTestObject('Object Repository/Login_Valid_Credentials/android.widget.Button - Login (1)'), 
    0)

Mobile.closeApplication()

