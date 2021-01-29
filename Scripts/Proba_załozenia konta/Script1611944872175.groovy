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

WebUI.click(findTestObject('Object Repository/Page_x-kom.pl - Sklep komputerowy/div_Twoje konto'))

WebUI.click(findTestObject('Object Repository/Page_Logowanie - Sklep komputerowy - x-kom.pl/a_Za konto'))

WebUI.setText(findTestObject('Object Repository/Page_Rejestracja - Sklep komputerowy - x-kom.pl/input_Za konto_firstName'), 
    'Adrian')

WebUI.setText(findTestObject('Object Repository/Page_Rejestracja - Sklep komputerowy - x-kom.pl/input_Imi (wymagane)_lastName'), 
    'Twardowski')

WebUI.setText(findTestObject('Object Repository/Page_Rejestracja - Sklep komputerowy - x-kom.pl/input_Nazwisko (wymagane)_email'), 
    'sorin_wroc@protonmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Rejestracja - Sklep komputerowy - x-kom.pl/input_E-mail (wymagane)_password'), 
    '3OgXSGUd/r6p7y7Ka/h7IQ==')

WebUI.click(findTestObject('Object Repository/Page_Rejestracja - Sklep komputerowy - x-kom.pl/svg'))

WebUI.click(findTestObject('Object Repository/Page_Rejestracja - Sklep komputerowy - x-kom.pl/span_Za konto'))

