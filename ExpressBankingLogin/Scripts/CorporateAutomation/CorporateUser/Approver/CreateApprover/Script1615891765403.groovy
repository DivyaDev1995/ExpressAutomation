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

WebUI.navigateToUrl('https://expressbanking.f1soft.com.np/corporate/#/login')

WebUI.setText(findTestObject('createApprover/input_Username_username'), 'jyoti')

WebUI.setEncryptedText(findTestObject('createApprover/input_Password_password'), 'GyCl7AcNtYA=')

WebUI.click(findTestObject('createApprover/input_Corporate Client_checkbox-switch ng-p_369b5c'))

WebUI.click(findTestObject('createApprover/button_Sign In'))

WebUI.click(findTestObject('createApprover/a_User'))

WebUI.click(findTestObject('createApprover/span_Create'))

WebUI.setText(findTestObject('createApprover/input_Name_name'), 'DivyaDev')

WebUI.click(findTestObject('createApprover/input_Date Of Birth_dob'))

WebUI.click(findTestObject('createApprover/a_1'))

WebUI.setText(findTestObject('createApprover/input_Mobile Number_mobile'), '9869225550')

WebUI.setText(findTestObject('createApprover/input_Email_email'), 'divyadev.f1soft@gmail.com')

WebUI.setText(findTestObject('createApprover/input_Address_address'), 'Kathmandu')

WebUI.click(findTestObject('createApprover/button_Proceed'))

WebUI.click(findTestObject('createApprover/span_User Type_eb-radio-icon'))

WebUI.selectOptionByValue(findTestObject('createApprover/select_SELECT                              _7fa501'), '5', true)

WebUI.setText(findTestObject('createApprover/input_Username_userName (1)'), 'katalon-approver')

WebUI.selectOptionByValue(findTestObject('createApprover/select_SELECT                              _266ee7'), 'SMS_AND_EMAIL', 
    true)

WebUI.click(findTestObject('createApprover/i_OTP SMS_mdi mdi-cellphone-settings'))

WebUI.click(findTestObject('createApprover/span_OTP SMS_eb-radio-icon'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('createApprover/button_Proceed - setup'), 3)

WebUI.click(findTestObject('createApprover/button_Proceed - setup'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('createApprover/button_Proceed_1'), 3)

WebUI.click(findTestObject('createApprover/button_Proceed_1'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('createApprover/button_Done'), 3)

WebUI.click(findTestObject('createApprover/button_Done'))

WebUI.verifyTextPresent('Corporate User Successfully created', false)

