@SuiteOk @LoginLogisticaEfectivo
Feature: CP18.1 - Automatizacion pruebas - Logistica Efectivo
  Background: Validar el inicio de sesion a la pagina de Logistica Efectivo
    Given El usuario navega al sitio web de Logistica Efectivo

  @CorrectCredentials
  Scenario: 1 - Validar con credenciales correctas
    When Ingresa credenciales correctas de Logistica Efectivo
    Then La aplicacion deberia mostrar el modulo principal de Logistica Efectivo
     And El usuario cierra sesion de Logistica Efectivo
    Then Se muestra la pantalla de iniciar sesion de Logistica Efectivo

  @IncorrectCredentials
  Scenario: 2 - Validar con credenciales incorrectas
    When Ingresa credenciales incorrectas de Logistica Efectivo
    Then La aplicacion deberia mostrar un mensaje de error de Logistica Efectivo