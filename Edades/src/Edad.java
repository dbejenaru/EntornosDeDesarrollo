
import java.util.Scanner;
public class Edad
{
	public static void main(String[] arguments)
	{
		//introduce la primera edad
		
		Scanner reader = new Scanner(System.in);
		int edad1, edad2, dif;
		Scanner prim = new Scanner(System.in);
		System.out.println("Introduce el primer valor EDAD: ");
		edad1 = prim.nextInt();
		System.out.println("Edad 1 = " + edad1);
		
		//introduce la segunda edad
		
		Scanner sec = new Scanner(System.in);
		System.out.println("Introduce el segundo valor EDAD: ");
		edad2 = sec.nextInt();
		System.out.println("Edad 1 = " + edad2);
		
		if ((edad1 < 100) && (edad2 < 100) && (edad1<edad2))
		{
			dif=edad2-edad1;
			System.out.println("La diferencia de edad es de = " + dif + " anos");
		}
		else if ((edad1 < 100) && (edad2 < 100) && (edad2<edad1))
		{
			dif=edad1-edad2;
			System.out.println("La diferencia de edad es de = " + dif + " anos");
		}
		else
			System.out.println("Los valores introducidos no son reales");
		
	
	}
}