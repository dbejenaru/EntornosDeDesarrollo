
import java.util.Scanner;
public class Multiple 
{
	public static void main(String[] args) 
	{

	    Scanner reader = new Scanner(System.in);
	    System.out.println("Introduce un numero: ");
	    int num1 = reader.nextInt();
	    String a;
	    	
	    if(((num1 % 3) == 0) && ((num1 % 5) == 0))
	//    {
	    a = "es";
	    
	    	//System.out.println("El numero " + num1 + " es multiple de 3 y 5."); Es la primera version que hice.
	//    }   menos lineas de codigo :))
	    else 
	    	//System.out.println("El numero " + num1 + " no es multiple de 3 y 5 ");
	    	a = "no es";
	        
	    System.out.println("El numero " + num1 + " " + a + " multiple de 3 y 5 ");
	        reader.close();
	  }

}