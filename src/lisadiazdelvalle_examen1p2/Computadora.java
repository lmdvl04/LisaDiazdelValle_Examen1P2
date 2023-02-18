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
    
    public String dectobin (String ip){
        String cadena [] = ip.split("\\.");
        String binario = "";
        int modulo;
        for (int i = 0; i < cadena.length; i++) {  
            int octeto = Integer.parseInt(cadena[i]);
            while(octeto>0){
                modulo = octeto%2;
                binario = modulo + binario;
                octeto = octeto/2;
            }
            
        }
        return binario;
    }
    public boolean siConecta (String ip1){
        boolean si = false;
        String binario1 = dectobin(this.IP); 
        String binario2 = dectobin(ip1);
        String binariom = dectobin(this.MascaraRed);      
        int unos = binariom.indexOf("0");
        for (int i = 0; i < unos; i++) {
            if (binario1.charAt(i)==binario2.charAt(i)){
                si = true;
            }
            
        }
        return si;
    }
    public String ping(String ip){
        String result = "";
        if(GUI.exists(ip)==false&& siConecta(ip)==true){ //inalcanzable
            result = this.Hostname+"#ping_"+ip
                    +"Pinging to " +ip+ "with 32 bits of data:\n" 
                    + "Reply from " + ip+ ": Destination host unreachable\n"
                    + "Reply from " + ip+ ": Destination host unreachable\n"
                    + "Reply from " + ip+ ": Destination host unreachable\n"
                    + "Reply from " + ip+ ": Destination host unreachable\n"
                    + "\n"
                    + "Ping statistics for " + ip+ ":\n"
                    + " Packets: Sent = 4, Recieved = 0, Lost = 4 (100% loss)\n"
                    + this.Hostname + "#";
                    
        }else if(GUI.exists(ip)==true&& siConecta(ip)==true){ //exitoso
            result = "Pinging to " +ip+ "with 32 bits of data:\n" 
                    + "Reply from " + ip+ ": bytes=32 time=37ms TTL=46\n"
                    + "Reply from " + ip+ ": bytes=32 time=37ms TTL=46\n"
                    + "Reply from " + ip+ ": bytes=32 time=37ms TTL=46\n"
                    + "Reply from " + ip+ ": bytes=32 time=37ms TTL=46\n"
                    + "\n"
                    + "Ping statistics for " + ip+ ":\n"
                    + " Packets: Sent = 4, Recieved = 4, Lost = 0 (0% loss)\n"
                    + this.Hostname + "#";
            
        }else{//sin resuesta
            result = "Pinging to " +ip+ "with 32 bits of data:\n" 
                    + "Requested timed out\n"
                    + "Requested timed out\n"
                    + "Requested timed out\n"
                    + "Requested timed out\n"
                    + "\n"
                    + "Ping statistics for " + ip+ ":\n"
                    + " Packets: Sent = 4, Recieved = 0, Lost = 0 (100% loss)\n"
                    + this.Hostname + "#";
        }
     return result;   
    }
  
    
}
