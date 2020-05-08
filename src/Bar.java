import java.util.Locale;
import java.util.Scanner;

public class Bar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		char sexo;
		int qtdCervejas, qtdRefri, qtdEspetos;

		System.out.print("Sexo: ");
		sexo = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		qtdCervejas = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		qtdRefri = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		qtdEspetos = sc.nextInt();

		
	}

}
