@Suite @LoginCuadreYCompensacion
Feature: CP12.1 - Automatizacion pruebas - Cuadre y Compensacion
  Background: Validar el inicio de sesion a la pagina de Cuadre y Compensacion
    Given El usuario navega al sitio web de Cuadre y Compensacion

  @CorrectCredentials
  Scenario: 1 - Validar con credenciales correctas
    When Ingresa credenciales correctas de Cuadre y Compensacion
    Then La aplicacion deberia mostrar el modulo principal de Cuadre y Compensacion

  @IncorrectCredentials
  Scenario: 2 - Validar con credenciales incorrectas
    When Ingresa credenciales incorrectas de Cuadre y Compensacion
    Then La aplicacion deberia mostrar un mensaje de error de Cuadre y Compensacion