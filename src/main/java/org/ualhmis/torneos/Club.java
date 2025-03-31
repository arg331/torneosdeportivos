package org.ualhmis.torneos;
import java.util.ArrayList;
import java.util.Arrays;

public class Club {
    ArrayList <Equipo> equipos = new ArrayList<>();
/*
 * Un equipo podrá estar en modalidades y categorías distintas
 */


    public Club(Equipo ... equipos){
     if (equipos == null) throw new IllegalArgumentException("El equipo no puede estar vacío");
        this.equipos = new ArrayList<>(Arrays.asList(equipos));

    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }


    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }
    
}
