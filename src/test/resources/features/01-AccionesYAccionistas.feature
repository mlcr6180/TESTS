@SuiteOk @LoginAccionesYAccionistas
Feature: CP01.1 - Automatizacion pruebas - Acciones y Accionistas
  Background: Validar el inicio de sesion a la pagina de Acciones y Accionistas
    Given El usuario navega al sitio web de Acciones y Accionistas

    @CorrectCredentials
    Scenario: 1 - Validar con credenciales correctas
      When Ingresa credenciales correctas de Acciones y Accionistas
      Then La aplicacion deberia mostrar el modulo principal de Acciones y Accionistas

    @IncorrectCredentials
    Scenario: 2 - Validar con credenciales incorrectas
      When Ingresa credenciales incorrectas de Acciones y Accionistas
      Then La aplicacion deberia mostrar un mensaje de error de Acciones y Accionistas