
public class TestObjektGjeometrik {

	public static void main(String[] args) {
		// meqe klasa eshte abstrakte nuk mund te krijojme nje objekt konkret nga superklasa
		ObjektGjeometrik o = new Trekendesh("kuqe", true, 3.0, 4.0, 5.0);
		o.setNgjyra("jeshile");
      System.out.println(o.toString());
	}

}
