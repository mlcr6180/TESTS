@Suite @LoginReportesGAF
Feature: CP24.1 - Automatizacion pruebas - Reportes GAF
  Background: Validar el inicio de sesion a la pagina de Reportes GAF
    Given El usuario navega al sitio web de Reportes GAF

  @CorrectCredentials
  Scenario: 1 - Validar con credenciales correctas
    When Ingresa credenciales correctas de Reportes GAF
    Then La aplicacion deberia mostrar el modulo principal de Reportes GAF
     And El usuario cierra sesion de Reportes GAF
    Then Se muestra la pantalla de iniciar sesion de Reportes GAF

  @IncorrectCredentials
  Scenario: 2 - Validar con credenciales incorrectas
    When Ingresa credenciales incorrectas de Reportes GAF
    Then La aplicacion deberia mostrar un mensaje de error de Reportes GAF