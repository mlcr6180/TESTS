@Suite @LoginEstructurasControlHttps
Feature: CP16.1 - Automatizacion pruebas - Estructuras Control Https
  Background: Validar el inicio de sesion a la pagina de Estructuras Control Https
    Given El usuario navega al sitio web de Estructuras Control Https

  @CorrectCredentials
  Scenario: 1 - Validar con credenciales correctas
    When Ingresa credenciales correctas de Estructuras Control Https
    Then La aplicacion deberia mostrar el modulo principal de Estructuras Control Https

  @IncorrectCredentials
  Scenario: 2 - Validar con credenciales incorrectas
    When Ingresa credenciales incorrectas de Estructuras Control Https
    Then La aplicacion deberia mostrar un mensaje de error de Estructuras Control Https