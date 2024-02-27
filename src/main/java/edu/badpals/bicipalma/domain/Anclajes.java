package edu.badpals.bicipalma.domain;
import edu.badpals.bicipalma.domain.Bicicleta;

public class Anclajes {

    private Anclaje[] anclajes;
    Anclajes (int numAnclajes){
        this.anclajes = new Anclaje[numAnclajes];
        crearAnclajes();
    }

    private void crearAnclajes(){
            for ( int i = 0; i < anclajes.length; i++){
                this.anclajes[i] = new Anclaje(false, null);
            }
    }

    Anclaje[] anclajes(){
            return  this.anclajes;
    }

    int numAnclajes(){
        return this.anclajes.length;
    }

    void ocuparAnclaje(int posicion, Bicicleta bici){
         this.anclajes[posicion].anclarBici(bici);
    }

    boolean isAnclajeOcupado(int posicion){
        return this.anclajes[posicion].isOcupado();
    }

    void liberarAnclaje(int posicion){
         this.anclajes[posicion].liberarBici();
    }

    Bicicleta getBici (int posicion){
        return this.anclajes[posicion].getBici();
    }

    public String toString() {
        return "Número de ancñajes: " + Integer.toString(numAnclajes());
    }
}
