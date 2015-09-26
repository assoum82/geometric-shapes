package geometricShapes.triangle;

import geometricShapes.Triangle;

/**
 * Created by fcmam5 on 26/09/15.
 */
public class Isocele extends Triangle{
    private double cote;

    public Isocele(double base, double hauteur, double cote) {
        super(base, hauteur);
        this.cote = cote;
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }

    @Override
    public double perimetre(){
        return (this.cote*2+super.getBase());
    }
}
