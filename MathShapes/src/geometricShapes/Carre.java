package geometricShapes;

/**
 * Created by fcmam5 on 25/09/15.
 */
public class Carre extends Rectangle {
    double cote;

    public Carre(double cote) {
        super(cote, cote);
    }

    public double getCote() {
        return cote;
    }

    public void setCote(double cote) {
        this.cote = cote;
    }

    //Surface
    @Override
    public double surface(){
        return super.surface();
    }

    //Perimetre
    @Override
    public double perimetre(){
        return super.perimetre();
    }

}
