package automatizado.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;


public abstract class  BasePO {

    protected WebDriver driver;
/**
 * Construtor base p fabrica de elementos (Page Factory)
 * @param driver 
 */
    public BasePO(WebDriver driver){
       this.driver = driver; 
       PageFactory.initElements(driver, this);
    }

    public String obterTituloPagina(){
        return driver.getTitle(); 
      }

      public void escrever(WebElement input, String texto){
        input.clear();
        input.sendKeys(texto + Keys.TAB);
    }
}
