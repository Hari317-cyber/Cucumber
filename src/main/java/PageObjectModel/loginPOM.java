package PageObjectModel;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class loginPOM {

    protected WebDriver driver;

    @FindBy(name = "email")
    private WebElement usernameField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    private WebElement loginButton;

    @FindBy(xpath="//i[@class=\"fa fa-user\"]/..//b")
    private WebElement login;

    @FindBy(xpath="//a[contains(@href,'logout')]")
    private WebElement logout;

    @FindBy(xpath="//div[@class=\"login-form\"]/h2")
    private WebElement labelText;

    @FindBy(xpath="//form[@action='/login']/p")
    private WebElement validateLogin;

    public loginPOM(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void login(){
            //driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(5));
            driver.get("https://www.automationexercise.com/login");

            usernameField.sendKeys("ajith@email.com");
            waitForElementToAppear(passwordField);
            passwordField.sendKeys("password-1");
            waitForElementToAppear(loginButton);
            loginButton.click();

            WebElement  wb  = driver.findElement(By.xpath("(//h2)[1]"));

            if(waitForElementToAppear(wb))
                System.out.println("Success");
            else
                System.out.println("Failure");

            if(login.getText().contains("AK"))
                System.out.println("Login Success");
            else
                System.out.println("Login Failure");

        }

        private Boolean waitForElementToAppear(WebElement revealed ){
            Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(d -> revealed.isDisplayed());

            return revealed.isDisplayed();
        }

        public void url(){
            driver.get("https://www.automationexercise.com/login");
            driver.manage().window().maximize();
        }

        public void enterCreds(String username, String pass){
            usernameField.sendKeys(username);
            waitForElementToAppear(passwordField);
            passwordField.sendKeys(pass);
            waitForElementToAppear(loginButton);
        }

        public void clickSubmit(){
            loginButton.click();
        }

        public void verifyLoggedIn(){
            WebElement  wb  = driver.findElement(By.xpath("(//h2)[1]"));

            if(waitForElementToAppear(wb))
                System.out.println("Success");
            else
                System.out.println("Failure");

            if(login.getText().contains("AK"))
                System.out.println("Login Success");
            else
                System.out.println("Login Failure");
        }

        public Boolean verifyHomeText(){
            return labelText.getText().contains("Login to your account");
        }

        public Boolean verifyValidationMessage(String message){
            return !validateLogin.getText().contains(message);
        }


        public void logout(){

            try {
//              if (!driver.findElement(By.xpath("//h2")).getText().contains("Login to your account")) {
                if (login.getText().contains("Ajith")) {
                    logout.click();
                }
            } catch (Exception e) {

            }
        }

}
