/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lisadiazdelvalle_examen1p2;

/**
 *
 * @author HTS
 */
public class Computadora {
    protected String IP;
    protected String MascaraRed;
    protected String Hostname;

    public Computadora() {
    }

    public Computadora(String IP, String MascaraRed, String Hostname) {
        this.IP = IP;
        this.MascaraRed = MascaraRed;
        this.Hostname = Hostname;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }

    public String getMascaraRed() {
        return MascaraRed;
    }

    public void setMascaraRed(String MascaraRed) {
        this.MascaraRed = MascaraRed;
    }

    public String getHostname() {
        return Hostname;
    }

    public void setHostname(String Hostname) {
        this.Hostname = Hostname;
    }

    @Override
    public String toString() {
        return  "\nHostname:" + Hostname + "\nIP:" + IP + "\nMascara de Red:" + MascaraRed ;
    }
    
    
    
}
