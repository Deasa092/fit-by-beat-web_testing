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

WebUI.scrollToElement(findTestObject('Page_Fit by Beat/h3_Calculate Your BMI'), 0)

WebUI.verifyElementVisible(findTestObject('Page_Fit by Beat/BMI-Calculator-Chart'))

WebUI.setText(findTestObject('Page_Fit by Beat/input_height'), '155')

WebUI.setText(findTestObject('Page_Fit by Beat/input_weight'), '30')

WebUI.setText(findTestObject('Page_Fit by Beat/input_age'), '22')

WebUI.click(findTestObject('Page_Fit by Beat/span_Calculate'))

WebUI.verifyElementVisibleInViewport(findTestObject('Page_Fit by Beat/result-BMI'), 0)

WebUI.verifyElementText(findTestObject('Page_Fit by Beat/status-result'), 'YOU ARE UNDERWEIGHT! ')

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

