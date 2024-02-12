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

WebUI.openBrowser('https://fitbybeat.com/')

WebUI.click(findTestObject('Page_Fit by Beat/About Us'))

WebUI.verifyElementText(findTestObject('Page_About Us  Fit by Beat/About Us-Page'), 'ABOUT US')

WebUI.click(findTestObject('Page_Fit by Beat/Schedule'))

WebUI.verifyElementVisible(findTestObject('Page_Schedule  Fit by Beat/Schedule-Page'))

WebUI.scrollToElement(findTestObject('Page_Schedule  Fit by Beat/btn_Book now'), 0)

WebUI.verifyElementText(findTestObject('Page_Schedule  Fit by Beat/btn_Book now'), 'BOOK NOW')

WebUI.click(findTestObject('Page_Schedule  Fit by Beat/btn_Book now'))

WebUI.verifyElementVisible(findTestObject('Page_Registration/Booking_page'), FailureHandling.STOP_ON_FAILURE)

