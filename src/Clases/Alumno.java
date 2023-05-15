package Clases;

import java.util.Map;
import java.util.TreeMap;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Alumno {
    int legajo;
    String apellido;
    String nombre;
    Map<Integer,Materia> materias;

    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
        materias=new TreeMap();
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Map<Integer, Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(Map<Integer, Materia> materias) {
        this.materias = materias;
    }
    
    public void agregarMateria(Materia m){
        if(!materias.containsKey(m.getIdMateria())){
            materias.put(m.getIdMateria(), m);
            JOptionPane.showMessageDialog(null, "Inscripto correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "No se puede inscribir a la misma materia");
        }
    }
    
    public int catidadMaterias(){
        return materias.size();
    }
}
