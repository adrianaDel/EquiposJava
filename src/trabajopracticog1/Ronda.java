/*

 */
package trabajopracticog1;


public class Ronda {
    private int numero;
    private Partido partidos;
   
    public Ronda(int numero,Partido partidos) {
    this.numero= numero;
    this.partidos= partidos;
    }
    public Ronda() {
    this.numero= 0;
    this.partidos=new Partido();
    }
    public int getNumero() {
    return numero;
    }
    public void setNumero(int numero) {
    this.numero = numero;
    }
    public Partido getPartidos() {
        return partidos;
    }
    public void setPartidos(Partido partidos) {
        this.partidos= partidos;
    } 
    @Override
    public String toString() {
    return "Ronda{"+"numero:" + numero + ", partidos:" + partidos +'}';
    }
 }

   
