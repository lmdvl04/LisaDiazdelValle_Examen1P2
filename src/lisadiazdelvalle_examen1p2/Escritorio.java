/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lisadiazdelvalle_examen1p2;

/**
 *
 * @author HTS
 */
public class Escritorio extends Computadora {

    private int RAM;
    private int CapAlmacen;
    private String Tipo;
    private boolean TarjetaGrafica;

    public Escritorio() {
        super();
    }

    public Escritorio(int RAM, int CapAlmacen, String Tipo, boolean TarjetaGrafica, String IP, String MascaraRed, String Hostname) {
        super(IP, MascaraRed, Hostname);
        this.RAM = RAM;
        this.CapAlmacen = CapAlmacen;
        this.Tipo = Tipo;
        this.TarjetaGrafica = TarjetaGrafica;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getCapAlmacen() {
        return CapAlmacen;
    }

    public void setCapAlmacen(int CapAlmacen) {
        this.CapAlmacen = CapAlmacen;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public boolean isTarjetaGrafica() {
        return TarjetaGrafica;
    }

    public void setTarjetaGrafica(boolean TarjetaGrafica) {
        this.TarjetaGrafica = TarjetaGrafica;
    }

    @Override
    public String toString() {
        String s = super.toString() + "\nRAM:" + RAM + " GB" + "\nCapacidad de Almacen:" + CapAlmacen + " GB" + "\nTipo de almacen:" + Tipo +"\nTarjeta Grafica:";
        if (TarjetaGrafica) {
            s += " Si" ;
        } else {
            s += " No" ;
        }
        return s;
    }
}
