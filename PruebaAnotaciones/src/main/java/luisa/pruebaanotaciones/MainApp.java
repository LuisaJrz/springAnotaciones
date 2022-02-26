package luisa.pruebaanotaciones;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import luisa.pruebaanotaciones.demo.Estado;

/**
 *
 * @author Luisa Juárez
 */

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Beans.class);
        
        Estado objeto = context.getBean(Estado.class);
		System.out.println("El municipio de "+objeto.getMiMunicipio().getMunicipio()
                        +" tiene "+objeto.getMiMunicipio().getHabitantes() +" millones de habitantes;"
                        +" y pertenece al estado de "+ objeto.getEstado());
    }
    
}
