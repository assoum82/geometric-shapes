package geometricShapes;

/**
 * Created by fcmam5 on 25/09/15.
 */
public class Cercle extends GeometricShapes{
    private double piValue = 3.14;
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double surface(){
        return (rayon*rayon*piValue);
    }

    @Override
    public double perimetre() {
        return (rayon*2*piValue);
    }
}
