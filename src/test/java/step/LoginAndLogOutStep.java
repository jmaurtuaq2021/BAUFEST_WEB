package step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.MenuPage;

public class LoginAndLogOutStep {

    MenuPage menuPage;
    public LoginAndLogOutStep(){
        menuPage=new MenuPage(Hooks.driver);

    }
    @Given("que estoy dentro de la pagina web")
    public void queEstoyDentroDeLaPaginaWeb() {
        Hooks.driver.get("https://www.demoblaze.com");
    }
    @When("ingreso a Log in")
    public void ingresoALogIn() {
        menuPage.LogIn();
    }

    @And("ingreso mis datos de logueo")
    public void ingresoMisDatosDeLogueo() {
    menuPage.IngresarLogin("Jorge Maúrtua9", "Ariana2020");
           }


    @And("me logueo con mis credenciales")
    public void meLogueoConMisCredenciales() {
        menuPage.ClickLogIn();
    }

    @Then("cierro sesión o Log Out")
    public void cierroSesiónOLogOut() {
    menuPage.ClickLogOut();
    }
}
