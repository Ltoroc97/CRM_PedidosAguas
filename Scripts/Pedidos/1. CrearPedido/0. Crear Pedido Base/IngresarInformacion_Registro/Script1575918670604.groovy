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

WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Base/div_Oferta por negocio ----Oferta por negoc_a67131'))

WebUI.setText(findTestObject('Object Repository/Pedidos/Crear Pedido Base/input_Oferta por negocio orden negocio del _403f5d'), 
    'Aguas')

WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Base/img_Oferta por negocio orden negocio del pe_9c4428'))

WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Base/span_Aguas EPM - Oferta Bsica'))

WebUI.comment('Selección Cliente')

WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Base/div_Cliente ----Cliente Seleccione la cuent_9d45f3'))

WebUI.setText(findTestObject('Object Repository/Pedidos/Crear Pedido Base/input_--_customerid_ledit'), 'Nerida')

WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Base/img_--_customerid_i'))

WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Base/span_Nerida De Jesus Saenz Durango'))

WebUI.comment('Ingresar dirección')

WebUI.setText(findTestObject('Object Repository/Pedidos/Crear Pedido Base/input_Direccin Es el punto de prestacin del_bf55a9'), 
    'CR 52 CL 95 -61 (INTERIOR 101 )')

WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Base/img_Direccin Es el punto de prestacin del s_a28226'))

WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Base/div_'))

WebUI.comment('Seleccionar Oficina de atención')

WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Base/div_Oficina de Atencin ----Oficina de Atenc_394b41'))

WebUI.setText(findTestObject('Object Repository/Pedidos/Crear Pedido Base/input_--_epm_oficinaatencion_ledit'), 'Edificio Epm')

WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Base/img_--_epm_oficinaatencion_i'))

WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Base/span_Edificio EPM'))

WebUI.comment('Seleccionar Medio')

WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Base/div_Medio ----Agencia de CobroEjecutivo de _1c565d'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pedidos/Crear Pedido Base/select_Agencia de CobroEjecutivo de CuentaE_8c5ce8'), 
    '4', true)

WebUI.delay(2)

WebUI.comment('Seleccionar Usuario de la Dirección')

WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Base/Seleccionar usuario/span_Rol Cliente PPS'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pedidos/Crear Pedido Base/Seleccionar usuario/select_PropietarioPropietario - UsuarioInqu_2c236e'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Base/Seleccionar usuario/div_Rol Cliente PPS UsuarioUsuario'))

not_run: WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Base/span_Guardar  Guarde Pedido'))

not_run: WebUI.closeBrowser()

