import java.util.Locale;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		if (n>0) {
			for (int i=1; i<=n; i++) {
				System.out.print(i+" ");
				int quad = i*i;
				System.out.print(quad+" ");
				int cubo = i*i*i;
				System.out.println(cubo);
				
			}
		}
		sc.close();
	}

}
