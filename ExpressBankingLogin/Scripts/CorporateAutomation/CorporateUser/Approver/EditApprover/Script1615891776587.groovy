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

WebUI.setText(findTestObject('editApproverPage_Express Banking/input_Username_username'), 'jyoti')

WebUI.setEncryptedText(findTestObject('editApproverPage_Express Banking/input_Password_password'), 'GyCl7AcNtYA=')

WebUI.click(findTestObject('editApproverPage_Express Banking/input_Corporate Client_checkbox-switch ng-p_369b5c'))

WebUI.click(findTestObject('editApproverPage_Express Banking/button_Sign In'))

WebUI.click(findTestObject('editApproverPage_Express Banking/a_User'))

WebUI.click(findTestObject('editApproverPage_Express Banking/button_Manage'))

WebUI.click(findTestObject('editApproverPage_Express Banking/i_Approver_ebc ebc-pencil'))

WebUI.click(findTestObject('editApproverPage_Express Banking/div_Address_column large-7'))

WebUI.setText(findTestObject('editApproverPage_Express Banking/input_Address_address'), 'Lalitpur')

WebUI.click(findTestObject('editApproverPage_Express Banking/button_Proceed'))

WebUI.selectOptionByValue(findTestObject('editApproverPage_Express Banking/select_---SELECT ONE---Profile1Profile2ALLR_6f7ef3'), 
    'number:5', true)

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('editApproverPage_Express Banking/button_Proceed - setup'), 3)

WebUI.click(findTestObject('editApproverPage_Express Banking/button_Proceed - setup'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('editApproverPage_Express Banking/button_Proceed_1'), 3)

WebUI.click(findTestObject('editApproverPage_Express Banking/button_Proceed_1'))

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('editApproverPage_Express Banking/button_Done'), 3)

WebUI.click(findTestObject('editApproverPage_Express Banking/button_Done'))

