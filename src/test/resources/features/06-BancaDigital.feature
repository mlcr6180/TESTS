@SuiteOk @LoginBancaDigital
Feature: CP06.1 - Automatizacion pruebas - BancaDigital
  Background: Validar el inicio de sesion a la pagina de Banca Digital
    Given El usuario navega al sitio web de Banca Digital

  @CorrectCredentials
  Scenario: 1 - Validar con credenciales correctas
    When Ingresa credenciales correctas de Banca Digital
    Then La aplicacion deberia mostrar el modulo principal de Banca Digital

  @IncorrectCredentials
  Scenario: 2 - Validar con credenciales incorrectas
    When Ingresa credenciales incorrectas de Banca Digital
    Then La aplicacion deberia mostrar un mensaje de error de Banca Digital