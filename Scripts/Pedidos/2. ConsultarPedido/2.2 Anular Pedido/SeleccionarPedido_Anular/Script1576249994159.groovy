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

WebUI.callTestCase(findTestCase('Pedidos/2. ConsultarPedido/IngresarInformacionConsulta'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Pedidos/Consultar Pedido/Consultar Pedido/span_Nerida Del Carmen Avila Arrieta'))

not_run: WebUI.click(findTestObject('Page_Pedidos Todos los pedidos - Microsoft _3564f0/img_Checkbox_gridBodyTable_checkBox_Image_D_11979a'))

WebUI.doubleClick(findTestObject('Page_Pedidos Todos los pedidos - Microsoft _3564f0/tr_Checkbox11122019 250 pmPED-751175-B7N3Ne_049505'))

WebUI.click(findTestObject('Object Repository/Pedidos/Consultar Pedido/Consultar Pedido/h1_PED-751175-B7N3'))

