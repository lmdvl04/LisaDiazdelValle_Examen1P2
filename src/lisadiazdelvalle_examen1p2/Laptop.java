/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lisadiazdelvalle_examen1p2;

/**
 *
 * @author HTS
 */
public class Laptop extends Computadora {

    private String marca;
    private String DefPantalla;
    private boolean RGB;

    public Laptop() {
        super();
    }

    public Laptop(String marca, String DefPantalla, boolean RGB, String IP, String MascaraRed, String Hostname) {
        super(IP, MascaraRed, Hostname);
        this.marca = marca;
        this.DefPantalla = DefPantalla;
        this.RGB = RGB;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDefPantalla() {
        return DefPantalla;
    }

    public void setDefPantalla(String DefPantalla) {
        this.DefPantalla = DefPantalla;
    }

    public boolean isRGB() {
        return RGB;
    }

    public void setRGB(boolean RGB) {
        this.RGB = RGB;
    }

    @Override
    public String toString() {
        String s = super.toString() + "\nMarca:" + marca + "\nDefinicion de Pantalla:" + DefPantalla + "\nRGB:";
        if (RGB) {
            s += " Si";
        } else {
            s += " No";
        }
        return s;
    }
}
