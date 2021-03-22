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

WebUI.setText(findTestObject('unblockCorpUser/input_Username_username'), 'jyoti')

WebUI.setEncryptedText(findTestObject('unblockCorpUser/input_Password_password'), 'GyCl7AcNtYA=')

WebUI.click(findTestObject('unblockCorpUser/input_Corporate Client_checkbox-switch ng-p_369b5c'))

WebUI.click(findTestObject('unblockCorpUser/button_Sign In'))

WebUI.click(findTestObject('unblockCorpUser/a_User'))

WebUI.click(findTestObject('unblockCorpUser/button_Manage'))

WebUI.click(findTestObject('unblockCorpUser/i_Approver_ebc ebc-unlock'))

WebUI.click(findTestObject('unblockCorpUser/button_Unblock'))

WebUI.verifyTextPresent(' CorporateUser of username exApprover3 has been UnBlock ', false)
