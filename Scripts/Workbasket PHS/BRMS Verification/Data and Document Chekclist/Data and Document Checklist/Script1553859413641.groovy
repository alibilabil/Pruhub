import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By.ByTagName as ByTagName
import org.stringtemplate.v4.compiler.STParser.element_return as element_return
import org.bouncycastle.pqc.crypto.sphincs.Tree.leafaddr
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
WebUI.delay(1)

WebUI.click(findTestObject('WorkBasketPHSObjectRepository/BRMS Verification/Data and Document Chechlist/Data Pembayar Kontribusi/PenjagaBinatang'))

/*WebUI.selectOptionByValue(findTestObject('WorkBasketPHSObjectRepository/BRMS Verification/Data and Document Chechlist/Data Pembayar Kontribusi/PekerjaanObject'), 
    'Penjaga binatang di Kebun Binatang', false)*/
'Kelas Pekerjaan Tertanggung Utama'
WebElement KelasPekerjaanTU = driver.findElement(ByTagName.xpath('/html/body/ion-app/ng-component/ion-nav/page-phs-workbasket-quotation/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/expandable[2]/div/div[1]/div/ion-label/div/ion-row[1]/ion-col[3]/ion-item/div[1]/div/ion-input/input'))

String KelasPekerjaanTUValue = KelasPekerjaanTU.getAttribute('value')

if (KelasPekerjaanTUValue.isEmpty()) {
    WebUI.setText(findTestObject('WorkBasketPHSObjectRepository/BRMS Verification/Data and Document Chechlist/Data Pembayar Kontribusi/KelasPekerjaan'), 
        '3')
} else {
    System.out.println('Field sudah terisi')
}

'Usia tahun berikutnya Tertanggung Utama'
WebElement UsiaTU = driver.findElement(ByTagName.xpath('//html/body/ion-app/ng-component/ion-nav/page-phs-workbasket-quotation/ion-content/div[2]/ion-grid/ion-row[2]/ion-col[2]/expandable[2]/div/div[1]/div/ion-label/div/ion-row[1]/ion-col[4]/ion-item/div[1]/div/ion-input/input'))

String UsiaTUValue = UsiaTU.getAttribute('value')

if (UsiaTUValue.isEmpty()) {
    WebUI.setText(findTestObject('WorkBasketPHSObjectRepository/BRMS Verification/Data and Document Chechlist/Data Pembayar Kontribusi/UsiaTahunBerikutnya'), 
        '25')
} else {
    System.out.println('Field sudah terisi')
}

'Tanggal lahir tertanggung utama'
/*WebUI.scrollToElement(findTestObject('WorkBasketPHSObjectRepository/BRMS Verification/Data and Document Chechlist/Data Pembayar Kontribusi/BD_Icon_TU'), 
    0)
WebUI.delay(1)
WebUI.click(findTestObject('WorkBasketPHSObjectRepository/BRMS Verification/Data and Document Chechlist/Data Pembayar Kontribusi/BD_Icon_TU'))
//int leftPostion = WebUI.getElementLeftPosition(findTestObject('Object Repository/WorkBasketPHSObjectRepository/BRMS Verification/Data and Document Chechlist/Data Pembayar Kontribusi/Tgl_TU'))
//int topPosition = WebUI.getEle(findTestObject('Object Repository/WorkBasketPHSObjectRepository/BRMS Verification/Data and Document Chechlist/Data Pembayar Kontribusi/Tgl_TU'))
//WebUI.scrollToPosition(620, 163)
WebUI.delay(1)
//WebUI.scrollToElement(findTestObject('Object Repository/WorkBasketPHSObjectRepository/BRMS Verification/Data and Document Chechlist/Data Pembayar Kontribusi/button_1997'), 3, FailureHandling.STOP_ON_FAILURE)
WebUI.mouseOver(findTestObject('Object Repository/WorkBasketPHSObjectRepository/BRMS Verification/Data and Document Chechlist/Data Pembayar Kontribusi/button_1997'))
WebUI.delay(1)
//WebUI.scrollToElement(findTestObject('Object Repository/WorkBasketPHSObjectRepository/BRMS Verification/Data and Document Chechlist/Data Pembayar Kontribusi/button_03'), 3, FailureHandling.STOP_ON_FAILURE)
WebUI.mouseOver(findTestObject('Object Repository/WorkBasketPHSObjectRepository/BRMS Verification/Data and Document Chechlist/Data Pembayar Kontribusi/button_03'))
WebUI.delay(1)
//WebUI.scrollToElement(findTestObject('Object Repository/WorkBasketPHSObjectRepository/BRMS Verification/Data and Document Chechlist/Data Pembayar Kontribusi/button_15'), 3, FailureHandling.STOP_ON_FAILURE)
WebUI.mouseOver(findTestObject('Object Repository/WorkBasketPHSObjectRepository/BRMS Verification/Data and Document Chechlist/Data Pembayar Kontribusi/button_15'))
WebUI.click(findTestObject('WorkBasketPHSObjectRepository/BRMS Verification/Data and Document Chechlist/Data Pembayar Kontribusi/Tgl_TU Done Button'))
*/
WebElement dateWidget = driver.findElement(ByTagName.xpath());
List<WebElement> columns=dateWidget.findElements(ByTagName("td"));

for (WebElement cell: columns){
   //Select 13th Date
   if (cell.getText().equals("13")){
	   cell.
	  cell.findElement(By.linkText("13")).click()
	  break;
 }

'Jenis Kelamin tertanggung utama'
/*WebUI.click(findTestObject('WorkBasketPHSObjectRepository/BRMS Verification/Data and Document Chechlist/Data Pembayar Kontribusi/Male'))

WebUI.click(findTestObject('WorkBasketPHSObjectRepository/BRMS Verification/Data and Document Chechlist/Data Pembayar Kontribusi/TidakMerokok'))

*/