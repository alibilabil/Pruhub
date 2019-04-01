import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Memanggil test case login dengan username dan password yang valid'
WebUI.callTestCase(findTestCase('Login Test Case/LoginWithUsernameValid_PasswordValid'), [:], FailureHandling.STOP_ON_FAILURE)
'delay 1 detik'
WebUI.delay(1)
'verify object is clickable'
WebUI.verifyElementClickable(findTestObject('WorkBasketPHSObjectRepository/policyholderserviceicon'))
'click object using custom keyword that called'
CustomKeywords.'com.pruhub.phsworkbasket.keyword.ClickUsingJSKeyword.clickUsingJS'(findTestObject('WorkBasketPHSObjectRepository/policyholderserviceicon'), 
    0)
'add delay 1 second'
WebUI.delay(1)
'verify object is clickable'
WebUI.verifyElementClickable(findTestObject('WorkBasketPHSObjectRepository/div_Workbasket PHS'))
'click object using custom keyword that called'
CustomKeywords.'com.pruhub.phsworkbasket.keyword.ClickUsingJSKeyword.clickUsingJS'(findTestObject('WorkBasketPHSObjectRepository/div_Workbasket PHS'), 
    30)

