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
//        System.out.println("r1 ="+r1);
//        System.out.println("r2 ="+r2);
        //find p and q
        double p = (S2-(S1*r2))/(r1-r2);
        double q = S1-p;


        //making S(n) until S10

        if (r1==r2){
            p = S1;
            q= (S2-S1*r1)/r1;
            System.out.println("r1="+r1);
            System.out.println("r2="+r2);
            System.out.println("p ="+p);
            System.out.println("q ="+q);
            System.out.println("S(n) ="+"("+p+")"+"("+r1+")"+"^"+"(n-1)"+" + "+"("+q+")"+"("+p+")"+"("+r2+")");

            for (int n=1;n<11; n++){
                    double Sn = p* Math.pow(r1,n-1)+q*(n-1)*Math.pow(r1,n-1);
                    System.out.println("S"+n+" = "+Sn);

        }}else {
            System.out.println("r1="+r1);
            System.out.println("r2="+r2);
            System.out.println("p ="+p);
            System.out.println("q ="+q);
            System.out.println("S(n) ="+"("+p+")"+"("+r1+")"+"^"+"(n-1)"+" + "+"("+q+")"+"("+p+")"+"("+r2+")");

            for (int n=1;n <11 ;n++ ){
                double Sn = p* Math.pow(r1, n-1)+q*Math.pow(r2,n-1);
                System.out.println("S"+n+" = "+Sn);

            }
        }
    }
}

