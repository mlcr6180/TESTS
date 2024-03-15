@Suite @LoginWebTeller
Feature: CP28.1 - Automatizacion pruebas - WebTeller
  Background: Validar el inicio de sesion a la pagina de WebTeller
    Given El usuario navega al sitio web de WebTeller

  @CorrectCredentials
  Scenario: 1 - Validar con credenciales correctas
    When Ingresa credenciales correctas de WebTeller
    Then La aplicacion deberia mostrar el modulo principal de WebTeller
     And El usuario cierra sesion de WebTeller
    Then Se muestra la pantalla de iniciar sesion de WebTeller

  @IncorrectCredentials
  Scenario: 2 - Validar con credenciales incorrectas
    When Ingresa credenciales incorrectas de WebTeller
    Then La aplicacion deberia mostrar un mensaje de error de WebTeller