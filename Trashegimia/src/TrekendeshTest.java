
public class TrekendeshTest {

	public static void main(String[] args) {
		try {
			Trekendesh t1 = new Trekendesh();
			t1.setNgjyra("jeshile");
			t1.setNjgyrosur(true); 
			System.out.println(t1);
			System.out.println("-------------");
			Trekendesh t2 = new Trekendesh("kuqe", true, 3.0, 4.0, 5.0);
			System.out.println(t2);
			System.out.println("Perimetri i t2 ="+ t2.getPerimeter());
			System.out.println("Siperfaqja e t2 ="+ t2.getSiperfaqe());
			
			Trekendesh t3 = new Trekendesh("blu", true, -1.0, 0, 5);
			System.out.println(t3.toString());
		} catch (IllegalArgumentException e) {
			System.out.println("Ka ndodhur nje gabim: "+e.getMessage());
			// TODO Auto-generated catch block
		
		}
	}

}
