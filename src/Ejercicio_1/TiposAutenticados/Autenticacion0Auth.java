package Ejercicio_1.TiposAutenticados;

import Ejercicio_1.Servicios.ServicioAutenticador;
import Ejercicio_1.Usuario;



public class Autenticacion0Auth implements ServicioAutenticador {

    @Override
    public void autenticarUsuario(Usuario user) {
        System.out.println("Autenticacion en Google Account fue realizada con exito");
        System.out.println("Iniciastes seccion como "+user.getNombre());
    }

}
