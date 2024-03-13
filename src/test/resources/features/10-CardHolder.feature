@SuiteOk @LoginCardHolder
Feature: CP10.1 - Automatizacion pruebas - Card Holder
  Background: Validar el inicio de sesion a la pagina de Card Holder
    Given El usuario navega al sitio web de Card Holder

  @CorrectCredentials
  Scenario: 1 - Validar con credenciales correctas
    When Ingresa credenciales correctas de Card Holder
    Then La aplicacion deberia mostrar el modulo principal de Card Holder

  @IncorrectCredentials
  Scenario: 2 - Validar con credenciales incorrectas
    When Ingresa credenciales incorrectas de Card Holder
    Then La aplicacion deberia mostrar un mensaje de error de Card Holder