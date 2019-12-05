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

WebUI.callTestCase(findTestCase('Pedidos/1. CrearPedido/0. Crear Pedido Base/IngresoModulo_Pedidos'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pedidos/1. CrearPedido/0. Crear Pedido Base/SeleccionarBoton_Nuevo'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('Seleccionar Oferta por Negocio')

WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Nuevo/Crear Pedido Base/div_Oferta por negocio ----Oferta por negoc_a67131'))

WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Nuevo/Crear Pedido Base/span_Oferta por negocio'))

WebUI.setText(findTestObject('Object Repository/Pedidos/Crear Pedido Nuevo/Crear Pedido Base/input_Oferta por negocio orden negocio del _4b04cb'), 
    'Aguas')

WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Nuevo/Crear Pedido Base/img_Oferta por negocio orden negocio del pe_74348a'))

WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Nuevo/Crear Pedido Base/span_Aguas EPM - Oferta Bsica'))

WebUI.comment('Selección Cliente')

WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Nuevo/Crear Pedido Base/span_Cliente'))

WebUI.setText(findTestObject('Object Repository/Pedidos/Crear Pedido Nuevo/Crear Pedido Base/input_--_customerid_ledit'), 
    'Nerida')

WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Nuevo/Crear Pedido Base/img_--_customerid_i'))

WebUI.click(findTestObject('Pedidos/Crear Pedido Nuevo/Crear Pedido Base/span_Nerida De Jesus Saenz Durango'))

WebUI.comment('Ingresar dirección')

WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Nuevo/Crear Pedido Base/span_Direccin'))

WebUI.setText(findTestObject('Object Repository/Pedidos/Crear Pedido Nuevo/Crear Pedido Base/input_Direccin Es el punto de prestacin del_bf55a9'), 
    'CL 58 D CR 92 A -146')

WebUI.comment('Seleccionar Oficina de Atención')

