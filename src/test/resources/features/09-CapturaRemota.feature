@SuiteOk @LoginCapturaRemota
Feature: CP09.1 - Automatizacion pruebas - Captura Remota
  Background: Validar el inicio de sesion a la pagina de Captura Remota
    Given El usuario navega al sitio web de Captura Remota

  @CorrectCredentials
  Scenario: 1 - Validar con credenciales correctas
    When Ingresa credenciales correctas de Captura Remota
    Then La aplicacion deberia mostrar el modulo principal de Captura Remota

  @IncorrectCredentials
  Scenario: 2 - Validar con credenciales incorrectas
    When Ingresa credenciales incorrectas de Captura Remota
    Then La aplicacion deberia mostrar un mensaje de error de Captura Remota