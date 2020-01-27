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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.deleteAllCookies()

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://devauth.kode.id/signin')

WebUI.setText(findTestObject('Object Repository/Dev_SignInHO/Page_HACKTIV8 Online - Authentication/input_atau_css-1cahi4q'), 
    'kodetesting04@yahoo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Dev_SignInHO/Page_HACKTIV8 Online - Authentication/input_atau_css-1cahi4q_1'), 
    '5N7hhBwerqY1X/rpp9tfWQ==')

WebUI.click(findTestObject('Object Repository/Dev_SignInHO/Page_HACKTIV8 Online - Authentication/button_sign in'))

WebUI.click(findTestObject('Dev_SignInHO/Page_HACKTIV8 Online/Page_HACKTIV8 Online/a_Detail program'))

WebUI.click(findTestObject('Object Repository/Dev_SignInHO/Page_HACKTIV8 Online/img_my campus_css-21qrqs'))

WebUI.click(findTestObject('Dev_SignInHO/Page_HACKTIV8 Online/Page_HACKTIV8 Online/a_Detail program'))

WebUI.click(findTestObject('Object Repository/Dev_SignInHO/Page_HACKTIV8 Online/a_my campus'))

WebUI.click(findTestObject('Object Repository/Dev_SignInHO/Page_HACKTIV8 Online/div_AY'))

WebUI.click(findTestObject('Object Repository/Dev_SignInHO/Page_HACKTIV8 Online/button_sign out'))

