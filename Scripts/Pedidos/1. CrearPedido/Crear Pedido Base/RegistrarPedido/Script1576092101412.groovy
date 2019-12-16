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

WebUI.callTestCase(findTestCase('Pedidos/1. CrearPedido/Crear Pedido Base/IngresoModulo_Pedidos'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Pedidos/1. CrearPedido/Crear Pedido Base/SeleccionarBoton_Nuevo'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Pedidos/Creacion Pedidos/Crear Pedido Basico/span_Oferta por negocio'))

WebUI.setText(findTestObject('Object Repository/Pedidos/Creacion Pedidos/Crear Pedido Basico/input_Oferta por negocio orden negocio del _403f5d'), 
    'Agua')

WebUI.click(findTestObject('Object Repository/Pedidos/Creacion Pedidos/Crear Pedido Basico/img_Oferta por negocio orden negocio del pe_9c4428'))

WebUI.click(findTestObject('Object Repository/Pedidos/Creacion Pedidos/Crear Pedido Basico/span_Aguas EPM - Oferta Bsica'))

WebUI.comment('Seleccionar Cliente')

WebUI.click(findTestObject('Object Repository/Pedidos/Creacion Pedidos/Crear Pedido Basico/span_Cliente'))

WebUI.setText(findTestObject('Object Repository/Pedidos/Creacion Pedidos/Crear Pedido Basico/input_--_customerid_ledit'), 
    'Nerida')

WebUI.click(findTestObject('Object Repository/Pedidos/Creacion Pedidos/Crear Pedido Basico/img_--_customerid_i'))

WebUI.click(findTestObject('Object Repository/Pedidos/Creacion Pedidos/Crear Pedido Basico/span_Nerida Del Carmen Avila Arrieta'))

WebUI.comment('Ingresar Dirección')

WebUI.click(findTestObject('Object Repository/Pedidos/Creacion Pedidos/Crear Pedido Basico/span_Direccin'))

WebUI.setText(findTestObject('Object Repository/Pedidos/Creacion Pedidos/Crear Pedido Basico/input_Direccin Es el punto de prestacin del_f6158c'), 
    'CR 81 A CL 26 -17 (INTERIOR 402 )')

WebUI.click(findTestObject('Object Repository/Pedidos/Creacion Pedidos/Crear Pedido Basico/img_Direccin Es el punto de prestacin del s_93bf80'))

WebUI.click(findTestObject('Object Repository/Pedidos/Creacion Pedidos/Crear Pedido Basico/span_CR 81 A CL 26 -17 (INTERIOR 402 )'))

WebUI.comment('Seleccionar titular de la dirección')

WebUI.click(findTestObject('Object Repository/Pedidos/Creacion Pedidos/Crear Pedido Basico/span_Rol Cliente PPS'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pedidos/Creacion Pedidos/Crear Pedido Basico/select_PropietarioPropietario - UsuarioInqu_2c236e'), 
    '4', true)

WebUI.comment('Seleccionar punto de Atención')

WebUI.click(findTestObject('Object Repository/Pedidos/Creacion Pedidos/Crear Pedido Basico/span_Oficina de Atencin'))

WebUI.setText(findTestObject('Object Repository/Pedidos/Creacion Pedidos/Crear Pedido Basico/input_--_epm_oficinaatencion_ledit'), 
    'Edificio')

WebUI.click(findTestObject('Object Repository/Pedidos/Creacion Pedidos/Crear Pedido Basico/img_--_epm_oficinaatencion_i'))

WebUI.click(findTestObject('Object Repository/Pedidos/Creacion Pedidos/Crear Pedido Basico/span_Edificio EPM'))

WebUI.comment('Seleccionar Medio')

WebUI.click(findTestObject('Object Repository/Pedidos/Creacion Pedidos/Crear Pedido Basico/span_Medio'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pedidos/Creacion Pedidos/Crear Pedido Basico/select_Agencia de CobroEjecutivo de CuentaE_8c5ce8'), 
    '4', true)

WebUI.click(findTestObject('Pedidos/Crear Pedido Nuevo/Crear pedido base/li_Guardar y cerrar  Guardar y cerrar este Pedido'))

