/*

 */
package trabajopracticog1;

public class Pronostico {
    private Equipo Equipo;
    private Partido Partido;
    private char resultado;
    
    public Pronostico(Equipo Equipo, Partido Partido, char resultado) {
        this.Equipo = Equipo;
        this.Partido = Partido;
        this.resultado = resultado;
    }
     public Pronostico() {
        this.Equipo = new Equipo();
        this.Partido = new Partido();
        this.resultado = '\0'; 
    } 
    public Equipo getEquipo() {
        return Equipo;
    }
    
    public void setEquipo(Equipo Equipo) {
        this.Equipo = Equipo;
    }
    
    public Partido getPartido() {
        return Partido;
    }
    
    public void setPartido(Partido Partido) {
        this.Partido = Partido;
    }
    
    public char getResultado() {
        return resultado;
    }
    
    public void setResultado(char resultado) {
        this.resultado = resultado;
    }
    @Override
    public String toString() {
    return "Pronostico {"+"Equipo:" + Equipo + ", partido=" + Partido + ", resultado=" + resultado +'}';
    }    
}