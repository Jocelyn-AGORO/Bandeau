package exemple;

import bandeau.Bandeau;

public class Rotation extends Effet {
    double angle = Math.PI/6;

    public Rotation() {

    }

    public Rotation(double angle) {
        this.angle = angle;
    }

    public void animate(Bandeau bandeau) {
        double start = Math.PI/2;
        for(int i= 0; i < 10; i++ ){
            bandeau.setRotation(start+i*angle);
            bandeau.sleep(100);
        }
    }

}
