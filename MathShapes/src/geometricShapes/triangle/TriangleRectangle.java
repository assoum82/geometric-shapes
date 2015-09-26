package geometricShapes.triangle;
import geometricShapes.Triangle;

/**
 * Created by fcmam5 on 26/09/15.
 */
public class TriangleRectangle extends Triangle {
    private double hypotenuse = Math.sqrt(Math.pow(super.getBase(), 2) + Math.pow(super.getHauteur(), 2));

    public TriangleRectangle(double base, double hauteur, double hypotenuse) {
        super(base, hauteur);
        this.hypotenuse = hypotenuse;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }


    public double perimetre() {
        return (super.getBase() + super.getHauteur() + this.hypotenuse);
    }
}