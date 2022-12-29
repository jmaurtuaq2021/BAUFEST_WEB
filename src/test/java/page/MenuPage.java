package page;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import util.Util;


public class MenuPage extends BasePage {
    public MenuPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "signin2")
    private WebElement btSingUP;

    @FindBy(id = "sign-username")
    private WebElement txtUserName;
    @FindBy(id = "sign-password")
    private WebElement txtPassword;
   @FindBy(xpath = "//button[@onclick='register()']")
   private WebElement btnFinalSingUp;

   //// @FindBy(className = "btn btn-secondary")
   // private WebElement btnFinalClear;
    @FindBy(id = "login2")
    private WebElement btnLogIn;
    @FindBy(xpath = "//button[@onclick='logIn()']")
    private WebElement btnClickLogIn;
    @FindBy(id = "loginusername")
    private WebElement txtLoginUsername;
    @FindBy(id = "loginpassword")
    private WebElement txttxtLoginPassword;
    @FindBy(id = "logout2")
    private WebElement btnLogOut;
    @FindBy(xpath = "//*[@id=\"tbodyid\"]/div[9]/div/div/h4/a")
    private WebElement btnLaptop;

    @FindBy(xpath = "//a[@onclick='addToCart(9)']")
    private WebElement btnAddCart;
    @FindBy(id = "cartur")
    private WebElement btnCarrito;
    @FindBy(xpath = "//td[2]")
    private WebElement txtLaptop;
    @FindBy(id = "fotcont")
    private WebElement modal;
    public void clickSingUP() {
        wait.until(ExpectedConditions.elementToBeClickable(btSingUP));
        btSingUP.click();

    }

    public void ingresarRegistro(String Username, String password) {
        txtUserName.sendKeys(Username);
         txtPassword.sendKeys(password);
    }
    public void IngresarLogin(String logiName,String LoginPassword){
        txtLoginUsername.sendKeys(logiName);
        txttxtLoginPassword.sendKeys((LoginPassword));
    }

    public void clickFinalSignUp(){
      btnFinalSingUp.click();

   }
   public void AceptaralertaRegistro(){
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();
   }

   public void LogIn(){
       wait.until(ExpectedConditions.elementToBeClickable(btSingUP));
        btnLogIn.click();
   }

    public void ClickLogIn(){
        btnClickLogIn.click();
    }

    public void ClickLogOut(){
        wait.until(ExpectedConditions.elementToBeClickable(btnLogOut));
        btnLogOut.click();

    }

    public void escogerlaptop() throws InterruptedException {
        Thread.sleep(5000);
        //wait.until(ExpectedConditions.elementToBeClickable(btnLaptop));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(btnLaptop));
        Util.scrollToElement(btnLaptop);
        btnLaptop.click();
    }

    public void ClickAddCar(){
        wait.until(ExpectedConditions.elementToBeClickable(btnAddCart));
        btnAddCart.click();
    }

    public void clickCarrito(){
        wait.until(ExpectedConditions.elementToBeClickable(btnCarrito));

        btnCarrito.click();
    }
   // public void clickFinalClear(){
   //     btnFinalClear.click();
   // }
    public String validarlaptop(){

        wait.until(ExpectedConditions.visibilityOf(txtLaptop));
        return txtLaptop.getText();
    }
}
