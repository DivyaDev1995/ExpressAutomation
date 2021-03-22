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

WebUI.navigateToUrl('https://expressbanking.f1soft.com.np/corporate/#/dashboard')

WebUI.setText(findTestObject('Corp_assign_Profile_and_Approver/input_Username_username'), 'jyoti')

WebUI.setEncryptedText(findTestObject('Corp_assign_Profile_and_Approver/input_Password_password'), 'GyCl7AcNtYA=')

WebUI.click(findTestObject('Corp_assign_Profile_and_Approver/input_Corporate Client_checkbox-switch ng-p_369b5c - Logintoggle'))

WebUI.click(findTestObject('Corp_assign_Profile_and_Approver/button_Sign In'))

WebUI.click(findTestObject('Corp_assign_Profile_and_Approver/a_Transaction Management'))

WebUI.click(findTestObject('Corp_assign_Profile_and_Approver/button_Manage'))

WebUI.click(findTestObject('Corp_assign_Profile_and_Approver/i_CREATE APPROVE_ebc ebc-pencil'))

WebUI.selectOptionByValue(findTestObject('Corp_assign_Profile_and_Approver/select_---SELECT ONE PROFILE--- Profile1Pro_6b44d0'), 
    'number:7', true)

WebUI.setText(findTestObject('Corp_assign_Profile_and_Approver/input_Required number of Approvers_number'), '1')

WebUI.click(findTestObject('Corp_assign_Profile_and_Approver/input_Corporate Client_checkbox-switch ng-p_369b5c'))

WebUI.click(findTestObject('Corp_assign_Profile_and_Approver/input_Corporate Client_checkbox-switch ng-p_369b5c - Hierarchy'))

WebUI.click(findTestObject('Corp_assign_Profile_and_Approver/div_ExpressApp'))

WebUI.click(findTestObject('Corp_assign_Profile_and_Approver/div_ExpressApp - selectApprover'))

WebUI.click(findTestObject('Corp_assign_Profile_and_Approver/button_Submit'))

WebUI.verifyTextPresent('Profile Added or Updated', false)

