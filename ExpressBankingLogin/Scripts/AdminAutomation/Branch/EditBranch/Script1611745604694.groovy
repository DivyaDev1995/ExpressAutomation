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

WebUI.setText(findTestObject('editBranch/editBranch/input_F1Soft International_username'), 'Divya')

WebUI.setEncryptedText(findTestObject('editBranch/editBranch/input_F1Soft International_password'), 
    'qD5Tvn69MUw=')

WebUI.click(findTestObject('editBranch/editBranch/button_Login'))

WebUI.click(findTestObject('editBranch/editBranch/span_Branch'))

WebUI.click(findTestObject('editBranch/editBranch/span_Manage'))

WebUI.click(findTestObject('editBranch/editBranch/i_CREATE APPROVE_mdi mdi-pencil'))

WebUI.click(findTestObject('editBranch/editBranch/div_Branch Manager_column medium-6'))

WebUI.setText(findTestObject('editBranch/editBranch/input_Branch Manager_branchManager'), 'Milinda Shakya')

WebUI.click(findTestObject('editBranch/editBranch/button_Update'))

WebUI.click(findTestObject('editBranch/editBranch/div_Branch successfully updated'))

WebUI.verifyTextPresent('Branch successfully updated.', false)

