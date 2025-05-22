package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SearchProductsPOM {

    protected WebDriver driver;
    SoftAssert softAs = new SoftAssert();

    ////a[contains(@href,'prod')]
    @FindBy(xpath = "//a[contains(@href,'prod')]")
    private WebElement productsTab;

    ////input[@id='search_product']
    @FindBy(xpath="//input[@id='search_product']")
    private WebElement searchText;

    //button[@id='submit_search']
    @FindBy(xpath="//button[@id='submit_search']")
    private WebElement searchProduct;

    //h2[@class='title text-center']
    @FindBy(xpath="//h2[@class='title text-center']")
    private WebElement searchProductHeader;

    //a[contains(@href,'product_details')]
    @FindBy(xpath="//a[contains(@href,'product_details')]")
    private WebElement viewProduct;

    @FindBy(xpath="//img[contains(@src,'get_product')]/following-sibling::h2/following-sibling::p")
    private WebElement filterItem;

    @FindBy(xpath="//button[@type='button']")
    private WebElement addCart;

    @FindBy(xpath="(//button)[1]")
    private WebElement continuShopping;

    @FindBy(id="susbscribe_email")
    private WebElement email;

    @FindBy(xpath="//li[@class='active']")
    private WebElement verifyshopping;

    @FindBy(xpath="//a[@class='cart_quantity_delete']")
    private WebElement delete;

    @FindBy(xpath="//a[contains(@href,'view_cart')]")
    private WebElement clickCart;


    public SearchProductsPOM(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickProduct(){
        this.productsTab.click();
    }

    public void getHeaderInfo(String header){
        System.out.println(header);
        System.out.println(searchProductHeader.getText());
            this.softAs.assertEquals(searchProductHeader.getText(),header,"Header not visible");
            this.softAs.assertAll();
            //this.softAs.notifyAll();
    }

    public void searchProduct(String searchText){
        this.searchText.sendKeys(searchText);
        this.searchProduct.click();
    }

    public void filterResult(String item){
        this.softAs.assertEquals(filterItem.getText(),item,"Item not filtered");
    }

    public void viewDetails() throws InterruptedException {

        scrollToElement();
        Thread.sleep(100);
        this.viewProduct.click();
        Thread.sleep(200);

    }

    public void clickCart() throws InterruptedException {
        Thread.sleep(300);
        this.addCart.click();
        Thread.sleep(300);
        this.continuShopping.click();

    }

    public void scrollToElement(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,350)", "");
    }

    public void clickCartMenu() throws InterruptedException {
        this.clickCart.click();
        Thread.sleep(200);
    }

    public void verifyShopping() throws InterruptedException {
        Thread.sleep(300);
        this.softAs.assertEquals(verifyshopping.getText(), "Shopping Cart");
        this.softAs.assertAll();
    }
    public void quantityDelete() throws InterruptedException {
        Thread.sleep(300);
        this.delete.click();

}

}
