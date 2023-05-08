import java.util.Scanner;

public class GravitionalForce {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // F = GM1M2/RR:
           double m1=0;
           double m2 =0;
           double r=0;
           double G = 6.6743*Math.pow(10, (-11));

        System.out.println("Enter value of m1,m2 and r");
            m1= sc.nextInt();
            m2= sc.nextInt();
            r= sc.nextInt();

        System.out.println("Gravitational Force between two masses = "+ (G*m1*m2)/(r*r));


    }
}
