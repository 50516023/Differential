package differential;

import java.util.Scanner;
//���Ό덷����ԏ������̂�h=9.999999498444444E-8
public class Differential_main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Input value of a > ");
		double a= Double.parseDouble(scan.next());
		System.out.print("Input value of h > ");
		double h= Double.parseDouble(scan.next());
		Differential_lib dlib = new Differential_lib(a,h);
		System.out.println("f(x)=x^2��x="+a+"�ɂ���������W����"+dlib.getRx());
		System.out.println("f(x)=x^2��x="+a+"�ɂ����鐔�l�ϕ���"+dlib.getDx());
		System.out.println("���Ό덷��"+(Math.abs(dlib.getRx()-dlib.getDx()))/(dlib.getRx())*100);
	}
}