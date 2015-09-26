package geometricShapes;

/**
 * Created by fcmam5 on 26/09/15.
 */
abstract class Triangle extends GeometricShapes{
    private double base;
    private double hauteur;

    public Triangle(double base, double hauteur) {
        this.base = base;
        this.hauteur = hauteur;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }


    @Override
    public double surface() {
        return (this.base*this.hauteur)/2;
    }

    @Override
    public double perimetre(){
        return 0;
    }
}
