import geometricShapes.*;

import java.util.Scanner;

/**
 * Created by fcmam5 on 25/09/15.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Welcome to my homework, please choose a shape: ");
        System.out.println("\n\n1: Square\n2: Rectangle\n3: Circle\n4: Triangle");


        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        double l;
        double larg;

        switch (choice){
            case 1:
                do {
                    System.out.println("Introduce a valide side length");
                    l = scanner.nextDouble();
                } while (l<0);
                //Here we know that we have a correct value, so let's create our Object :D
                Carre square = new Carre(l);
                System.out.println("Surface: "+square.surface());
                System.out.println("Perimetre: "+square.perimetre());
                break;
            case 2:
                System.out.println("Plase introduce a correct values");
                do {
                    System.out.println("What lengh");
                    l = scanner.nextDouble();
                    System.out.println("What widith");
                    larg = scanner.nextDouble();
                }while((l<0)&&(larg<0));
                //Here we know that we have a correct value, so let's create our Object :D
                Rectangle rectangle = new Rectangle(l,larg);
                System.out.println("Surface: "+rectangle.surface());
                System.out.println("Perimetre: "+rectangle.perimetre());
                break;
            case 3:
                System.out.println("Plase introduce a correct value");
                do {
                    System.out.println("What radius");
                    l = scanner.nextDouble();
                }while(l<0);
                Cercle circle = new Cercle(l);
                System.out.println("Surface: "+circle.surface());
                System.out.println("Perimetre: "+circle.perimetre());
                System.out.println("Generated for PI=3.14"); //You can modify the piValue variable on Cercle class for more/less PI precision
                break;
            case 4:
                System.out.println("This aerea is not done yet :-( \n but at least the classes are ready");
                /**Reserved for Triangles**/
                break;
            default:
                System.out.println("Please introduce a correct choice :)");break;
        }

        // The main method needs alot of work & optimisation :\
    }
}
