@Suite @LoginFacturaElectronica
Feature: CP17.1 - Automatizacion pruebas - Factura Electronica
  Background: Validar el inicio de sesion a la pagina de Factura Electronica
    Given El usuario navega al sitio web de Factura Electronica

  @CorrectCredentials
  Scenario: 1 - Validar con credenciales correctas
    When Ingresa credenciales correctas de Factura Electronica
    Then La aplicacion deberia mostrar el modulo principal de Factura Electronica

  @IncorrectCredentials
  Scenario: 2 - Validar con credenciales incorrectas
    When Ingresa credenciales incorrectas de Factura Electronica
    Then La aplicacion deberia mostrar un mensaje de error de Factura Electronica