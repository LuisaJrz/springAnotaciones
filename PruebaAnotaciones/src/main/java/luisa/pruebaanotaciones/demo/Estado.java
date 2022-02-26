package luisa.pruebaanotaciones.demo;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Luisa Juárez
 */

public class Estado {
    private String Estado;
    
    @Autowired
    private Municipio miMunicipio;

     public String getEstado() {
        return Estado;
    }
     
     public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Municipio getMiMunicipio() {
        return miMunicipio;
    }

    public void setMiMunicipio(Municipio miMunicipio) {
        this.miMunicipio = miMunicipio;
    }
   
}
