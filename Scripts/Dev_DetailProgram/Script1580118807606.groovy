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

WebUI.navigateToUrl('https://auth.hacktiv8.com/signin')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Dev_DetailProgram/Page_HACKTIV8 Online - Authentication/input_atau_css-1cahi4q'), 'ffadilla@kode.id')

WebUI.setEncryptedText(findTestObject('Dev_DetailProgram/Page_HACKTIV8 Online - Authentication/input_atau_css-1cahi4q_1'), 
    '5N7hhBwerqY1X/rpp9tfWQ==')

WebUI.click(findTestObject('Dev_DetailProgram/Page_HACKTIV8 Online - Authentication/button_sign in'))

WebUI.click(findTestObject('Dev_DetailProgram/Page_HACKTIV8 Online/a_Detail program'))

WebUI.scrollToPosition(100, 0)

WebUI.click(findTestObject('Dev_DetailProgram/Page_HACKTIV8 Online/div_course 1'))

WebUI.click(findTestObject('Dev_DetailProgram/Page_HACKTIV8 Online/h3_Penerapan Clean Code'))

WebUI.click(findTestObject('Dev_DetailProgram/Page_HACKTIV8 Online/h4_1 Menulis Variabel'))

WebUI.click(findTestObject('Dev_DetailProgram/Page_HACKTIV8 Online/h4_2 Menulis Function'))

WebUI.click(findTestObject('Dev_DetailProgram/Page_HACKTIV8 Online/div_Tools Clean Code'))

WebUI.click(findTestObject('Dev_DetailProgram/Page_HACKTIV8 Online/h4_1 Eslint'))

WebUI.click(findTestObject('Dev_DetailProgram/Page_HACKTIV8 Online/h4_2 Prettier  Husky'))

WebUI.click(findTestObject('Dev_DetailProgram/Page_HACKTIV8 Online/h4_3 Lint-Staged'))

WebUI.click(findTestObject('Dev_DetailProgram/Page_HACKTIV8 Online/a_ke detail program'))

WebUI.click(findTestObject('Dev_DetailProgram/Page_HACKTIV8 Online/div_ekstrakurikuler'))

WebUI.scrollToPosition(100, 0)

WebUI.click(findTestObject('Dev_DetailProgram/Page_HACKTIV8 Online/h4_Menguasai Dasar Bootstrap 4'))

WebUI.click(findTestObject('Dev_DetailProgram/Page_HACKTIV8 Online/h4_2 Persiapan'))

WebUI.click(findTestObject('Dev_DetailProgram/Page_HACKTIV8 Online/h3_Manipulasi konten'))

WebUI.click(findTestObject('Dev_DetailProgram/Page_HACKTIV8 Online/h4_1 Manipulasi teks'))

WebUI.click(findTestObject('Dev_DetailProgram/Page_HACKTIV8 Online/h4_2 Manipulasi gambar'))

WebUI.click(findTestObject('Dev_DetailProgram/Page_HACKTIV8 Online/h3_Manipulasi ukuran layar monitor'))

WebUI.click(findTestObject('Dev_DetailProgram/Page_HACKTIV8 Online/h4_1 Menampung isi konten'))

WebUI.click(findTestObject('Dev_DetailProgram/Page_HACKTIV8 Online/h4_2 Mengatur tampilan di ukuran layar tertentu'))

WebUI.click(findTestObject('Dev_DetailProgram/Page_HACKTIV8 Online/h4_3 Membagi ukuran layar'))

WebUI.click(findTestObject('Dev_DetailProgram/Page_HACKTIV8 Online/h4_4 Membuat konten di dalam konten'))

WebUI.click(findTestObject('Dev_DetailProgram/Page_HACKTIV8 Online/h3_Manipulasi komponen'))

WebUI.click(findTestObject('Dev_DetailProgram/Page_HACKTIV8 Online/a_ke detail program'))

WebUI.click(findTestObject('Dev_DetailProgram/Page_HACKTIV8 Online/a_my campus'))

WebUI.click(findTestObject('Dev_DetailProgram/Page_HACKTIV8 Online/div_FF'))

WebUI.click(findTestObject('Dev_DetailProgram/Page_HACKTIV8 Online/button_sign out'))

