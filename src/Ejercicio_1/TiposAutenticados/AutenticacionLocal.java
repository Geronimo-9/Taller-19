package Ejercicio_1.TiposAutenticados;

import Ejercicio_1.Servicios.ServicioAutenticador;
import Ejercicio_1.Usuario;

public class AutenticacionLocal implements ServicioAutenticador {

    @Override
    public void autenticarUsuario(Usuario user) {

        if(user.getNombre().equals("Geronimo") && user.getContrasena().equals("Mijares01")){
            System.out.println("Iniciastes Seccion como "+user.getNombre());
        } else {

            System.out.println("Ha introducido datos no valido, Vuelvelo a intentar");
        }

    }

}
