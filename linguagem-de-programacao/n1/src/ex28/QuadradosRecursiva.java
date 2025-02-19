package ex28;

import java.text.DecimalFormat;

public class QuadradosRecursiva {
	public static void Quadrados(int num) {
		DecimalFormat df = new DecimalFormat("0");
		if(num <= 150) {
			System.out.println("Quadrado de " + num + ": " + df.format(Math.pow(num, 2)));
			Quadrados(num + 1);
		} else {
			return;
		}
	}
	
	public static void main(String[] args) {
		int num = 10;
		Quadrados(num);
	}

}
