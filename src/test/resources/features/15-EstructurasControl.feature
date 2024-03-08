@Suite @LoginEstructurasControl
Feature: CP15.1 - Automatizacion pruebas - Estructuras Control
  Background: Validar el inicio de sesion a la pagina de Estructuras Control
    Given El usuario navega al sitio web de Estructuras Control

  @CorrectCredentials
  Scenario: 1 - Validar con credenciales correctas
    When Ingresa credenciales correctas de Estructuras Control
    Then La aplicacion deberia mostrar el modulo principal de Estructuras Control

  @IncorrectCredentials
  Scenario: 2 - Validar con credenciales incorrectas
    When Ingresa credenciales incorrectas de Estructuras Control
    Then La aplicacion deberia mostrar un mensaje de error de Estructuras Control