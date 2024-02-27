package universiteti;
public class TeacherTest {

	public static void main(String[] args) {
		try {
			Teacher t100 = new Teacher(100, "Ardi", 90000.0);
			System.out.println(t100);
			Teacher t101 = new Teacher(101, "Dejvi", 95000.0);
			System.out.println(t101);
			Teacher t102 = new Teacher(101, "Rea", 95000.0);
			System.out.println(t102);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
        catch (Exception e) {
        	System.out.println(e.getMessage());
        }
		finally {
			System.out.println("Programi vazhdon......");
		}
	}

}
