Feature: loguearse en la pagina web
  @carrito
  Scenario: Ingresar usuario y clave para loguearse con mis datos personales
    Given que estoy dentro de la pagina web
    When ingreso a Log in
    And ingreso mis datos de logueo
   And me logueo con mis credenciales
    Then  cierro sesión o Log Out
