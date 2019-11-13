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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://devauth.kode.id/signin')

WebUI.click(findTestObject('Object Repository/Dev_SignUpHO/Page_HACKTIV8 Online - Authentication/a_daftar sekarang'))

WebUI.setText(findTestObject('Object Repository/Dev_SignUpHO/Page_HACKTIV8 Online - Authentication/input_atau_css-1cahi4q'), 
    'Bimo Setiawan')

WebUI.setText(findTestObject('Object Repository/Dev_SignUpHO/Page_HACKTIV8 Online - Authentication/input_atau_css-1cahi4q_1'), 
    'Almachzumie')

WebUI.setText(findTestObject('Object Repository/Dev_SignUpHO/Page_HACKTIV8 Online - Authentication/input_atau_css-1cahi4q_1_2'), 
    'kodetesting05@yahoo.com')

WebUI.setText(findTestObject('Object Repository/Dev_SignUpHO/Page_HACKTIV8 Online - Authentication/input_atau_css-1cahi4q_1_2_3'), 
    '087743171818')

WebUI.setEncryptedText(findTestObject('Object Repository/Dev_SignUpHO/Page_HACKTIV8 Online - Authentication/input_atau_css-1cahi4q_1_2_3_4'), 
    '5N7hhBwerqY1X/rpp9tfWQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Dev_SignUpHO/Page_HACKTIV8 Online - Authentication/input_atau_css-1cahi4q_1_2_3_4_5'), 
    '5N7hhBwerqY1X/rpp9tfWQ==')

WebUI.click(findTestObject('Object Repository/Dev_SignUpHO/Page_HACKTIV8 Online - Authentication/div_atau_css-d8zqvr'))

WebUI.click(findTestObject('Object Repository/Dev_SignUpHO/Page_HACKTIV8 Online - Authentication/button_sign up'))

WebUI.delay(5)

WebUI.closeBrowser()

