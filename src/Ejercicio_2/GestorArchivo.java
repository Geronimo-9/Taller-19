package Ejercicio_2;


import Ejercicio_2.InterfazAlmacenamiento.Almacenamiento;

public class GestorArchivo {

    private Almacenamiento espacio;

    public GestorArchivo(Almacenamiento espacio){
     this.espacio = espacio;
    }



    public void guardarArchivo(){
        espacio.guardar(espacio);
    }
    public void recuperarArchivo(){
        espacio.recuperar(espacio);
    }




}
