import java.util.Scanner;
public class Cuenta 
{
	public static void main(String[] args) 
	{
	    Scanner reader = new Scanner(System.in);
	    System.out.println("Introduce el importe: ");
	    double imp = reader.nextInt();
	    double pag, pagar;
	    pagar = imp + (imp*0.19); // no entiendo cuando se le aplica el IVA. Si es al importe inicial lo calculamos al 
	    							// principio, y si no, hacemos el calculo al final.
	    if (imp <= 100)
	       pag = pagar - (pagar*0.10);
	    else 
	    	pag = pagar - (pagar*0.20);
	    System.out.println("Tienes que pagar " + pag + " euros.");
	    reader.close(); // Esto lo vi en un ejemplo. Me imagino que deja de gastar recursos
	 }
}
