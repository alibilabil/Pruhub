import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\c19679\\AppData\\Local\\Temp\\Katalon\\20190328_192053\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\n\'Memanggil test case login dengan username dan password yang valid\'\nWebUI.callTestCase(findTestCase(\'Login Test Case/LoginWithUsernameValid_PasswordValid\'), [:], FailureHandling.STOP_ON_FAILURE)\n\n//WebUI.click(findTestObject(\'WorkBasketPHSObjectRepository/ion-icon_Policy Holder Service_md-add-circle\'))\nCustomKeywords.\'com.pruhub.phsworkbasket.keyword.ClickUsingJSKeyword.clickUsingJS\'(findTestObject(\'WorkBasketPHSObjectRepository/ion-icon_Policy Holder Service_md-add-circle\'), \n    30)\n\n//WebUI.click(findTestObject(\'WorkBasketPHSObjectRepository/div_Workbasket PHS\'))\nCustomKeywords.\'com.pruhub.phsworkbasket.keyword.ClickUsingJSKeyword.clickUsingJS\'(findTestObject(\'WorkBasketPHSObjectRepository/div_Workbasket PHS\'), \n    30)\n\n', FailureHandling.STOP_ON_FAILURE, true)

