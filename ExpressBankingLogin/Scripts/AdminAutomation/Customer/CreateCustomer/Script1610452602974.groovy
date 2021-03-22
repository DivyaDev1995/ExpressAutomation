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

WebUI.click(findTestObject('createCustomer/button_Login'))

WebUI.click(findTestObject('createCorporate/div_Corporate_mCSB_dragger_bar'))

WebUI.click(findTestObject('createCustomer/span_Customer'))

WebUI.click(findTestObject('createCustomer/a_Create'))

WebUI.setText(findTestObject('createCustomer/input_Account Number_accountNumber'), 'GG2234543555NPR')

WebUI.click(findTestObject('createCustomer/button_Verify'))

WebUI.click(findTestObject('createCustomer/div_Name'))

WebUI.setText(findTestObject('createCustomer/input_Name_name'), 'Bishal')

WebUI.click(findTestObject('createCustomer/input_Date Of Birth_dob'))

WebUI.click(findTestObject('createCustomer/a_4'))

WebUI.setText(findTestObject('createCustomer/input_Mobile Number_mobile'), '9869225550')

WebUI.setText(findTestObject('createCustomer/input_Email_email'), 'divyadev.f1soft@gmail.com')

WebUI.setText(findTestObject('createCustomer/input_Primary Address_address'), 'Kathmandu')

WebUI.setText(findTestObject('createCustomer/input_Secondary Address_secondaryAddress'), 'Kathmandu')

WebUI.click(findTestObject('createCustomer/button_Proceed'))

WebUI.click(findTestObject('createCustomer/span_Select or Search Profile'))

WebUI.click(findTestObject('createCustomer/div_QA customer'))

WebUI.setText(findTestObject('createCustomer/input_Username_userName'), 'bishal')

WebUI.click(findTestObject('createCustomer/span_Select or Search Password Delivery Type'))

WebUI.click(findTestObject('createCustomer/div_SMS AND EMAIL'))

WebUI.click(findTestObject('createCustomer/span_Select or Search Primary Account'))

WebUI.click(findTestObject('createCustomer/div_GG2234543555NPR'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('createCustomer/button_Proceed - Copy'), 3)

WebUI.click(findTestObject('createCustomer/button_Proceed - Copy'))

WebUI.click(findTestObject('createCustomer/button_Done'))

WebUI.click(findTestObject('createCustomer/div_Customer Successfully created'))

WebUI.verifyTextPresent('Customer Successfully created', false)

