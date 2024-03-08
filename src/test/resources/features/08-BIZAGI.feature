@Suite @LoginBIZAGI
Feature: CP08.1 - Automatizacion pruebas - BIZAGI
  Background: Validar el inicio de sesion a la pagina de BIZAGI
    Given El usuario navega al sitio web de BIZAGI

  @CorrectCredentials
  Scenario: 1 - Validar con credenciales correctas
    When Ingresa credenciales correctas de BIZAGI
    Then La aplicacion deberia mostrar el modulo principal de BIZAGI

  @IncorrectCredentials
  Scenario: 2 - Validar con credenciales incorrectas
    When Ingresa credenciales incorrectas de BIZAGI
    Then La aplicacion deberia mostrar un mensaje de error de BIZAGI