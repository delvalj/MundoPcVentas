package mundopc;

import com.gm.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        // Dispositivos ComputadoraHP
        Monitor MonitorHP = new Monitor("HP" , 111 );
        Teclado TecladoHP = new Teclado("USB", "HP");
        Raton RatonHP = new Raton("Bluetooth", "HP");

        // Objeto ComputadoraHP de tipo Computadora
        Computadora ComputadoraHP = new Computadora("PC HP", MonitorHP, TecladoHP, RatonHP);

        // Dispositivos ComputadoraLG
        Monitor MonitorLG = new Monitor("LG" , 146 );
        Teclado TecladoLG = new Teclado("USB", "LG");
        Raton RatonLG = new Raton("Bluetooth", "LG");

        // Objeto ComputadoraLG de tipo Computadora
        Computadora ComputadoraLG = new Computadora("PC LG", MonitorLG, TecladoLG, RatonLG);

        // Dispositivos ComputadoraASUS
        Monitor MonitorAsus = new Monitor("Asus", 250);
        Teclado TecladoAsus = new Teclado("Tipo C" , "RedDragon");
        Raton RatonAsus = new Raton("USB 3.0", "RedDragon");

        // Objeto ComputadoraAsus de tipo Computadora
        Computadora ComputadoraAsus = new Computadora("PC ASUS", MonitorAsus, TecladoAsus, RatonAsus);

        Orden orden1 = new Orden();
        orden1.agregarComputadora(ComputadoraHP);
        orden1.agregarComputadora(ComputadoraLG);

        orden1.mostrarOrden();

        Orden orden2 = new Orden();
        orden2.agregarComputadora(ComputadoraAsus);

    }
}
