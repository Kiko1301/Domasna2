import java.util.Scanner; 
//Ova e domasna broj2
// komentar broj 2 
public class Domasna2 {
public static void main(String[] args) {
		Scanner scanner = new
			Scanner(System.in);
		System.out.println("Vnesete cel broj");
		int n = scanner.nextInt();
			if (n<0) {
				System.out.println("Vneseniot broj e negativen");
				return;
			}
		long factorial = 1;
		for (int i=1; i<=n; i++){
			factorial*= i;
			if (factorial<0) {
				System.out.println("Se sluci prelevanje");
				return;
			}
			
		}
		System.out.println(n+"!=" + factorial);
	}

}
