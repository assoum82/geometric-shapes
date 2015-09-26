package geometricShapes.triangle;

import geometricShapes.Triangle;

/**
 * Created by fcmam5 on 26/09/15.
 */
public class Equilateral extends Triangle{
    public Equilateral(double base, double hauteur) {
        super(base, hauteur);
    }
    @Override
    public double perimetre(){
        return (super.getBase()*3);
    }
}
