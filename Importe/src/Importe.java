
import java.util.Scanner; // El Scanner es para poder introducir valores
public class Importe 
{
	public static void main(String[] args)
	{
		int colegio, nivel;
		Scanner prim = new Scanner(System.in);
		System.out.println("Introduce el tipo de colegio donde 1 = Nacional y 2 = Particular: ");
		colegio = prim.nextInt();
		// le hemos pedido un valor que indica el tipo de colegio
		Scanner sec = new Scanner(System.in);
		System.out.println("Introduce el nivel donde 1 = NivelA, 2 = NivelB y 3 = Nivel C: ");
		nivel = prim.nextInt();
		// le hemos pedido un valor que indica el nivel
		if (colegio == 1) // si estamos dentro de la opcion Nacional pasamos por la siguente rutina
		{
			if (nivel == 1)
				System.out.println("Tienes que pagar 300 euros.");
			else if (nivel == 2)
				System.out.println("Tienes que pagar 200 euros.");
			else
				System.out.println("Tienes que pagar 100 euros.");
		}
		else if (colegio == 1)
		{
			if (nivel == 1)
				System.out.println("Tienes que pagar 400 euros.");
			else if (nivel == 2)
				System.out.println("Tienes que pagar 300 euros.");
			else
				System.out.println("Tienes que pagar 200 euros.");
		}
		else
			System.out.println("Alguna opcion es incorecta.");
	}
	
}
