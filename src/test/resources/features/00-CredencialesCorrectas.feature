@CredencialesCorrectas
  Feature: Automatizacion pruebas con credenciales correctas - Servicios
    Scenario Outline: Iniciar y finalizar sesion con el servicio <servicio>
      Given El usuario navega al sitio web de <servicio>

      When Ingresa credenciales correctas de <servicio>
      Then La aplicacion deberia mostrar el modulo principal de <servicio>
       And El usuario cierra sesion de <servicio>
      Then Se muestra la pantalla de iniciar sesion de <servicio>

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