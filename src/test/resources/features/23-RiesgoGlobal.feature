@Suite @LoginRiesgoGlobal
Feature: CP25.1 - Automatizacion pruebas - Riesgo Global
  Background: Validar el inicio de sesion a la pagina de Riesgo Global
    Given El usuario navega al sitio web de Riesgo Global

  @CorrectCredentials
  Scenario: 1 - Validar con credenciales correctas
    When Ingresa credenciales correctas de Riesgo Global
    Then La aplicacion deberia mostrar el modulo principal de Riesgo Global

  @IncorrectCredentials
  Scenario: 2 - Validar con credenciales incorrectas
    When Ingresa credenciales incorrectas de Riesgo Global
    Then La aplicacion deberia mostrar un mensaje de error de Riesgo Global