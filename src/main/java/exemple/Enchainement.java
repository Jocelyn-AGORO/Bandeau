package exemple;

import java.util.ArrayList;
import java.util.List;

public class Enchainement {
    private Effet effet;
    private Scenario scenario;

    int nbrepetition = 1;

    public Enchainement(Effet effet, Scenario scenario, int nbrepetition) {
        this.effet = effet;
        this.scenario = scenario;
        this.nbrepetition = nbrepetition;
    }

    public int getNbrepetition() {
        return nbrepetition;
    }

    public Effet getEffet() {
        return effet;
    }

    public void setEffet(Effet effet) {
        this.effet = effet;
    }

}
