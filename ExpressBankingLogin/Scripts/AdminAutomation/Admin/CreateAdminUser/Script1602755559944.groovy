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

WebUI.callTestCase(findTestCase('AdminAutomation/Admin/AdminLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('createAdminUser/div_Corporate_mCSB_dragger_bar'))

WebUI.click(findTestObject('createAdminUser/a_Admin'))

WebUI.click(findTestObject('createAdminUser/a_Create'))

WebUI.setText(findTestObject('createAdminUser/input_Name_name'), 'DivyaDev')

WebUI.click(findTestObject('createAdminUser/i_Gender_mdi mdi-gender-male'))

WebUI.setText(findTestObject('createAdminUser/input_Mobile Number_mobile'), '9869225550')

WebUI.setText(findTestObject('createAdminUser/input_Email_email'), 'divyadev.f1soft@gmail.com')

WebUI.click(findTestObject('createAdminUser/button_Proceed'))

WebUI.click(findTestObject('createAdminUser/span_Select or Search Branch'))

WebUI.click(findTestObject('createAdminUser/div_Main Branch'))

WebUI.click(findTestObject('createAdminUser/a_Profile_select2-choice ui-select-match ng_5db0d6'))

WebUI.click(findTestObject('createAdminUser/div_TESTADMIN'))

WebUI.click(findTestObject('createAdminUser/i_Is Central Controller_mdi mdi-account'))

WebUI.setText(findTestObject('createAdminUser/input_Username_userName'), 'Katalon121')

WebUI.click(findTestObject('createAdminUser/span_Select or Search Password Delivery Type'))

WebUI.click(findTestObject('createAdminUser/div_SMS AND EMAIL'))

WebUI.click(findTestObject('createAdminUser/button_Proceed_1'))

WebUI.click(findTestObject('createAdminUser/button_Done'))

WebUI.verifyTextPresent('Admin Successfully created', false)

