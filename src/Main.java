import Ejercicio_1.Gestion.GestorAutenticador;
import Ejercicio_1.Servicios.ServicioAutenticador;
import Ejercicio_1.TiposAutenticados.Autenticacion0Auth;
import Ejercicio_1.TiposAutenticados.AutenticacionLocal;
import Ejercicio_1.Usuario;
import Ejercicio_2.GestorArchivo;
import Ejercicio_2.InterfazAlmacenamiento.Almacenamiento;
import Ejercicio_2.TipoAlmacenamiento.AlmacenamientoLocal;
import Ejercicio_2.TipoAlmacenamiento.AlmacenamientoNube;
import Ejercicio_3.GeneradorReporte;
import Ejercicio_3.GestorReportes;
import Ejercicio_3.ReporteExcel;
import Ejercicio_3.ReportepPDF;

public class Main {
    public static void main(String[] args) {



        //Ejercicio 1 Sistema de Autenticacion

        Usuario u1 = new Usuario("Geronimo","Mijares01");

        ServicioAutenticador Local = new AutenticacionLocal();
        ServicioAutenticador ZeroAuth = new Autenticacion0Auth();


        GestorAutenticador gestor = new GestorAutenticador(Local);

        Local.autenticarUsuario(u1);

        ZeroAuth.autenticarUsuario(u1);


        // Ejercicio 2, Sistema de Almacenamiento de Archivos


        Almacenamiento local = new AlmacenamientoLocal();
        AlmacenamientoNube nube = new AlmacenamientoNube();


        GestorArchivo gestionar = new GestorArchivo(nube);
        gestionar.guardarArchivo();
        gestionar.recuperarArchivo();


        gestionar = new GestorArchivo(local);
        gestionar.guardarArchivo();
        gestionar.recuperarArchivo();


        // Ejercicio 3, Sistema de reportes


        GeneradorReporte pdf = new ReportepPDF();
        GeneradorReporte excel = new ReporteExcel();

        GestorReportes gestion = new GestorReportes(pdf);
        gestion.crear();


        gestion = new GestorReportes(excel);
        gestion.crear();















    }
}