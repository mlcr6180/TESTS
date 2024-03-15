@Suite @LoginSISGAR
Feature: CP26.1 - Automatizacion pruebas - SISGAR
  Background: Validar el inicio de sesion a la pagina de SISGAR
    Given El usuario navega al sitio web de SISGAR

  @CorrectCredentials
  Scenario: 1 - Validar con credenciales correctas
    When Ingresa credenciales correctas de SISGAR
    Then La aplicacion deberia mostrar el modulo principal de SISGAR
    And El usuario cierra sesion de SISGAR
    Then Se muestra la pantalla de iniciar sesion de SISGAR

  @IncorrectCredentials
  Scenario: 2 - Validar con credenciales incorrectas
    When Ingresa credenciales incorrectas de SISGAR
    Then La aplicacion deberia mostrar un mensaje de error de SISGAR