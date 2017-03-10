package laborator_pa;

import java.util.*;
public class Pa_lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner citire=new Scanner(System.in);
		int a,b;
		 a=citire.nextInt();
		 b=citire.nextInt();
		 System.out.println("suma " + a+b);
		 
		 int prod=0;
		 while(a>0)
		 {
			 if(a%2!=0)
			 {
				 prod=prod+b;
				 a=a/2;
				 b=b+b;
			 }
		 }
		 
		  
		 System.out.println("Produsul este=" + prod);
	}

}
