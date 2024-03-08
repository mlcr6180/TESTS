@Suite @LoginBancaOficial
Feature: CP07.1 - Automatizacion pruebas - Banca Oficial
  Background: Validar el inicio de sesion a la pagina de Banca Oficial
    Given El usuario navega al sitio web de Banca Oficial

  @CorrectCredentials
  Scenario: 1 - Validar con credenciales correctas
    When Ingresa credenciales correctas de Banca Oficial
    Then La aplicacion deberia mostrar el modulo principal de Banca Oficial

  @IncorrectCredentials
  Scenario: 2 - Validar con credenciales incorrectas
    When Ingresa credenciales incorrectas de Banca Oficial
    Then La aplicacion deberia mostrar un mensaje de error de Banca Oficial