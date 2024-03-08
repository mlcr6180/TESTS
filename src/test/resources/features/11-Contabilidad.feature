@Suite @LoginContabilidad
Feature: CP11.1 - Automatizacion pruebas - Contabilidad
  Background: Validar el inicio de sesion a la pagina de Contabilidad
    Given El usuario navega al sitio web de Contabilidad

  @CorrectCredentials
  Scenario: 1 - Validar con credenciales correctas
    When Ingresa credenciales correctas de Contabilidad
    Then La aplicacion deberia mostrar el modulo principal de Contabilidad

  @IncorrectCredentials
  Scenario: 2 - Validar con credenciales incorrectas
    When Ingresa credenciales incorrectas de Contabilidad
    Then La aplicacion deberia mostrar un mensaje de error de Contabilidad