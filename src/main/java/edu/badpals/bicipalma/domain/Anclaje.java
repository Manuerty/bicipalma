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
    return false;
    }

    Bicicleta getBici(){
        return ;
    }

    void anclarBici (Bicicleta bici){

    }


    void liberarBici(){


    }

    @Override
    public String toString() {
        return isOcupado() ? "Ocupado" : "Libre";
    }
}
