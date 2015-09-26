package geometricShapes;

/**
 * Created by fcmam5 on 25/09/15.
 */
public class Rectangle extends GeometricShapes{
    private double largeur; //Largeur
    private double longueur; //Longueur

    public Rectangle(double largeur, double longueur) {
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    //Surface
    @Override
    public double surface(){
        return (largeur*longueur);
    }

    //Périmètre
    @Override
    public double perimetre(){
        return (largeur+longueur)*2;
    }
}