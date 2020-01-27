import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.thoughtworks.selenium.Selenium as Selenium
import org.openqa.selenium.firefox.FirefoxDriver as FirefoxDriver
import org.openqa.selenium.WebDriver as WebDriver
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium as WebDriverBackedSelenium
import static org.junit.Assert.*
import java.util.regex.Pattern as Pattern
import static org.apache.commons.lang3.StringUtils.join

WebUI.openBrowser('http://dummy-hacktiv8.kode.id.s3-website-ap-southeast-1.amazonaws.com/')

WebUI.deleteAllCookies()

WebUI.maximizeWindow()

def driver = DriverFactory.getWebDriver()

String baseUrl = 'http://dummy-hacktiv8.kode.id.s3-website-ap-southeast-1.amazonaws.com/'

selenium = new WebDriverBackedSelenium(driver, baseUrl)

selenium.open('http://dummy-hacktiv8.kode.id.s3-website-ap-southeast-1.amazonaws.com/')

selenium.click('link=Daftar Sekarang')

WebUI.setText(findTestObject('Object Repository/Dev_SignUpPaymentTBHO/Page_HACKTIV8 Online - Authentication/input_atau_css-1cahi4q'), 
    'Creazy')

WebUI.setText(findTestObject('Object Repository/Dev_SignUpPaymentTBHO/Page_HACKTIV8 Online - Authentication/input_atau_css-1cahi4q_1'), 
    'Rich')

WebUI.setText(findTestObject('Object Repository/Dev_SignUpPaymentTBHO/Page_HACKTIV8 Online - Authentication/input_atau_css-1cahi4q_1_2'), 
    'kodetesting08@hotmail.com')

WebUI.setText(findTestObject('Object Repository/Dev_SignUpPaymentTBHO/Page_HACKTIV8 Online - Authentication/input_atau_css-1cahi4q_1_2_3'), 
    '087743180151')

WebUI.setEncryptedText(findTestObject('Object Repository/Dev_SignUpPaymentTBHO/Page_HACKTIV8 Online - Authentication/input_atau_css-1cahi4q_1_2_3_4'), 
    '5N7hhBwerqY1X/rpp9tfWQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Dev_SignUpPaymentTBHO/Page_HACKTIV8 Online - Authentication/input_atau_css-1cahi4q_1_2_3_4_5'), 
    '5N7hhBwerqY1X/rpp9tfWQ==')

WebUI.delay(8)

WebUI.check(findTestObject('Object Repository/Dev_SignUpPaymentTBHO/Page_HACKTIV8 Online - Authentication/div_atau_css-d8zqvr'))

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Terms and Condition\'])[1]/following::button[1]')

WebUI.delay(10)

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Coming Soon\'])[1]/following::button[1]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Sertifikat\'])[1]/following::button[1]')

WebUI.delay(12)

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Transfer Bank\'])[1]/following::div[1]')

selenium.click('id=card-number')

WebUI.setText(findTestObject('Dev_SignUpPaymentCC/Page_Xendit - Invoice/input_Nomor Kartu_card-number'), '4000000000000002')

selenium.click('id=select-month')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Powered by\'])[1]/following::li[1]')

selenium.click('id=select-year')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Powered by\'])[1]/following::li[2]')

selenium.click('id=cvv-number')

WebUI.setEncryptedText(findTestObject('Dev_SignUpPaymentCC/Page_Xendit - Invoice/input_CVCCVV_cvv-number'), 'tzH6RvlfSTg=')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'Kode 3 atau 4 digit dibalik kartu\'])[1]/following::span[1]')

WebUI.delay(15)

selenium.selectFrame('index=1')

selenium.click('id=password')

selenium.type('id=password', '1234')

selenium.click('name=UsernamePasswordEntry')

selenium.selectFrame('relative=parent')

selenium.click('link=Detail program')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'my campus\'])[1]/following::div[2]')

selenium.click('xpath=(.//*[normalize-space(text()) and normalize-space(.)=\'CR\'])[1]/following::button[1]')

