package edu.badpals.bicipalma.domain;
import edu.badpals.bicipalma.domain.Bicicleta;
public class Anclaje {

    private boolean ocupado;
    private Bicicleta bici;

    Anclaje(boolean ocupado, Bicicleta bici){
        this.ocupado = ocupado;
        this.bici = bici;
    }

    boolean isOcupado(){
        return this.ocupado;
    }

    Bicicleta getBici(){
        return this.bici;
    }

    void anclarBici (Bicicleta bici){
        this.bici = bici;
        this.ocupado = true;
    }


    void liberarBici(){
        this.bici = null;
        this.ocupado = false;
    }

    @Override
    public String toString() {
        return isOcupado() ? "Ocupado" : "Libre";
    }
}
