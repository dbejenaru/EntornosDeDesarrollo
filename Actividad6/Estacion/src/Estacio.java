import java.util.Scanner;
public class Estacio 
{
	public static void main(String[] args) 
	{
	    Scanner reader = new Scanner(System.in);
	    System.out.println("Indica el mes del ano: ");
	    int mes = reader.nextInt();
	    String a = null;
	    switch(mes) 
	    {
	         case 3 :
	         case 4 :
	         case 5 :
	            a = "Primavera"; 
	            break;
	         case 6 :
	         case 7 :
	         case 8 :
	            a = "Verano";
	            break;
	         case 9 :
	         case 10 :
	        	a = "Otono";
	         case 11 :
	         case 12 :
	         case 1 :
	         case 2 :
	            a = "Invierno";
	            break;
	         default :
	            System.out.println("No se ha introducido informacion valida");
	    }
	    System.out.println("Estamos en " + a );
	    reader.close(); 
	 }
}