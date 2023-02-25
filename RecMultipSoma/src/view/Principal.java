package view;
import controller.Modulos;

/*
 * Multiplica dois números em uma função recursiva, através de somas.
 * Autor: Ewelin Fernandes (Github: @ewefernandes)
 * Data: 20/02/2023
 * */

public class Principal {
	public static void main (String [] args) {
		int a = 5;
		int b = 4;
		Modulos mod = new Modulos();
		int multiplica = mod.SomasMult(a, b);
		System.out.println(multiplica);
	}
}
