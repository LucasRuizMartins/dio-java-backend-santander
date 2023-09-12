package entities;

import java.util.ArrayList;
import java.util.List;

public class WebBrowser {

    private String url;
    private Integer tab;

    public WebBrowser(String url, Integer tab) {
        this.url = url;
        this.tab = tab;
    }

public void showPage(String url) {
    System.out.println("exibir Site " + url);
    }
public void addTab() {
        this.tab += 1;
}

    public void reloadTab() {
        System.out.println("Pagina recarregada");
    }

}
