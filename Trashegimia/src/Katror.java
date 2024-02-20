
public class Katror extends Drejtkendesh{

	/**
	 * 
	 */
	public Katror() {
		setBrinjaA(1.0);
		setBrinjaB(1.0);
	
	}

	/**
	 * @param ngjyra
	 * @param njgyrosur
	 * @param brinjaA
	 * @param brinjaB
	 */
	public Katror(String ngjyra, boolean njgyrosur, double brinjaA) {
		super(ngjyra, njgyrosur, brinjaA, brinjaA);

	}
   public void setBrinjaA(double brinjaA) {
	   this.brinjaA = brinjaA; 
   }
	public double getBrinjaA() {
		return brinjaA; 
	}
	public double getPerimeter() {
		return 4 * brinjaA; 
	}
	public double getSiperfaqe() {
		return brinjaA * brinjaA; 
	}

	@Override
	public String toString() {
		ObjektGjeometrik o = new ObjektGjeometrik(); 
		return String.format("katrori me brinje %.2f ka perimeter %.2f dhe siperfaqe %.2f\n", this.getBrinjaA(), getPerimeter(),
				getSiperfaqe()) + super.toString();
	}
	
}
