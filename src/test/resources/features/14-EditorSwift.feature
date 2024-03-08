@Suite @LoginEditorSwift
Feature: CP14.1 - Automatizacion pruebas - Editor Swift
  Background: Validar el inicio de sesion a la pagina de Editor Swift
    Given El usuario navega al sitio web de Editor Swift

  @CorrectCredentials
  Scenario: 1 - Validar con credenciales correctas
    When Ingresa credenciales correctas de Editor Swift
    Then La aplicacion deberia mostrar el modulo principal de Editor Swift

  @IncorrectCredentials
  Scenario: 2 - Validar con credenciales incorrectas
    When Ingresa credenciales incorrectas de Editor Swift
    Then La aplicacion deberia mostrar un mensaje de error de Editor Swift