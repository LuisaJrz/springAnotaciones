package luisa.pruebaanotaciones;

import luisa.pruebaanotaciones.demo.Estado;
import luisa.pruebaanotaciones.demo.Municipio;
import org.springframework.context.annotation.Bean;

/**
 * @author Luisa Juárez
 */

public class Beans {
    
    @Bean
    public Municipio getMunicipio(){
        Municipio miMunicipio = new Municipio();
	miMunicipio.setHabitantes(1.5f);
	miMunicipio.setMunicipio("León");
        return miMunicipio;
    }
    
    @Bean
    public Estado getEstado(){
        Estado estado= new Estado();
        estado.setEstado("Guanajuato");
        return estado;    
    }
        
}
