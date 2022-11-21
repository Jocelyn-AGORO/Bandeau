package exemple;

import bandeau.Bandeau;

public class Pendu extends Effet {

    private String messageTemplate(Bandeau bandeau){
        StringBuilder message = new StringBuilder();
        for(int i = 0; i < bandeau.getMessage().length(); i++) {
            message.append('_');
        }
        return message.toString();
    }

    @Override
    public void animate(Bandeau bandeau){
        String message = messageTemplate(bandeau);
        return;
    }
}
