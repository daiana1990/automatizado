package automatizado.page;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ControleDeProdutoPO extends BasePO{


    @FindBy(id = "btn-adicionar")
    public WebElement buttonAdicionar;

    @FindBy(id = "ul>li>a.nav-link")
    public WebElement linkVoltar;

    @FindBy(css = "div.modal-header>h4")
    public WebElement tituloModal;

    @FindBy(id = "codigo")
    public WebElement inputCodigo;

    @FindBy(id = "nome")
    public WebElement inputNome;

    @FindBy(id = "quantidade")
    public WebElement inputQuantidade;

    @FindBy(id = "valor")
    public WebElement inputValor;

    @FindBy(id = "data")
    public WebElement inputData;

    @FindBy(id = "btn-salvar")
    public WebElement buttonSalvar;

    @FindBy(id = "btn-sair")
    public WebElement buttonSair;

    @FindBy(id = "mensagem")
    public WebElement spanMensagem;

    public ControleDeProdutoPO(WebDriver driver) {
        super(driver);
    }

    public void cadastrarProduto(
        String codigo, 
        String nome, 
        Integer quantidade, 
        Double valor, 
        String data){

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       escrever(inputCodigo, codigo);
       escrever(inputNome, nome);
       escrever(inputQuantidade, quantidade.toString());
       escrever(inputValor, valor.toString());
       escrever(inputData, data);

        buttonSalvar.click();
    }

}

