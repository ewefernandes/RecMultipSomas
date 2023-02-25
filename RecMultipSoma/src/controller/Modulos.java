package controller;

public class Modulos {
	public int SomasMult (int a, int b){
		
		if (b==0) {
			return 0;
		} else {
			b = b - 1;
			return a + SomasMult(a, b);
		}
		
	}
}
