#Author: smontes@intergrupo.com

@tag
Feature: Creación pedidos de aguas pospago
  Yo como asesor comercial deseo crear un pedidos de aguas pospago

  @tag1
  Scenario Outline: Creacion de un pedido de aguas pospago
    Given Yo como asesor comercial ingreso al formulario de aguas pospago
    When Ingreso los campos obligatorios <value>
    Then Verifico que se genere un numero de pedido  <idPedido>

    Examples: 
      | name  | value | idPedido  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
      
       @tag1
  Scenario Outline: Instanciación del producto:Instalación de Aguas
    Given Yo como asesor comercial estoy sobre el pedido
    When Ingreso a la sección del producto y busco el producto <producto>
    Then Verifico que se instancie el producto en el pedido

    Examples: 
      | name  | producto | IdPedido  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
      
   Scenario Outline: Procesar pedido
    Given Yo como asesor comercial estoy sobre el pedido
    When Ingreso las especificaciones, los documentos legales y el tipo pago y proceso el pedido
    Then Verifico que el producto del pedido cambie de estado <estado> 

    Examples: 
      | estado  |
      | Ingresado |
