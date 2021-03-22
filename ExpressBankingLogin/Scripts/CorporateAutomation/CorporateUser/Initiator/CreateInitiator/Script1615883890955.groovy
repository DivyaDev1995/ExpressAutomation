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

WebUI.setText(findTestObject('createCorporateInitiator/input_Username_username'), 'jyoti')

WebUI.setEncryptedText(findTestObject('createCorporateInitiator/input_Password_password'), 'GyCl7AcNtYA=')

WebUI.click(findTestObject('createCorporateInitiator/input_Corporate Client_checkbox-switch ng-p_369b5c'))

WebUI.click(findTestObject('createCorporateInitiator/button_Sign In'))

WebUI.click(findTestObject('createCorporateInitiator/a_User'))

WebUI.click(findTestObject('createCorporateInitiator/span_Create'))

WebUI.setText(findTestObject('createCorporateInitiator/input_Name_name'), 'DivyaDev')

WebUI.click(findTestObject('createCorporateInitiator/input_Date Of Birth_dob'))

WebUI.click(findTestObject('createCorporateInitiator/a_1'))

WebUI.setText(findTestObject('createCorporateInitiator/input_Mobile Number_mobile'), '9869225550')

WebUI.setText(findTestObject('createCorporateInitiator/input_Email_email'), 'divyadev.f1soft@gmail.com')

WebUI.setText(findTestObject('createCorporateInitiator/input_Address_address'), 'Kathmandu')

WebUI.click(findTestObject('createCorporateInitiator/button_Proceed - Details'))

WebUI.click(findTestObject('createCorporateInitiator/i_Approver_ebc ebc-employee'))

WebUI.selectOptionByValue(findTestObject('createCorporateInitiator/select_SELECT                              _7fa501'), 
    '5', true)

WebUI.setText(findTestObject('createCorporateInitiator/input_Username_userName (1)'), 'initiator-kaatlon')

WebUI.selectOptionByValue(findTestObject('createCorporateInitiator/select_SELECT                              _266ee7'), 
    'SMS_AND_EMAIL', true)

WebUI.click(findTestObject('createCorporateInitiator/span_OTP SMS_eb-radio-icon'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('createCorporateInitiator/button_Proceed'), 3)

WebUI.click(findTestObject('createCorporateInitiator/button_Proceed'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('createCorporateInitiator/button_Proceed_1'), 3)

WebUI.click(findTestObject('createCorporateInitiator/button_Proceed_1'))

WebUI.click(findTestObject('createCorporateInitiator/button_Done'))

WebUI.verifyTextPresent('Corporate User Successfully created', false)

