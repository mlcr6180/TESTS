@SuiteOk @LoginAdministracionBancaDigital
Feature: CP02.1 - Automatizacion pruebas - Administracion Banca Digital
  Background: Validar el inicio de sesion a la pagina de Administracion Banca Digital
    Given El usuario navega al sitio web de Administracion Banca Digital

  @CorrectCredentials
  Scenario: 1 - Validar con credenciales correctas
    When Ingresa credenciales correctas de Administracion Banca Digital
    Then La aplicacion deberia mostrar el modulo principal de Administracion Banca Digital

  @IncorrectCredentials
  Scenario: 2 - Validar con credenciales incorrectas
    When Ingresa credenciales incorrectas de Administracion Banca Digital
    Then La aplicacion deberia mostrar un mensaje de error de Administracion Banca Digital