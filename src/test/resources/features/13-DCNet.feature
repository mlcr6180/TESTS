@Suite @LoginDCNet
Feature: CP13.1 - Automatizacion pruebas - DCNet
  Background: Validar el inicio de sesion a la pagina de DCNet
    Given El usuario navega al sitio web de DCNet

  @CorrectCredentials
  Scenario: 1 - Validar con credenciales correctas
    When Ingresa credenciales correctas de DCNet
    Then La aplicacion deberia mostrar el modulo principal de DCNet

  @IncorrectCredentials
  Scenario: 2 - Validar con credenciales incorrectas
    When Ingresa credenciales incorrectas de DCNet
    Then La aplicacion deberia mostrar un mensaje de error de DCNet