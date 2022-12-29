package step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.MenuPage;


public class RegistrarStep {
    MenuPage menuPage;

    public RegistrarStep(){
     menuPage=new MenuPage(Hooks.driver);

    }
    @Given("que estoy dentro de la pagina")
    public void queEstoyDentroDeLaPagina() {

        Hooks.driver.get("https://www.demoblaze.com");
    }

    @When("ingreso a registrarme")
    public void ingresoARegistrarme() {
    menuPage.clickSingUP();
    }

    @Then("ingreso los datos del usuario")
    public void ingresoLosDatosDelUsuario() {

        menuPage.ingresarRegistro("Jorge Maúrtua9", "Ariana2020");
        menuPage.clickFinalSignUp();
        menuPage.AceptaralertaRegistro();

    }
}
