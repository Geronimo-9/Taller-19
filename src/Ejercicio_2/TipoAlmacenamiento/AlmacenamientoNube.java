package Ejercicio_2.TipoAlmacenamiento;

import Ejercicio_2.InterfazAlmacenamiento.Almacenamiento;

public class AlmacenamientoNube implements Almacenamiento {


    @Override
    public void guardar(Almacenamiento espacio) {
        System.out.println("Se ha guardado en el almacenamiento Nube");
    }

    @Override
    public void recuperar(Almacenamiento espacio) {
        System.out.println("Se recuperó el archivo en el almacenamiento Nube");
    }





}
