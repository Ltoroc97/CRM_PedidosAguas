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

WebUI.callTestCase(findTestCase('Pedidos/1. CrearPedido/Crear Pedido y Productos/IngresarOpcion_CrearNuevoPedido'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Nuevo/Crear Pedido con Productos/Crear Pedido Base/span_Oferta por negocio'))

WebUI.setText(findTestObject('Object Repository/Pedidos/Crear Pedido Nuevo/Crear Pedido con Productos/Crear Pedido Base/input_Oferta por negocio orden negocio del _403f5d'), 
    'Agua')

WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Nuevo/Crear Pedido con Productos/Crear Pedido Base/img_Oferta por negocio orden negocio del pe_9c4428'))

WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Nuevo/Crear Pedido con Productos/Crear Pedido Base/span_Aguas EPM - Oferta Bsica'))

WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Nuevo/Crear Pedido con Productos/Crear Pedido Base/span_Cliente'))

WebUI.setText(findTestObject('Object Repository/Pedidos/Crear Pedido Nuevo/Crear Pedido con Productos/Crear Pedido Base/input_--_customerid_ledit'), 
    'Manuela Villa')

WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Nuevo/Crear Pedido con Productos/Crear Pedido Base/img_--_customerid_i'))

WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Nuevo/Crear Pedido con Productos/Crear Pedido Base/span_Manuela Villa Berro'))

WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Nuevo/Crear Pedido con Productos/Crear Pedido Base/span_Direccin'))

WebUI.setText(findTestObject('Object Repository/Pedidos/Crear Pedido Nuevo/Crear Pedido con Productos/Crear Pedido Base/input_Direccin Es el punto de prestacin del_f6158c'), 
    'CL 102 CR 51 A -1 (INTERIOR 201 )')

WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Nuevo/Crear Pedido con Productos/Crear Pedido Base/img_Direccin Es el punto de prestacin del s_93bf80'))

WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Nuevo/Crear Pedido con Productos/Crear Pedido Base/span_CL 102 CR 51 A -1 (INTERIOR 201 )'))

WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Nuevo/Crear Pedido con Productos/Crear Pedido Base/span_Rol Cliente PPS'))

WebUI.selectOptionByValue(findTestObject('Pedidos/Crear Pedido Nuevo/Crear Pedido con Productos/CrearPedidoBase/select_PropietarioPropietario - UsuarioInqu_2c236e'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/Pedidos/Creacion Pedidos/Crear Pedido Basico/span_Oficina de Atencin'))

WebUI.setText(findTestObject('Object Repository/Pedidos/Creacion Pedidos/Crear Pedido Basico/input_--_epm_oficinaatencion_ledit'), 
    'Edificio')

WebUI.click(findTestObject('Object Repository/Pedidos/Creacion Pedidos/Crear Pedido Basico/img_--_epm_oficinaatencion_i'))

WebUI.click(findTestObject('Object Repository/Pedidos/Creacion Pedidos/Crear Pedido Basico/span_Edificio EPM'))

WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Nuevo/Crear Pedido con Productos/Crear Pedido Base/span_Oficina de Atencin'))

WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Nuevo/Crear Pedido con Productos/Crear Pedido Base/span_Medio'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Pedidos/Crear Pedido Nuevo/Crear Pedido con Productos/Crear Pedido Base/select_Agencia de CobroEjecutivo de CuentaE_8c5ce8'), 
    '4', true)

WebUI.click(findTestObject('Object Repository/Pedidos/Crear Pedido Nuevo/Crear Pedido con Productos/Crear Pedido Base/span_Guardar'))

