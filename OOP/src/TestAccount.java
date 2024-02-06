/*klasa Account tesr perdoret per te testuar klasen Account.
 * @author Anisa
 *  */
public class TestAccount {

	public static void main(String[] args) {
		Account llogari1 = new Account(1122, 20000.0);
		Account.setInteresVjetor(4.5);
		if(llogari1.terhiq(3000)) {
			System.out.println("Terheqja nga llogaria u krye me sukses!");
			System.out.println("Balanca e llogarise = "+ llogari1.getBalance());
		}
		else 
			System.out.println("Nuk keni balance te mjatueshme!");
		
		llogari1.depozito(1000);
		System.out.println("Balanca e llogarise = "+ llogari1.getBalance());
		llogari1.print();

	}

}
