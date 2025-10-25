package Ejercicio_1.Gestion;

import Ejercicio_1.Servicios.ServicioAutenticador;
import Ejercicio_1.Usuario;

public class GestorAutenticador {
private ServicioAutenticador autenticador;
private Usuario user;

    public GestorAutenticador(ServicioAutenticador autenticador){
        this.autenticador = autenticador;
    }



    public void autenticar(){
        autenticador.autenticarUsuario(user);
    }





}
