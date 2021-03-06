package differential;

import java.util.Scanner;
//相対誤差が一番小さいのはh=9.999999498444444E-8
public class Differential_main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Input value of a > ");
		double a= Double.parseDouble(scan.next());
		System.out.print("Input value of h > ");
		double h= Double.parseDouble(scan.next());
		Differential_lib dlib = new Differential_lib(a,h);
		System.out.println("f(x)=x^2のx="+a+"における微分係数は"+dlib.getRx());
		System.out.println("f(x)=x^2のx="+a+"における数値積分は"+dlib.getDx());
		System.out.println("相対誤差は"+(Math.abs(dlib.getRx()-dlib.getDx()))/(dlib.getRx())*100);
	}
}