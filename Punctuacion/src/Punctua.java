
import java.util.Scanner; // El Scanner es para poder introducir valores
public class Punctua 
{
	public static void main(String[] args)
	{
	int n=0;
	//Scanner reader = new Scanner(System.in);
	Scanner prim = new Scanner(System.in);
	System.out.println("Introduce tu punctuacion: ");
	n = prim.nextInt();
	if (n < 70 || n > 100) // validamos si el valor esta dentro del rango requerido
		System.out.println("El valor " + n + " no ha sido valido "); // si el valor no es valido se muestra este mensaje 
	else if (n >= 70 && n < 80) // miramos si el valor es mas grande o igual a 70 o menos a 80
		System.out.println("Felicidades, con este resultado " + n + " te acceptamos en Administracion.");
	else if (n >= 80 && n < 90) // miramos si el valor es mas grande o igual a 80 o menos a 90
		System.out.println("Felicidades, con este resultado " + n + " te acceptamos en Industrial.");
	else if (n >= 90 && n < 100) // miramos si el valor es mas grande o igual a 90 o menos a 100
		System.out.println("Felicidades, con este resultado " + n + " te acceptamos en Electronica.");
	else // consideramos que cualquier otro sea el numero, va a ser 100
		System.out.println("Felicidades, con este resultado " + n + " te acceptamos en Sistemas.");
	}
}
