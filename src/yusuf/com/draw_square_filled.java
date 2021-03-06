package yusuf.com;

import java.util.Scanner;

public class draw_square_filled {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int number, i=0, k=1;
		boolean finish = false;
		
		System.out.print("Please enter a number: ");
		number = sc.nextInt();	
	
		while(!finish) {
		   switch(k%(number+1)) {
		      case 0:
		    	  finish = true;
			     break;
		      default:
			     do{
				     System.out.print("*");
				     i++;	
			     }while((i%number != 0));
			     System.out.println();
			     k++;
		   }
		}
	}
}