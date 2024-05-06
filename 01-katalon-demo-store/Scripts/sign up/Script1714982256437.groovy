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

WebUI.disableSmartWait()

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://demo-store.katalon.com/')

WebUI.enableSmartWait()

WebUI.verifyElementPresent(findTestObject('Page_Zack Market/svg_Zack Market_svg-inline--fa fa-user fa-w-14'), 3)

WebUI.click(findTestObject('Page_Zack Market/svg_Zack Market_svg-inline--fa fa-user fa-w-14'))

WebUI.verifyElementPresent(findTestObject('Page_Zack Market/a_Sign Up'), 3)

WebUI.click(findTestObject('Object Repository/Page_Zack Market/a_Sign Up'))

WebUI.verifyElementPresent(findTestObject('Page_Zack Market/input_Required_button_btn__1gz9J'), 3)

WebUI.disableSmartWait()

WebUI.setText(findTestObject('Page_Zack Market/input_Full name_fullname'), 'tuan tran')

WebUI.setText(findTestObject('Page_Zack Market/input_Email_email'), 'tuannt393@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Zack Market/input_Password_password'), 'vckfKYHQ/X5a0LrHpsIEKA==')

WebUI.setEncryptedText(findTestObject('Page_Zack Market/input_Verify password_verifyPassword'), 'vckfKYHQ/X5a0LrHpsIEKA==')

WebUI.click(findTestObject('Page_Zack Market/input_Required_button_btn__1gz9J'))

WebUI.enableSmartWait()

WebUI.verifyElementPresent(findTestObject('Page_Zack Market/input_Required_button_btn_sign_in'), 3)

WebUI.closeBrowser()

