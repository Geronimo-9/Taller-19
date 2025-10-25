import Ejercicio_1.Gestion.GestorAutenticador;
import Ejercicio_1.Servicios.ServicioAutenticador;
import Ejercicio_1.TiposAutenticados.Autenticacion0Auth;
import Ejercicio_1.TiposAutenticados.AutenticacionLocal;
import Ejercicio_1.Usuario;

public class Main {
    public static void main(String[] args) {



        //Ejercicio 1 Sistema de Autenticacion

        Usuario u1 = new Usuario("Geronimo","Mijares01");

        ServicioAutenticador Local = new AutenticacionLocal();
        ServicioAutenticador ZeroAuth = new Autenticacion0Auth();


        GestorAutenticador gestor = new GestorAutenticador(Local);

        Local.autenticarUsuario(u1);

        ZeroAuth.autenticarUsuario(u1);








    }
}