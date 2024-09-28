import java.util.Scanner;

public class SecondOrder {

    public static void main(String[] args) {
       //geting information of S1, S2, C1, C2
        var s = new Scanner(System.in);
        //String junk = s.next();
        System.out.println("S(1)");
        double S1 = s.nextDouble();
        System.out.println("S(2)");
        //junk = s.next();
        double S2 = s.nextDouble();
        System.out.println("c1");
        //junk = s.next();
        double C1 = s.nextDouble();
        System.out.println("c2");
        //junk = s.next();
        double C2 = s.nextDouble();

        //getting r1, r2, p, and q from advanced variables
        double a = 1;
        double b = -C1;
        double c = -C2;

        //quardraric
        double r1=(-b+Math.sqrt(b*b - 4*a*c))/(2*a);
        double r2=(-b-Math.sqrt(b*b - 4*a*c))/(2*a);
        System.out.println("r1 is:"+r1);
        System.out.println("r2 is:"+r2);
        //find p and q
        double p = (S2-(S1*r2))/(r1-r2);
        double q = S1-p;
        System.out.println("p is:"+p);
        System.out.println("q is:"+q);
        System.out.println("S2: "+S2);
        System.out.println("S1: "+S1);

        //making S(n) until S10
        for (int n=1;n <11 ;n++ ){
            double Sn = p* Math.pow(r1, n-1)+q*Math.pow(r2,n-1);
            System.out.println("S"+n+" = "+Sn);
        }
    }
}

