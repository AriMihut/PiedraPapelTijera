package juego;

import java.util.Scanner;

public class Principal {

	private static int numeroAleatorio;
	static String[] jugadas = new String[6];
	private static String jugadaOrdenador;
	private static String jugadaUsuario;
	static Scanner scaner;
	private static boolean ganador = false;
	
	public static void main(String[] args) {
		
		jugadas[0] = "Piedra";
		jugadas[1] = "Papel";
		jugadas[2] = "Tijeras";
		jugadas[3] = "Lagarto";
		jugadas[4] = "Spock";
		
			int opcion;
			scaner = new Scanner(System.in);	
		do {
			escribirMenuPrincipal();
			opcion = scaner.nextInt();
			generarJugadaOrdenador();
			System.out.println(numeroAleatorio);
			System.out.println("La jugada del ordenador= " + jugadaOrdenador);
			pedirJugadaUsuario();
			System.out.println("La jugada del usuario= " + jugadaUsuario);
			compararResuladoJugadas();
			notificarGanador();
			}while(opcion != 0);
	}
	
	private static void notificarGanador() {
		
		if(ganador == true) {
			System.out.println("El ganador es el usuario.");
		}else if(ganador == false) {
			System.out.println("El ganador es el ordenador");
		}else{
			System.out.println("Empate");
		}
		
	}

	private static void compararResuladoJugadas() {
		
		if(jugadaOrdenador == jugadas[1] && jugadaUsuario == jugadas[0]) {
			ganador = true;
		} else if(jugadaUsuario == jugadas[2] && jugadaOrdenador == jugadas[1]) {
			ganador = true;
		} else if(jugadaUsuario == jugadas[0] && jugadaOrdenador == jugadas[3]) {
			ganador = true;
		} else if(jugadaUsuario == jugadas[3] && jugadaOrdenador == jugadas[4]) {
			ganador = true;
		} else if(jugadaUsuario == jugadas[4] && jugadaOrdenador == jugadas[2]) {
			ganador = true;
		} else if(jugadaUsuario == jugadas[2] && jugadaOrdenador == jugadas[3]) {
			ganador = true;
		} else if(jugadaUsuario == jugadas[3] && jugadaOrdenador == jugadas[1]) {
			ganador = true;
		}else if(jugadaUsuario == jugadas[1] && jugadaOrdenador == jugadas[4]) {
			ganador = true;
		} else if(jugadaUsuario == jugadas[4] && jugadaOrdenador == jugadas[0]) {
			ganador = true;
		} else if(jugadaUsuario == jugadas[0] && jugadaOrdenador == jugadas[2]) {
			ganador = true;
		} else if(jugadaOrdenador == jugadas[2] && jugadaUsuario == jugadas[1]) {
			ganador = false;
		} else if(jugadaOrdenador == jugadas[1] && jugadaUsuario == jugadas[0]) {
			ganador = false;
		} else if(jugadaOrdenador == jugadas[0] && jugadaUsuario == jugadas[3]) {
			ganador = false;
		} else if(jugadaOrdenador == jugadas[3] && jugadaUsuario == jugadas[4]) {
			ganador = false;
		} else if(jugadaOrdenador == jugadas[4] && jugadaUsuario == jugadas[2]) {
			ganador = false;
		} else if(jugadaOrdenador == jugadas[2] && jugadaUsuario == jugadas[3]) {
			ganador = false;
		} else if(jugadaOrdenador == jugadas[3] && jugadaUsuario == jugadas[1]) {
			ganador = false;
		} else if(jugadaOrdenador == jugadas[1] && jugadaUsuario == jugadas[4]) {
			ganador = false;
		} else if(jugadaOrdenador == jugadas[4] && jugadaUsuario == jugadas[0]) {
			ganador = false;
		} else if(jugadaOrdenador == jugadas[0] && jugadaUsuario == jugadas[2]) {
			ganador = false;
		} else if(jugadaOrdenador == jugadas[0] && jugadaUsuario == jugadas[0]) {
			System.out.println("Empate");
		} else if(jugadaUsuario == jugadas[1] && jugadaOrdenador == jugadas[1]) {
			System.out.println("Empate");
		} else if(jugadaUsuario == jugadas[2] && jugadaOrdenador == jugadas[2]) {
			System.out.println("Empate");
		} else if(jugadaUsuario == jugadas[3] && jugadaOrdenador == jugadas[3]) {
			System.out.println("Empate");
		} else if(jugadaUsuario == jugadas[4] && jugadaOrdenador == jugadas[4]) {
			System.out.println("Empate");
		}
	}

	private static void generarJugadaOrdenador() {
		numeroAleatorio = (int) (Math.random() * 5) +1;
		jugadaOrdenador = jugadas[numeroAleatorio];
	}

	private static void escribirMenuPrincipal() {
		System.out.println("PIEDRA PAPEL TIJERAS LAGARTO SPOCK\r\n"
				+ "1. Jugar\r\n"
				+ "0. Salir");
		
		}
	
	public static void pedirJugadaUsuario() {
		System.out.println("Introduce tu jugada:\r\n " 
	+ "1. Piedra\r\n 2. Papel\r\n 3. Tijeras\r\n "
	+ "4. Lagarto\r\n 5. Spock");
		int opcionElegida = scaner.nextInt();
		//con el nextInt recojo la posición del array y lo almaceno en jugadaUsuario que es de tipo String
		System.out.println("Opción elegida= " + opcionElegida);
		jugadaUsuario = jugadas[opcionElegida -1];
	}
	
}
