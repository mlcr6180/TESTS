@CredencialesIncorrectas
Feature: Automatizacion pruebas con credenciales incorrectas - Servicios
  Scenario Outline: Iniciar y finalizar sesion con el servicio <servicio>
    Given El usuario navega al sitio web de <servicio>

    When Ingresa credenciales incorrectas de <servicio>
    Then La aplicacion deberia mostrar un mensaje de error de <servicio>

    Examples:
      | servicio                     |
      | Acciones y Accionistas       |
      | Administracion Banca Digital |
      | Administrador Pagos          |
      | Asesores                     |
      | Balcones                     |
      | Banca Digital                |
      | Banca Oficial                |
      | BIZAGI                       |
      | Captura Remota               |
      | Card Holder                  |
      | Contabilidad                 |
      | Cuadre y Compensacion        |
      | Editor Swift                 |
      | Estructuras Control          |
      | Logistica Efectivo           |