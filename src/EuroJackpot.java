import java.util.Random;


public class EuroJackpot {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int i1 = 0;
		int i2 = 0;
				
		System.out.println("###########################################################");
		System.out.println("Deine Gewinnzahlen sind: ");
		
		for (int i = 0; i < 5; i++) {
			System.out.print(rand.nextInt(50)+1 + " ");
		}
		System.out.println(" ");
		System.out.println("Deine Zusatszahlen sind: ");
		
		for (int i = 0; i < 2; i++) {
			i2 = rand.nextInt(10);
			if (i1 == i2) {
				
			}
			System.out.print(rand.nextInt(10) + " ");
		}
		System.out.println(" ");
		System.out.println("###########################################################");
		
	}
}
