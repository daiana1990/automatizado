package automatizado.test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Classe base que serve de herança para todas as classes de teste.
 */
public abstract class BaseTest {

    /** Driver do navegador da pagina atual */
    protected static WebDriver driver;
    private static final String URL_BASE = "file:///home/daiana/Downloads/controle-de-produtos/sistema/login.html";
    private static final String CAMINHO_DRIVER = "src/test/java/automatizado/resource/chromedriver";
    
    /** Método para iniciar driver do navegador antes de qualquer classe de teste*/
    @BeforeClass
    public static void iniciar(){
        System.setProperty("webdriver.chrome.driver", CAMINHO_DRIVER);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL_BASE);
    }

     /** Método para finaqlizar driver do navegador antes de qualquer classe de teste*/
    @AfterClass
    public static void finalizar(){
        driver.quit();
    }
}
