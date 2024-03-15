@Suite @LoginReclamosYRequerimientos
Feature: CP23.1 - Automatizacion pruebas - Reclamos y Requerimientos
  Background: Validar el inicio de sesion a la pagina de Reclamos y Requerimientos
    Given El usuario navega al sitio web de Reclamos y Requerimientos

  @CorrectCredentials
  Scenario: 1 - Validar con credenciales correctas
    When Ingresa credenciales correctas de Reclamos y Requerimientos
    Then La aplicacion deberia mostrar el modulo principal de Reclamos y Requerimientos
     And El usuario cierra sesion de Reclamos y Requerimientos
    Then Se muestra la pantalla de iniciar sesion de Reclamos y Requerimientos

  @IncorrectCredentials
  Scenario: 2 - Validar con credenciales incorrectas
    When Ingresa credenciales incorrectas de Reclamos y Requerimientos
    Then La aplicacion deberia mostrar un mensaje de error de Reclamos y Requerimientos