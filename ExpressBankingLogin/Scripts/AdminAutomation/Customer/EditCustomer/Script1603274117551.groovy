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

WebUI.setText(findTestObject('editCustomer/input_F1Soft International_username'), 'Divya')

WebUI.setEncryptedText(findTestObject('editCustomer/input_F1Soft International_password'), 'GyCl7AcNtYA=')

WebUI.click(findTestObject('editCustomer/button_Login'))

WebUI.click(findTestObject('editCustomer/div_Corporate_mCSB_dragger_bar'))

WebUI.click(findTestObject('editCustomer/a_Customer'))

WebUI.click(findTestObject('editCustomer/a_Manage'))

WebUI.click(findTestObject('editCustomer/i_EDIT APPROVE_mdi mdi-pencil'))

WebUI.click(findTestObject('editCustomer/input_Date Of Birth_dob'))

WebUI.click(findTestObject('editCustomer/a_6'))

WebUI.click(findTestObject('editCustomer/button_Proceed'))

WebUI.click(findTestObject('editCustomer/button_Proceed_1'))

WebUI.click(findTestObject('editCustomer/button_Done'))

WebUI.verifyTextPresent('Customer Successfully Updated', false)

