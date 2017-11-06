
import java.util.Random; //utilizamos el Random para poder generar un numero aleatorio
public class Dados 
{
	public static void main(String[] args)
	{
		int dado1, dado2, dado3;
		Random rand = new Random();
		dado1 = rand.nextInt(6) + 1; // le indicamos que los numeros que se tienen que generar van de 1 a 6. 
		Random rand1 = new Random(); //si no le ponemos +1, cogera numeros de 0 a 5
		dado2 = rand.nextInt(6) + 1;
		Random rand2 = new Random();
		dado3 = rand.nextInt(6) + 1;
		if (dado1 == 6 && dado2 == 6 && dado3 == 6) // En las siguentes lineas lanzamos condiciones 
													//y gastamos y u o para encontrar todas las posibilidades
			System.out.println("Felicidades campeon, has ganado el oro.");
		else if ((dado1 == 6 && dado2 == 6) || (dado1 == 6 && dado3 == 6) || (dado2 == 6 && dado3 == 6))
			System.out.println("Felicidades, has ganado la plata.");
		else if ((dado1 == 6) || (dado2 == 6) || (dado3 == 6))
			System.out.println("Felicidades, has ganado el bronce.");
		else
			System.out.println("Perdedor.");
	System.out.println("La combinacion de los dados: " +dado1+ " dado 1, " +dado2+ " dado2, " +dado3+ " dado 3.");
	// mostramos ros resultados para que el jugador se concentre mas en los numeros ganadores a la proxima
	}
}
