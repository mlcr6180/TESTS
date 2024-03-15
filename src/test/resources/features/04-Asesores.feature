@SuiteOk @LoginAsesores
Feature: CP04.1 - Automatizacion pruebas - Asesores
  Background: Validar el inicio de sesion a la pagina de Asesores
    Given El usuario navega al sitio web de Asesores

  @CorrectCredentials
  Scenario: 1 - Validar con credenciales correctas
    When Ingresa credenciales correctas de Asesores
    Then La aplicacion deberia mostrar el modulo principal de Asesores
     And El usuario cierra sesion de Asesores
    Then Se muestra la pantalla de iniciar sesion de Asesores

  @IncorrectCredentials
  Scenario: 2 - Validar con credenciales incorrectas
    When Ingresa credenciales incorrectas de Asesores
    Then La aplicacion deberia mostrar un mensaje de error de Asesores