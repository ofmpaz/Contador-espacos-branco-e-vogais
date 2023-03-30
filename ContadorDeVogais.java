package desafios;

import java.util.Scanner;

public class ContadorDeVogais {
	
	public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    String[] strSplit = str.split(" ");
	    char[] arrVogais = {'a', 'e', 'i', 'o', 'u'};
	    int espacosEmBranco = strSplit.length - 1, quantVogais = 0;

	    for (String item : strSplit) {
	        if (item.equals(strSplit)) {
	            espacosEmBranco++;
	        }
	        for (char c : item.toLowerCase().toCharArray()) {
	            for (char v : arrVogais) {
	                if (c == v) {
	                    quantVogais++;
	                }
	            }
	        }
	    }
	    System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
	    
	    sc.close();
	}
}


