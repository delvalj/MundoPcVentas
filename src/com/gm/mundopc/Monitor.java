package com.gm.mundopc;

public class Monitor {

    private final int idMonitor;
    private String marca;
    private double precio;
    private static int contadorMonitores;

    // Inicializo el idMonitor
    private Monitor() {
        this.idMonitor = ++Monitor.contadorMonitores;
    }

    public Monitor(int idMonitor, String marca, double precio) {
        this();
        this.marca = marca;
        this.precio = precio;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "idMonitor=" + idMonitor +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                '}';
    }
}

