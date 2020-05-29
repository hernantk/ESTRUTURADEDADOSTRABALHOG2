
package vetor10000;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class MontarVetor {
    public MontarVetor() {
    }

    public Integer[] montarVetor() throws IOException {
            Properties properties = new Properties();
            InputStream inputStream = this.getClass().getResourceAsStream("teste.properties");
            properties.load(inputStream);

            String[] lista = properties.getProperty("vetor").split(",");
            Integer[] listaInteiros = new Integer[10000];

            for(int i = 0; i < 10000; ++i) {
                listaInteiros[i] = Integer.valueOf(lista[i]);
            }
            return listaInteiros;



   }
}

