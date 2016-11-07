package differential;

import java.util.Scanner;
//‘Š‘ÎŒë·‚ªˆê”Ô¬‚³‚¢‚Ì‚Íh=9.999999498444444E-8
public class Differential_main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Input value of a > ");
		double a= Double.parseDouble(scan.next());
		System.out.print("Input value of h > ");
		double h= Double.parseDouble(scan.next());
		Differential_lib dlib = new Differential_lib(a,h);
		System.out.println("f(x)=x^2‚Ìx="+a+"‚É‚¨‚¯‚é”÷•ªŒW”‚Í"+dlib.getRx());
		System.out.println("f(x)=x^2‚Ìx="+a+"‚É‚¨‚¯‚é”’lÏ•ª‚Í"+dlib.getDx());
		System.out.println("‘Š‘ÎŒë·‚Í"+(Math.abs(dlib.getRx()-dlib.getDx()))/(dlib.getRx())*100);
	}
}