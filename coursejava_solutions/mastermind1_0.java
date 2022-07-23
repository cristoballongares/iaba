import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
import java.math.*;
import java.util.*;
public class index{

		public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random ran = new Random();
		// Array
		char[] characters = new char[4];
		String respuesta;
		char[] compareR = new char[4];
		// variables uso general
		int i=0,j,k,l,m,b=0,r=0;

		// Booleano para determinar si gano o pardio dksajdsd
		Boolean win = false;

		while(i<4){
		characters[i] = (char)(ran.nextInt(26)+'a');
		i++;
		}		

		m=1;
		i=1;
		l=0;
		System.out.println();
		System.out.println("Dispones de 10 intentos para adivinar la combinacion de palabras al azar!\n'B: x': Si la letra se encuentra en la mismsa posicion\n'R: x': Si la letra coincide pero no esta en la misma posicion");
		while(i<11){
			b=0;
			r=0;
			m=2;
			l=0;
			System.out.print("\nIntento "+i+"\nEscribe la combinacion que piensas que sea correcta >> [uhdl], [fkcy] ");
			respuesta = in.nextLine();
			System.out.println();
			i++;
			for(j=0;j<4;j++){
				compareR[j] = respuesta.charAt(j);
					if(compareR[j]==characters[j]){
						b++;
					}
			}
			if(compareR[0]==characters[1]){
				r++;
			} 
			if(compareR[0]==characters[2]){
				r++;
			}
			if(compareR[0] == characters[3]){
				r++;
			}
			if(compareR[1] == characters[0]){
				r++;
			} 
			if(compareR[1] == characters[2]){
				r++;
			} 
			if(compareR[1] == characters[3]){
				r++;
			}
			if(compareR[2] == characters[3]){
				r++;
			}
			if(compareR[2] == characters[1]){
				r++;
			}
			if(compareR[2] == characters[0]){
				r++;
			}
			if(compareR[3] == characters[1]){
				r++;
			}
			if(compareR[3] == characters[2]){
				r++;
			}
			if(compareR[3] == characters[0]){
				r++;
			}
			System.out.print("\nB: "+b+"\nR: "+r);

		}
	}
}