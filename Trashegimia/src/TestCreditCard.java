
public class TestCreditCard {

	public static void main(String[] args) {
		CreditCard cr1 = new CreditCard("John Doe", "Raiffeisen Bank", "5391 0375 9387 5309", 3000, 0.0 );
         cr1.charge(1000.0); 
         System.out.println("Balanca e kartes: "+ cr1.getBalanca());
         cr1.charge(2500.0);
         System.out.println("Balanca e kartes: "+ cr1.getBalanca());
         cr1.makePayment(500.0);
         System.out.println("Balanca e kartes: "+ cr1.getBalanca());
         cr1.charge(2500.0);
         System.out.println("Balanca e kartes: "+ cr1.getBalanca());
         PredatoryCreditCard pr1 = new PredatoryCreditCard();
	}

}
