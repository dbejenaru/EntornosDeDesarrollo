import java.util.Scanner;
public class Temp 
{
	public static void main(String[] args) 
	{
	    Scanner reader = new Scanner(System.in);
	    System.out.println("Que indica el termometro? ");
	    int temp = reader.nextInt();
	    String c;
	    if (temp < 10)
	       c = "Frio";
	    else if (10 < temp && temp < 20) 
	    	c = "Templado";
	    else if (20 < temp && temp < 30)
	    	c = "Calor";
	    else
	    	c = "Tropical";
	    System.out.println("El tiempo: " + c);
	    reader.close(); 
	 }
}
