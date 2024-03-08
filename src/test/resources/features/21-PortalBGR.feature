@Suite @LoginPortalBGR
Feature: CP21.1 - Automatizacion pruebas - Portal BGR
  Background: Validar el inicio de sesion a la pagina de Portal BGR
    Given El usuario navega al sitio web de Portal BGR

  @CorrectCredentials
  Scenario: 1 - Validar con credenciales correctas
    When Ingresa credenciales correctas de Portal BGR
    Then La aplicacion deberia mostrar el modulo principal de Portal BGR

  @IncorrectCredentials
  Scenario: 2 - Validar con credenciales incorrectas
    When Ingresa credenciales incorrectas de Portal BGR
    Then La aplicacion deberia mostrar un mensaje de error de Portal BGR