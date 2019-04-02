import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By.ByTagName as ByTagName
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Memanggil test case "BRMS VErification"'
WebUI.callTestCase(findTestCase('Workbasket PHS/BRMS Verification/BRMS Verification'), [:], FailureHandling.STOP_ON_FAILURE)

'Check dokumen SQS Alt'
WebUI.click(findTestObject('WorkBasketPHSObjectRepository/BRMS Verification/Data and Document Chechlist/SQSAlt Check Object'))

'Nomor Polis'
def driver = DriverFactory.getWebDriver()

WebElement PolicyNumberElement = driver.findElement(ByTagName.xpath('/html/body/ion-app/ng-component/ion-nav/page-phs-workbasket-quotation/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/expandable[1]/div/div[1]/div/ion-label/div/ion-row/ion-col[1]/ion-item/div[1]/div/ion-input/input'))

String PolicyNumberValue = PolicyNumberElement.getAttribute('value')

if (PolicyNumberValue.isEmpty()) {
    WebUI.setText(findTestObject('WorkBasketPHSObjectRepository/BRMS Verification/Data and Document Chechlist/Data Pemegang Polis/PolicyNumberObject'), 
        '12345678')
} else {
    System.out.println('Field sudah terisi')
}

WebElement PolicyNameElement = driver.findElement(ByTagName.xpath('/html/body/ion-app/ng-component/ion-nav/page-phs-workbasket-quotation/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/expandable[1]/div/div[1]/div/ion-label/div/ion-row/ion-col[2]/ion-item/div[1]/div/ion-input/input'))

String PolicyNameValue = PolicyNameElement.getAttribute('value')

if (PolicyNameValue.isEmpty()) {
    WebUI.setText(findTestObject('WorkBasketPHSObjectRepository/BRMS Verification/Data and Document Chechlist/Data Pemegang Polis/PolicyName'), 
        'Nama Test')
} else {
    System.out.println('Field sudah terisi')
}

WebUI.click(findTestObject('WorkBasketPHSObjectRepository/BRMS Verification/Data and Document Chechlist/Data Pembayar Kontribusi/DPKDropDownObject'))

//Nama Tertanggung Utama
WebElement NamaTertanggungUtama = driver.findElement(ByTagName.xpath('/html/body/ion-app/ng-component/ion-nav/page-phs-workbasket-quotation/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/expandable[2]/div/div[1]/div/ion-label/div/ion-row[1]/ion-col[1]/ion-item/div[1]/div/ion-input/input'))

String NTUValue = NamaTertanggungUtama.getAttribute('value')

if (NTUValue.isEmpty()) {
    WebUI.setText(findTestObject('WorkBasketPHSObjectRepository/BRMS Verification/Data and Document Chechlist/Data Pembayar Kontribusi/NamaTertanggungUtama'), 
        'Nama Tertanggung Utama')
} else {
    System.out.println('Field sudah terisi')
}

'Pekerjaan Tertanggung Utama'
WebUI.click(findTestObject('WorkBasketPHSObjectRepository/BRMS Verification/Data and Document Chechlist/Data Pembayar Kontribusi/PekerjaanObject'))

//WebUI.click(findTestObject('WorkBasketPHSObjectRepository/BRMS Verification/Data and Document Chechlist/Data Pembayar Kontribusi/PenjagaBinatang'))

WebUI.selectOptionByValue(findTestObject('WorkBasketPHSObjectRepository/BRMS Verification/Data and Document Chechlist/Data Pembayar Kontribusi/PekerjaanObject'), 
    'Penjaga binatang di Kebun Binatang', false)
'Kelas Pekerjaan Tertanggung Utama'
WebElement KelasPekerjaanTU = driver.findElement(ByTagName.xpath('/html/body/ion-app/ng-component/ion-nav/page-phs-workbasket-quotation/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/expandable[2]/div/div[1]/div/ion-label/div/ion-row[1]/ion-col[3]/ion-item/div[1]/div/ion-input/input'))

String KelasPekerjaanTUValue = KelasPekerjaanTU.getAttribute('value')

if (KelasPekerjaanTUValue.isEmpty()) {
    WebUI.setText(findTestObject('WorkBasketPHSObjectRepository/BRMS Verification/Data and Document Chechlist/Data Pembayar Kontribusi/KelasPekerjaan'), 
        'Nama Tertanggung Utama')
} else {
    System.out.println('Field sudah terisi')
}

'Usia tahun berikutnya Tertanggung Utama'
WebElement UsiaTU = driver.findElement(ByTagName.xpath('//html/body/ion-app/ng-component/ion-nav/page-phs-workbasket-quotation/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/expandable[2]/div/div[1]/div/ion-label/div/ion-row[1]/ion-col[4]/ion-item/div[1]/div/ion-input/input'))

String UsiaTUValue = UsiaTU.getAttribute('value')

if (UsiaTUValue.isEmpty()) {
    WebUI.setText(findTestObject('WorkBasketPHSObjectRepository/BRMS Verification/Data and Document Chechlist/Data Pembayar Kontribusi/UsiaTahunBerikutnya'), 
        'Nama Tertanggung Utama')
} else {
    System.out.println('Field sudah terisi')
}

