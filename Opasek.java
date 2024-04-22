package logika;

import java.util.HashSet;
import java.util.Set;

public class Opasek {
    private final int omezeniOpasku;
    private Set<Vec> obsahOpasku;





    public Opasek(int omezeniKosicku) {
        this.omezeniOpasku = omezeniKosicku;
        obsahOpasku = new HashSet<Vec>();
    }

    public Vec vyndejZOpasku(String nazevVeci){
        for (Vec neco: obsahOpasku){
            if (neco.getNazev().equals(nazevVeci)){
                obsahOpasku.remove(neco);
                return neco;
            }
        }
        return null;
    }

    public boolean vlozDoKosicku(Vec vec){
        if (obsahOpasku.size()< omezeniOpasku && vec.jePrenositelna()){
            obsahOpasku.add(vec);
            return true;
        }


        return false;
    }

    public String dlouhyPopis(){
        String vypis = "Obsah opasku. ";
        for (Vec vec: obsahOpasku){
            vypis += vec.getNazev() + " ";
        }

        return vypis;
    }



}
