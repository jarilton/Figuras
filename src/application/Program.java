package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Forma;
import entities.Retangulo;
import entities.Circulo;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Forma> list = new ArrayList<>();
		
		System.out.print(" Entre com o n�mero de formas: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Forma # " + i + "data:");
			System.out.print("Retangulo ou Circulo (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Color (Black/Blue/Red): ");
			Color color = Color.valueOf(sc.next());
			if (ch == 'r') {
				System.out.print("Largura: ");
				double largura = sc.nextDouble();
				System.out.print("Altura: ");
				double altura = sc.nextDouble();
				list.add(new Retangulo(color, largura, altura));
			}
			else {
				System.out.println("Raio: ");
				double raio = sc.nextDouble();
				list.add(new Circulo(color, raio));
			}
		}
		
		System.out.println();
		System.out.println("�rea da forma: ");
		for(Forma forma : list) {
			System.out.println(String.format("%.2f", forma.area()));
			
		}
		
		
		sc.close();
		
	}

}
