package exemple;

import bandeau.Bandeau;

import java.util.List;

public abstract class Effet {
    List<Scenario> scenarioList;

    public abstract void animate(Bandeau bandeau);

}
