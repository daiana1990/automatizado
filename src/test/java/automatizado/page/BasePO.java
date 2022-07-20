package automatizado.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class  BasePO {

       /** 
     * Metodo para aguardar o carregamento da pagina.
     * @param elemento determina qual elemento o metodo devera aguardar para clicar. 
     */
    public void aguardarElementoFicarClicavel(WebElement elemento, Integer tempo) {
        WebDriverWait aguardar = new WebDriverWait(driver, tempo);
        aguardar.until(ExpectedConditions.elementToBeClickable(elemento));
    }

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
