import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Login Test Case/LoginWithUsernameValid_PasswordValid'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/WorkBasketPHSObjectRepository/ClientDetail/ion-icon_Policy Holder Service_md-add-circle'))

WebUI.click(findTestObject('Object Repository/WorkBasketPHSObjectRepository/ClientDetail/ion-icon_Workbasket PHS_ios-arrow-down'))

WebUI.click(findTestObject('Object Repository/WorkBasketPHSObjectRepository/ClientDetail/div_Client Detail'))

WebUI.click(findTestObject('Object Repository/WorkBasketPHSObjectRepository/ClientDetail/ion-segment-button_Main Life Assured and Additional'))

