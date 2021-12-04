import java.util.Scanner;

public class Notas {
public static void main(String[] args) {
	float notas = 0;
	int i=1;
	Scanner ent = new Scanner(System.in);
	
	for(i=1;i<=4;i++) {
		System.out.println("Infome a nota "+ i + ": ");
		notas+=ent.nextFloat();
	}
	ent.close();
	 System.out.printf("Média = %.1f %n",  (notas / 4));
}
}
