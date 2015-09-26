package geometricShapes.triangle;

import geometricShapes.Triangle;

/**
 * Created by fcmam5 on 26/09/15.
 */
public class Scalene extends Triangle{
    private double cote1;
    private double cote2;
    private double cote3;

    public Scalene(double cote1, double hauteur, double cote2, double cote3) {
        super(cote1, hauteur);
        this.cote2 = cote2;
        this.cote3 = cote3;
    }
    @Override
    public double perimetre(){
        return (this.cote1+this.cote2+this.cote3);
    }
}
