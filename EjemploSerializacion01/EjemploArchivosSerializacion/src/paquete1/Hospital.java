
package paquete1;

import java.io.Serializable;


public class Hospital implements Serializable{
    
    String nombre;
    int numeroCamas;
    double presupuesto;

    public Hospital(String nombre, int numeroCamas, double presupuesto) {
        this.nombre = nombre;
        this.numeroCamas = numeroCamas;
        this.presupuesto = presupuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

}

/* 
Agregar valor de objetos de tipo Hospital a un archivo
Y leer el archivo
 */
