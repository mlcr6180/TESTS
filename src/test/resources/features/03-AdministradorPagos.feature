@SuiteOk @LoginAdministradorPagos
Feature: CP03.1 - Automatizacion pruebas - Administrador Pagos
  Background: Validar el inicio de sesion a la pagina de Administrador Pagos
    Given El usuario navega al sitio web de Administrador Pagos

  @CorrectCredentials
  Scenario: 1 - Validar con credenciales correctas
    When Ingresa credenciales correctas de Administrador Pagos
    Then La aplicacion deberia mostrar el modulo principal de Administrador Pagos

  @IncorrectCredentials
  Scenario: 2 - Validar con credenciales incorrectas
    When Ingresa credenciales incorrectas de Administrador Pagos
    Then La aplicacion deberia mostrar un mensaje de error de Administrador Pagos