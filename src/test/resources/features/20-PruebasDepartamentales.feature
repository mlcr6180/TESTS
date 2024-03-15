@Suite @LoginPruebasDepartamentales
Feature: CP22.1 - Automatizacion pruebas - Pruebas Departamentales
  Background: Validar el inicio de sesion a la pagina de Pruebas Departamentales
    Given El usuario navega al sitio web de Pruebas Departamentales

  @CorrectCredentials
  Scenario: 1 - Validar con credenciales correctas
    When Ingresa credenciales correctas de Pruebas Departamentales
    Then La aplicacion deberia mostrar el modulo principal de Pruebas Departamentales
     And El usuario cierra sesion de Pruebas Departamentales
    Then Se muestra la pantalla de iniciar sesion de Pruebas Departamentales

  @IncorrectCredentials
  Scenario: 2 - Validar con credenciales incorrectas
    When Ingresa credenciales incorrectas de Pruebas Departamentales
    Then La aplicacion deberia mostrar un mensaje de error de Pruebas Departamentales