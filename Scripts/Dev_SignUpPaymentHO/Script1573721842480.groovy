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

WebUI.navigateToUrl('http://dummy-hacktiv8.kode.id.s3-website-ap-southeast-1.amazonaws.com/')

WebUI.click(findTestObject('Object Repository/Dev_SignUpPaymentTBHO/Page_/a_Daftar Sekarang'))

WebUI.setText(findTestObject('Object Repository/Dev_SignUpPaymentTBHO/Page_HACKTIV8 Online - Authentication/input_atau_css-1cahi4q'), 
    'Pocheski')

WebUI.setText(findTestObject('Object Repository/Dev_SignUpPaymentTBHO/Page_HACKTIV8 Online - Authentication/input_atau_css-1cahi4q_1'), 
    'Schawazie')

WebUI.setText(findTestObject('Object Repository/Dev_SignUpPaymentTBHO/Page_HACKTIV8 Online - Authentication/input_atau_css-1cahi4q_1_2'), 
    'kodetesting08@hotmail.com')

WebUI.setText(findTestObject('Object Repository/Dev_SignUpPaymentTBHO/Page_HACKTIV8 Online - Authentication/input_atau_css-1cahi4q_1_2_3'), 
    '087743180151')

WebUI.setEncryptedText(findTestObject('Object Repository/Dev_SignUpPaymentTBHO/Page_HACKTIV8 Online - Authentication/input_atau_css-1cahi4q_1_2_3_4'), 
    '5N7hhBwerqY1X/rpp9tfWQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Dev_SignUpPaymentTBHO/Page_HACKTIV8 Online - Authentication/input_atau_css-1cahi4q_1_2_3_4_5'), 
    '5N7hhBwerqY1X/rpp9tfWQ==')

WebUI.click(findTestObject('Object Repository/Dev_SignUpPaymentTBHO/Page_HACKTIV8 Online - Authentication/div_atau_css-d8zqvr'))

WebUI.click(findTestObject('Object Repository/Dev_SignUpPaymentTBHO/Page_HACKTIV8 Online - Authentication/button_sign up'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Dev_SignUpPaymentTBHO/Page_HACKTIV8 Online - Payment/button_Lanjut Proses Pembayaran'), 
    5)

WebUI.click(findTestObject('Object Repository/Dev_SignUpPaymentTBHO/Page_HACKTIV8 Online - Payment/button_Lanjut Proses Pembayaran'))

WebUI.click(findTestObject('Dev_SignUpPaymentTBHO/Page_HACKTIV8 Online - Payment/Page_HACKTIV8 Online - Payment/button_Lanjut Proses Pembayaran'))

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Dev_SignUpPaymentTBHO/Page_Xendit - Invoice/div_Transfer Bank'))

WebUI.click(findTestObject('Object Repository/Dev_SignUpPaymentTBHO/Page_Xendit - Invoice/div_Kartu_instance-list-row'))

WebUI.click(findTestObject('Object Repository/Dev_SignUpPaymentTBHO/Page_Xendit - Invoice/div_Klik disini untuk simulasi pembayaran d_e05686'))

WebUI.navigateToUrl('https://devauth.kode.id')

WebUI.click(findTestObject('Object Repository/Dev_SignUpPaymentTBHO/Page_HACKTIV8 Online/a_Kembali Ke Home'))

