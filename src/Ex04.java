import java.util.Locale;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
				
		for (int i=0; i<n; i++) {
			double y = sc.nextDouble();
			double z = sc.nextDouble();
			if (z!=0) {
				double div = y/z;
				System.out.println(div);
			}
			else {
				System.out.println("divisão impossível!!!");
			}
					
					
		}
		sc.close();	
	}

}
