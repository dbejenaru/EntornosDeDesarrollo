import java.util.Scanner;
public class Temporada 
{
	public static void main(String[] args) 
	{
	    Scanner reader = new Scanner(System.in);
	    System.out.println("Introduce un numero de 1 a 4 inclusivo ");
	    int temp = reader.nextInt();
	    String a = null;
	    switch(temp) 
	    {
	         case 1 :
	            a = "Verano"; 
	            break;
	         case 2 :
	            a = "Otono";
	            break;
	         case 3 :
	            a = "Invierno";
	         case 4 :
	            a = "Primavera";
	            break;
	         default :
	            System.out.println("No se ha introducido informacion valida");
	    }
	    System.out.println("Estamos en " + a );
	    reader.close(); 
	 }
}
