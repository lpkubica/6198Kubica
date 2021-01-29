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

WebUI.navigateToUrl('https://www.x-kom.pl/')

WebUI.click(findTestObject('Object Repository/Page_x-kom.pl - Sklep komputerowy/svg'))

WebUI.setText(findTestObject('Object Repository/Page_Centrum pomocy - Sklep komputerowy - x-kom.pl/input_Imi_firstName'), 
    'Adam')

WebUI.setText(findTestObject('Object Repository/Page_Centrum pomocy - Sklep komputerowy - x-kom.pl/input_Nazwisko_lastName'), 
    'Zawalny')

WebUI.setText(findTestObject('Object Repository/Page_Centrum pomocy - Sklep komputerowy - x-kom.pl/input_Adres e-mail_emailAddress'), 
    'zwalny7@wp.pl')

WebUI.setText(findTestObject('Object Repository/Page_Centrum pomocy - Sklep komputerowy - x-kom.pl/input_Numer telefonu_phoneNumber'), 
    '600600600')

WebUI.click(findTestObject('Object Repository/Page_Centrum pomocy - Sklep komputerowy - x-kom.pl/span_-- wybierz --'))

WebUI.click(findTestObject('Object Repository/Page_Centrum pomocy - Sklep komputerowy - x-kom.pl/label_Zamwienia'))

WebUI.setText(findTestObject('Object Repository/Page_Centrum pomocy - Sklep komputerowy - x-kom.pl/textarea_Wiadomo_question'), 
    'tsttesttest')

WebUI.click(findTestObject('Object Repository/Page_Centrum pomocy - Sklep komputerowy - x-kom.pl/input_Wiadomo_consentshelp'))

WebUI.click(findTestObject('Object Repository/Page_Centrum pomocy - Sklep komputerowy - x-kom.pl/button_Wylij pytanie'))

