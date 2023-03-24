/*
Crear en java todas las clases del modelo,sus atributos y metodos generales:
constructores, setters(entrada), getters(salida) toString(String con todos los 
datos que tendran los objetos).
Sugerencias
1.Crear la clase Equipo,Partido y Pronostico.
2.Crear la clase Ronda y Participante.
3.Crear un programa que pruebe todas las clases,cargando o asignando datos para
cada clase, cargando o asignando datos para cada clase y mostrando sus datos por
consola(no obligatorio).
 */
package trabajopracticog1;

public class Equipo {
    private String nombre;
    private String descripcion;
   
    public Equipo(String nombre, String descripcion){
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    public Equipo() {   
        this.nombre="";
        this.descripcion="";     
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    } 
    public void setDescripcion(String descripcion) {
        this.descripcion=descripcion;
    } 
    @Override
    public String toString() {
        return "Equipo [nombre=" + nombre + ", descripcion=" + descripcion +  "]";
    }  
 }
   
