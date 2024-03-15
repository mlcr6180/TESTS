@Suite @LoginSolicitudTarjetasCredito
Feature: CP27.1 - Automatizacion pruebas - Solicitud Tarjetas Credito
  Background: Validar el inicio de sesion a la pagina de Solicitud Tarjetas Credito
    Given El usuario navega al sitio web de Solicitud Tarjetas Credito

  @CorrectCredentials
  Scenario: 1 - Validar con credenciales correctas
    When Ingresa credenciales correctas de Solicitud Tarjetas Credito
    Then La aplicacion deberia mostrar el modulo principal de Solicitud Tarjetas Credito
     And El usuario cierra sesion de Solicitud Tarjetas Credito
    Then Se muestra la pantalla de iniciar sesion de Solicitud Tarjetas Credito

  @IncorrectCredentials
  Scenario: 2 - Validar con credenciales incorrectas
    When Ingresa credenciales incorrectas de Solicitud Tarjetas Credito
    Then La aplicacion deberia mostrar un mensaje de error de Solicitud Tarjetas Credito