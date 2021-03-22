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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://expressbanking.f1soft.com.np/admin/#/login')

WebUI.setText(findTestObject('createCustomer/input_F1Soft International_username'), 'Divya')

WebUI.setEncryptedText(findTestObject('createCustomer/input_F1Soft International_password'), 'GyCl7AcNtYA=')

WebUI.click(findTestObject('AdminLoginExpress Banking/button_Login'))

WebUI.click(findTestObject('createCorporate/div_Corporate_mCSB_dragger_bar'))

WebUI.click(findTestObject('createCorporate/a_Corporate'))

WebUI.click(findTestObject('createCorporate/a_Create'))

WebUI.setText(findTestObject('createCorporate/input_Account Number_accountNumber'), '00100200029792000001  ')

WebUI.click(findTestObject('createCorporate/button_Verify'))

WebUI.click(findTestObject('createCorporate/div_Mobile Number'))

WebUI.setText(findTestObject('createCorporate/input_Mobile Number_mobile'), '9869225550')

WebUI.setText(findTestObject('createCorporate/input_Email_email'), 'divyadev.f1soft@gmail.com')

WebUI.click(findTestObject('createCorporate/button_Proceed'))

WebUI.click(findTestObject('createCorporate/span_Select or Search Profile'))

WebUI.click(findTestObject('createCorporate/div_QA corporate'))

WebUI.setText(findTestObject('createCorporate/input_Username_userName'), 'kalpana')

WebUI.click(findTestObject('createCorporate/span_Select or Search Password Delivery Type'))

WebUI.click(findTestObject('createCorporate/div_SMS AND EMAIL'))

WebUI.click(findTestObject('createCorporate/span_Select or Search Primary Account'))

WebUI.click(findTestObject('createCorporate/div_00100200029792000001'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('createCorporate/button_Proceed - Copy'), 3)

WebUI.click(findTestObject('createCorporate/button_Proceed - Copy'))

WebUI.click(findTestObject('createCorporate/button_Done'))

WebUI.verifyTextPresent('Corporate Client Successfully created', false)

