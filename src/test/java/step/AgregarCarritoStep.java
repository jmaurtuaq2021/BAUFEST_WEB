package step;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import page.MenuPage;

public class AgregarCarritoStep {

    MenuPage menuPage;

    public AgregarCarritoStep(){
        menuPage=new MenuPage(Hooks.driver);
    }

    @Given("que estoy logueado en la pagina web")
    public void queEstoyLogueadoEnLaPaginaWeb() {
        Hooks.driver.get("https://www.demoblaze.com");
        menuPage.LogIn();
        menuPage.IngresarLogin("Jorge Maúrtua9", "Ariana2020");
        menuPage.ClickLogIn();

    }

    @When("agrego una laptop al carrito")
    public void agregoUnaLaptopAlCarrito() throws InterruptedException {
        menuPage.escogerlaptop();
        menuPage.ClickAddCar();
        menuPage.AceptaralertaRegistro();

    }

    @Then("valido su existencia en el carrito {string}")
    public void validoSuExistenciaEnElCarrito(String txtlaptop) {
        menuPage.clickCarrito();
        Assert.assertEquals("No se encuentra la la laptop en la lista",txtlaptop,menuPage.validarlaptop());

    }
}
