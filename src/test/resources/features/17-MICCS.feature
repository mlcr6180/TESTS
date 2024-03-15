@Suite @LoginMICCS
Feature: CP19.1 - Automatizacion pruebas - MICCS
  Background: Validar el inicio de sesion a la pagina de MICCS
    Given El usuario navega al sitio web de MICCS

  @CorrectCredentials
  Scenario: 1 - Validar con credenciales correctas
    When Ingresa credenciales correctas de MICCS
    Then La aplicacion deberia mostrar el modulo principal de MICCS
     And El usuario cierra sesion de MICCS
    Then Se muestra la pantalla de iniciar sesion de MICCS

  @IncorrectCredentials
  Scenario: 2 - Validar con credenciales incorrectas
    When Ingresa credenciales incorrectas de MICCS
    Then La aplicacion deberia mostrar un mensaje de error de MICCS