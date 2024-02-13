/**
 * Klasa Drejtkendesh zgjeron klasesn ObjektGjeometrik pasi nje drejtkendesh eshte-nje objekt gjeometrik
 * 
 */
public class Drejtkendesh extends ObjektGjeometrik{
     protected double brinjaA = 1.0; 
     protected double brinjaB = 1.0; 
	/**
	 * 
	 */
	public Drejtkendesh() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param ngjyra
	 * @param njgyrosur
	 */
	public Drejtkendesh(String ngjyra, boolean njgyrosur, double brinjaA, double brinjaB) {
		super(ngjyra, njgyrosur);
		System.out.println("Konstruktori me parametra i klases Drejtkendesh");
		this.brinjaA = brinjaA;
		this.brinjaB = brinjaB; 
	}
	/**
	 * @return the brinjaA
	 */
	public double getBrinjaA() {
		return brinjaA;
	}
	/**
	 * @param brinjaA the brinjaA to set
	 */
	public void setBrinjaA(double brinjaA) {
		this.brinjaA = brinjaA;
	}
	/**
	 * @return the brinjaB
	 */
	public double getBrinjaB() {
		return brinjaB;
	}
	/**
	 * @param brinjaB the brinjaB to set
	 */
	public void setBrinjaB(double brinjaB) {
		this.brinjaB = brinjaB;
	} 
     public double getPerimeter() {
    	 return 2 * (brinjaA + brinjaB); 
     }
     public double getSiperfaqe() {
    	 return brinjaA * brinjaB; 
     }
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return   String.format("Drejtkendeshi me brinje  %.2f dhe brinje  %.2f\n", brinjaA, brinjaB)            +super.toString();
	}
     
}
