package com.pruhub.phsworkbasket.keyword

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory

public class ClickUsingJSKeyword {
	@Keyword
	def clickUsingJS(TestObject testObj, int timeout) {
		WebDriver driver = DriverFactory.getWebDriver()
		WebElement element = WebUiCommonHelper.findWebElement(testObj, timeout)
		JavaScriptExecutor executor = ((driver) as JavaScriptExecutor)
		executor.executeScript('arguments[0].click()', element)
	}
}
