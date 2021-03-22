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

WebUI.setText(findTestObject('CorpCreateProfile/input_Username_username'), 'jyoti')

WebUI.setEncryptedText(findTestObject('CorpCreateProfile/input_Password_password'), 'GyCl7AcNtYA=')

WebUI.click(findTestObject('CorpCreateProfile/input_Corporate Client_checkbox-switch ng-p_369b5c'))

WebUI.click(findTestObject('CorpCreateProfile/button_Sign In'))

WebUI.click(findTestObject('CorpCreateProfile/a_Profile'))

WebUI.click(findTestObject('CorpCreateProfile/button_Create'))

WebUI.setText(findTestObject('CorpCreateProfile/input_Profile Name_name'), 'AllRoleProf')

WebUI.setText(findTestObject('CorpCreateProfile/textarea_Description_description'), 'test')

WebUI.click(findTestObject('CorpCreateProfile/span_Accounts_eb-checkbox-icon - Accounts'))

WebUI.click(findTestObject('CorpCreateProfile/span_Accounts_eb-checkbox-icon - IPS'))

WebUI.click(findTestObject('CorpCreateProfile/span_Accounts_eb-checkbox-icon - IntraBank'))

WebUI.click(findTestObject('CorpCreateProfile/span_Accounts_eb-checkbox-icon - Salary'))

WebUI.click(findTestObject('CorpCreateProfile/span_Accounts_eb-checkbox-icon - Employee'))

WebUI.click(findTestObject('CorpCreateProfile/span_Accounts_eb-checkbox-icon - IBFT'))

WebUI.click(findTestObject('CorpCreateProfile/span_Accounts_eb-checkbox-icon - Esewa'))

WebUI.click(findTestObject('CorpCreateProfile/span_Payee Account Type_eb-checkbox-icon'))

WebUI.click(findTestObject('CorpCreateProfile/span_Accounts_eb-checkbox-icon - Services'))

WebUI.click(findTestObject('CorpCreateProfile/span_Accounts_eb-checkbox-icon - Utility'))

WebUI.click(findTestObject('CorpCreateProfile/span_Accounts_eb-checkbox-icon - SalaryTxn'))

WebUI.scrollToElement(findTestObject('CorpCreateProfile/button_Create Profile'), 3)

WebUI.click(findTestObject('CorpCreateProfile/button_Create Profile'))

WebUI.click(findTestObject('CorpCreateProfile/div_Corporate Profile Success Created Close'))

WebUI.verifyTextPresent('Corporate Profile Success Created', false)

