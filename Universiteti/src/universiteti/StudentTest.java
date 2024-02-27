package universiteti;

public class StudentTest {

	public static void main(String[] args) {
		try {
			Student s100 = new Student(100, "Joana");
			s100.payFee(2000.0);
			System.out.println(s100);
			Student s101 = new Student(100, "Anxhela");
			s101.payFee(3000.0);
			System.out.println(s101);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
		}
		System.out.println("Programi vazhdon!");
	}
	}


