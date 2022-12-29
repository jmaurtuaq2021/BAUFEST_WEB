Feature: agregar item al carrito y comprobarlo
  @carrito
  Scenario: Agregar al carrito una laptop y comprobar si este se agrego en el carrito
    Given que estoy logueado en la pagina web
   When agrego una laptop al carrito
 Then  valido su existencia en el carrito "Sony vaio i7"
