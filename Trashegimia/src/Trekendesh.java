/**
 * Klasa Trekendesh zgjeron klasen ObjektGjeometrik
 * 
 * Klasa trekendesh ka 3 variabla instance private brinjA, brinjB, brinjC
 * 
 * Gjithashtu zgjeron klasen ObjektGjeometrik nepermjet 2 metodave per llogaritjen e siperfaqes dhe te perimetrit
 */
public class Trekendesh extends ObjektGjeometrik{
      private double brinjA = 1.0; 
      private double brinjB = 1.0;
      private double brinjC = 1.0; 
	/**
	 * Konstruktori default pa parametra 
	 */
	public Trekendesh() {
		super();
		System.out.println("Konsruktori pa parametra i klases Trekendesh");
		
	}
	/**
	 * Konstruktori qe nderton nje objekt te klases Trekendesh me parametrat si me poshte:
	 * @param ngjyra
	 * @param njgyrosur
	 * @param brinjA
	 * @param brinjB
	 * @param brinjC
	 */
	public Trekendesh(String ngjyra, boolean njgyrosur, double brinjA, double brinjB, double brinjC) {
		super(ngjyra, njgyrosur);
		System.out.println("Konsruktori me parametra i klases Trekendesh");
		this.brinjA = brinjA; 
		this.brinjB = brinjB; 
		this.brinjC = brinjC; 
		
	}
	/**
	 * @return the brinjA
	 */
	public double getBrinjA() {
		return brinjA;
	}
	/**
	 * @param brinjA the brinjA to set
	 */
	public void setBrinjA(double brinjA) {
		this.brinjA = brinjA;
	}
	/**
	 * @return the brinjB
	 */
	public double getBrinjB() {
		return brinjB;
	}
	/**
	 * @param brinjB the brinjB to set
	 */
	public void setBrinjB(double brinjB) {
		this.brinjB = brinjB;
	}
	/**
	 * @return the brinjC
	 */
	public double getBrinjC() {
		return brinjC;
	}
	/**
	 * @param brinjC the brinjC to set
	 */
	public void setBrinjC(double brinjC) {
		this.brinjC = brinjC;
	} 
      /**
       * Llogari perimetrin e trekendeshit
       * @return brinjA + brinjB + brinjC
       */
      public double getPerimeter() {
    	  return brinjA + brinjB + brinjC; 
      }
      /**
       * Llogarit siperfaqen e trekendeshit sipas formules se Heronit
       * @return siperfaqja e trekendeshit
       */
      public double getSiperfaqe() {
    	  double hp = getPerimeter()/2.0; // hp eshte gjysem perimeter
    	  return Math.sqrt(hp * (hp - brinjA) * (hp - brinjB) * (hp - brinjC)); 
    	  
      }
	@Override
	public String toString() {
		
		return  String.format("Trekendesh me brinje %.2f, %.2f, %.2f", brinjA, brinjB, brinjC)   + super.toString();

  }
}
