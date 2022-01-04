import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	double armutTl = 2.14;
    double elmaTl = 3.67;
    double domatesTl = 1.11;
    double muzTl = 0.95;
    double patlıcanTl = 5.00;
    double armut,elma,domates,muz,patlıcan;
    Scanner scn = new Scanner(System.in);
    System.out.print("Kaç kilo armut aldınız : ");
    armut = scn.nextDouble();
    armut = (armut == 0) ? armut : armut*armutTl;
    System.out.print("Kaç kilo elma aldınız : ");
    elma = scn.nextDouble();
    elma = (elma == 0) ? elma : elma*elmaTl;
    System.out.print("Kaç kilo domates aldınız : ");
    domates = scn.nextDouble();
    domates = (domates == 0) ? domates : domates*domatesTl;
    System.out.print("Kaç kilo muz aldınız : ");
    muz = scn.nextDouble();
    muz = (muz == 0) ? muz : muz*muzTl;
    System.out.print("Kaç kilo patlıcan aldınız : ");
    patlıcan = scn.nextDouble();
    patlıcan = (patlıcan == 0) ? patlıcan : patlıcan*patlıcanTl;

    double toplam = armut+elma+domates+muz+patlıcan;

    System.out.println("Toplam ödeyeceğiniz tutar : " + toplam);

    }
}
