package demo;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double bp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic pay of employee");
		bp=sc.nextFloat();
		double da,hra,pf,gp,np;
		da=0.24*bp;
		hra=0.15*bp;
		pf=0.833*bp;
		gp=bp+da+hra;
		np=gp-pf;
		System.out.println("Gp is : "+gp);
		System.out.println("Np is : "+np);
		
		
		
		
	}

}
