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

WebUI.openBrowser('https://smontest:Nerida_08112019@epmwt72-02.corp.epm.com.co/EPMCRMMatrizUAT/main.aspx')

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Inicio/btnMenu'))

WebUI.click(findTestObject('Object Repository/Page_Inicio/btnPedidos'))

WebUI.click(findTestObject('Object Repository/Page_Inicio/btnNuevo'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_PedidoNuevo/span_ListaFormularioPedidos'))

WebUI.click(findTestObject('Object Repository/Page_PedidoNuevo/btn_FormularioPyPAguasPosPago'))

WebUI.click(findTestObject('Object Repository/Page_PedidoNuevo/iframe_OfertaPorNegocio'))

WebUI.setText(findTestObject('Object Repository/Page_PedidoNuevo/lbl_OfertaPorNegocio'), 'Aguas')

WebUI.sendKeys(findTestObject('Object Repository/Page_PedidoNuevo/lbl_OfertaPorNegocio'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_PedidoNuevo/lbl_Cliente'))

WebUI.setText(findTestObject('Object Repository/Page_PedidoNuevo/lbl_Cliente'), 'Nerida Tordecilla')

WebUI.setText(findTestObject('null'), 'Nerida Tordecilla')

WebUI.sendKeys(findTestObject('Object Repository/Page_PedidoNuevo/lbl_Direccion'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_PedidoNuevo/lbl_Direccion'), 'Cr 29 Cl 40')

WebUI.sendKeys(findTestObject('Object Repository/Page_PedidoNuevo/lbl_Direccion'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_PedidoNuevo/lbl_RolCliente'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/select_PropietarioPropietario - UsuarioInqu_2c236e'), '2', true)

//WebUI.selectOptionByValue(findTestObject('Object Repository/select_PropietarioPropietario - UsuarioInqu_2c236e'), '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_PedidoNuevo/lbl_RolCliente'), '4', true)

WebUI.click(findTestObject('Object Repository/Page_PedidoNuevo/lbl_oficinaAtencion'))

WebUI.setText(findTestObject('Object Repository/Page_PedidoNuevo/lbl_oficinaAtencion'), 'Edificio EPM')

WebUI.sendKeys(findTestObject('Object Repository/Page_PedidoNuevo/lbl_oficinaAtencion'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_PedidoNuevo/lbl_Medio'))

//WebUI.selectOptionByValue(findTestObject('Object Repository/select_Agencia de CobroEjecutivo de CuentaE_8c5ce8'), '1', true)

//WebUI.selectOptionByValue(findTestObject('Object Repository/select_Agencia de CobroEjecutivo de CuentaE_8c5ce8'), '2', true)

//WebUI.selectOptionByValue(findTestObject('Object Repository/select_Agencia de CobroEjecutivo de CuentaE_8c5ce8'), '3', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_PedidoNuevo/lbl_Medio'), '4', true)


WebUI.click(findTestObject('Object Repository/Page_PedidoNuevo/btn_GuardarPedido'))

