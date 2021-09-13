package paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class listaDeProdutosPage {
    private WebDriver navegador;

    public listaDeProdutosPage(WebDriver navegador){
        this.navegador = navegador;
    }

    public formularioDeAdicaoDeProdutoPage acessarFormularioAdicaoNovoProduto(){
        navegador.findElement(By.linkText("ADICIONAR PRODUTO")).click();

        return new formularioDeAdicaoDeProdutoPage(navegador);
    }

}
