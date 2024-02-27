package edu.badpals.bicipalma.domain;
import edu.badpals.bicipalma.domain.Bicicleta;
import edu.badpals.bicipalma.domain.Anclaje;
import edu.badpals.bicipalma.domain.Tarjetausuario;

public class Estacion {

    private final int id;
    private final String direccion;

    private final Anclajes NumAnclajes;

    public Estacion(int id, String direccion, int numAnclajes){
        this.id = id;
        this.direccion = direccion;
        this.NumAnclajes = new Anclajes(numAnclajes);
    }
    private int getId(){
        return this.id;
    }
    private String getDireccion(){
        return this.direccion;
    }

    private int getNumAnclajes(){
        return  this.NumAnclajes
    }

    @Override
    public String toString() {
        return super.toString();
    }

    private Anclaje anclajes(){
    return ;
    }
    private int numAnclajes(){
        return 0;
    }

    public void consultarEstacion(){
        System.out.println("id" + getId());
        System.out.println("Direccion" + getDireccion());
        System.out.println("Numero de Anclajes" + getNumAnclajes());

    }

    public int anclajesLibres(){
        return 0;
    }

    public void anclarBicicleta(Bicicleta bici){

    }
    public boolean leerTarjetaUsuario(Tarjetausuario Tarjeta){
        return true;
    }

    public void retirarBicicleta(Tarjetausuario Tarjeta){

    }

    private void mostarAnclaje (Bicicleta bici, int anclaje){

    }

    public void mostarAnclajes(){

    }


}
