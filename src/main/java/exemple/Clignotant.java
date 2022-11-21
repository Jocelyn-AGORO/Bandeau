package exemple;

import bandeau.Bandeau;

public class Clignotant extends Effet {

    public void animate(Bandeau bandeau) {
        String message = bandeau.getMessage();
        bandeau.setMessage("");
        bandeau.sleep(500);
        bandeau.setMessage(message);
    }

}
