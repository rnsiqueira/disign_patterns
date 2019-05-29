package Testes;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import ilearn.Nota;
import ilearn.NotasMusicais;
import ilearn.Piano;

public class CriadorDeMusica {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Nota> lnotas = null;

		System.out.println("Digite 1 para Carregar notas:");

		switch (scan.next()) {

		case "1":
			System.out.println("Digite a nota: ");
			System.out.println("Digite 2 para tocar: ");
			Scanner scanN = new Scanner(System.in);
			while (scanN.next().equals("2")) {
				if (scanN.next().equals("do") || scanN.next().equals("re") || scanN.next().equals("mi")
						|| scanN.next().equals("fa") || scanN.next().equals("sol") || scanN.next().equals("la")
						|| scanN.next().equals("si")) {
					lnotas = Arrays.asList(new NotasMusicais().pegaNota(scanN.next()));
					System.out.println("Digite a Nota: ");
					System.out.println("Digite 2 para tocar: ");
					scanN = new Scanner(System.in);
					
				}
				
			}
			
			new Piano().toca(lnotas);
			

		default:
			
			System.out.println("Até2 logo!!!");
			break;
		}

	}

}
