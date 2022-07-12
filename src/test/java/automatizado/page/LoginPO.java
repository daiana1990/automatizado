package automatizado.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPO extends BasePO{

    @FindBy(id ="email")
    public WebElement inputEmail;

    @FindBy(id ="senha")
    public WebElement inputSenha;

    @FindBy(id ="btn-entrar")
    public WebElement buttonEntrar;

    @FindBy(css ="form.form-login>div.alert>span")
    public WebElement spanMensagem;

    /**
     * Contrutor padrão para criação de uma nova instancia da pg de login
     * @param driver Driver da pag de login
     */
    public LoginPO(WebDriver driver) {
        super(driver);
    }


    public String obterMensagem(){
        return this.spanMensagem.getText();
    }

/**
 * Metodo que tenta executa a ação de logar no sistema.
 * @param email e-mail para tentativa de login.
 * @param senha e-mail para tentativa de login.
 */

    public void executarAcaoDeLogar(String email, String senha){
        escrever(inputEmail, email);
        escrever(inputSenha, senha);
        buttonEntrar.click(); 
    }

  
    
}
