@Suite @LoginOperaciones
Feature: CP20.1 - Automatizacion pruebas - Operaciones
  Background: Validar el inicio de sesion a la pagina de Operaciones
    Given El usuario navega al sitio web de Operaciones

  @CorrectCredentials
  Scenario: 1 - Validar con credenciales correctas
    When Ingresa credenciales correctas de Operaciones
    Then La aplicacion deberia mostrar el modulo principal de Operaciones
     And El usuario cierra sesion de Operaciones
    Then Se muestra la pantalla de iniciar sesion de Operaciones

  @IncorrectCredentials
  Scenario: 2 - Validar con credenciales incorrectas
    When Ingresa credenciales incorrectas de Operaciones
    Then La aplicacion deberia mostrar un mensaje de error de Operaciones