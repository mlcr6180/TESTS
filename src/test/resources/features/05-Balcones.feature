@Suite @LoginBalcones
Feature: CP05.1 - Automatizacion pruebas - Balcones
  Background: Validar el inicio de sesion a la pagina de Balcones
    Given El usuario navega al sitio web de Balcones

  @CorrectCredentials
  Scenario: 1 - Validar con credenciales correctas
    When Ingresa credenciales correctas de Balcones
    Then La aplicacion deberia mostrar el modulo principal de Balcones
     And El usuario cierra sesion de Balcones
    Then Se muestra la pantalla de iniciar sesion de Balcones

  @IncorrectCredentials
  Scenario: 2 - Validar con credenciales incorrectas
    When Ingresa credenciales incorrectas de Balcones
    Then La aplicacion deberia mostrar un mensaje de error de Balcones