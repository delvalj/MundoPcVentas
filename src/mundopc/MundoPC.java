package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Monitor MonitorHP = new Monitor("HP" , 111 );
        Teclado TecladoHP = new Teclado("USB", "HP");
        Raton RatonHP = new Raton("Bluetooth", "HP");
        // Objeto tipo Computadora
        Computadora ComputadoraHP = new Computadora("PC HP", MonitorHP, TecladoHP, RatonHP);

        Monitor MonitorLG = new Monitor("LG" , 146 );
        Teclado TecladoLG = new Teclado("USB", "LG");
        Raton RatonLG = new Raton("Bluetooth", "LG");
        Computadora ComputadoraLG = new Computadora("PC LG", MonitorLG, TecladoLG, RatonLG);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(ComputadoraHP);
        orden1.agregarComputadora(ComputadoraLG);

        orden1.mostrarOrden();

    }
}
