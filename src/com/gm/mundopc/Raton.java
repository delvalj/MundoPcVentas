package com.gm.mundopc;

public class Raton extends DispositivosEntrada{

    private final int idRaton;
    private static int contadorRatones;

    // Constructor que heredo de la clase padre,  + Inicializo el Ratón
    private Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.contadorRatones;
    }

    @Override
    public String toString() {
        return "Raton{" +
                "idRaton=" + idRaton + ", " + super.toString()  +
                '}';
    }
}
