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

WebUI.click(findTestObject('editCorporate/div_Corporate_mCSB_dragger_bar'))

WebUI.click(findTestObject('editCorporate/a_Corporate'))

WebUI.click(findTestObject('editCorporate/a_Manage'))

WebUI.click(findTestObject('editCorporate/i_EDIT_APPROVE_mdi mdi-pencil'))

WebUI.click(findTestObject('editCorporate/div_Name                                   _b0028a'))

WebUI.setText(findTestObject('editCorporate/input_Name_name'), 'Bishal')

WebUI.click(findTestObject('editCorporate/div_Address'))

WebUI.setText(findTestObject('editCorporate/input_Address_address'), 'Kathmandu')

WebUI.click(findTestObject('editCorporate/button_Proceed'))

WebUI.click(findTestObject('editCorporate/button_Proceed_1'))

WebUI.click(findTestObject('editCorporate/button_Done'))

WebUI.verifyTextPresent('Corporate Client Successfully Updated', false)

