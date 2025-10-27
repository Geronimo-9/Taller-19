package Ejercicio_3;



public class GestorReportes {

    private GeneradorReporte crear;


    public GestorReportes(GeneradorReporte crear){
        this.crear = crear;
    }


    public void crear(){
        crear.generar();
    }


}
