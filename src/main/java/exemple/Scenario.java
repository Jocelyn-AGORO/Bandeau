package exemple;

import bandeau.Bandeau;

import java.util.ArrayList;
import java.util.List;

public class Scenario {
    List<Enchainement> enchainements;

    public Scenario(){
        this.enchainements = new ArrayList<>();
    }

    public void start(Bandeau bandeau) {
        for(Enchainement enchainement : enchainements) {
            for(int i = 0; i < enchainement.getNbrepetition(); i++){
                enchainement.getEffet().animate(bandeau);
                bandeau.sleep(500);
            }
        }
    }

    public void addEffect(Effet effet, int nbrepetition) {
        Enchainement enchainement = new Enchainement(effet, this, nbrepetition);
        enchainements.add(enchainement);
    }

}
