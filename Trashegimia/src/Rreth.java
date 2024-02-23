/**
 * Klasa Rreth zgjeron klasen ObjektGjeomerik pasi nje rreth eshte-nje objekt gjeometrik
 * Rrethi ka fushen rrezja e tipit double me vlere default 1.0
 * Ka dhe metodat getPerimeter getSiperfaqe dhe toString 
 * perimetri 2 * pi *  rrezja
 * siperfaqja pi * rrezja * rrezja 
 */
public class Rreth extends ObjektGjeometrik{
    private double rreze = 1.0;

	/**
	 * 
	 */
	public Rreth() {
		super();
		
	}

	/**
	 * @param ngjyra
	 * @param njgyrosur
	 */
	public Rreth(String ngjyra, boolean njgyrosur, double rreze) {
		super(ngjyra, njgyrosur);
		System.out.println("Konstruktori me parametra i klases Rreth");
		this.rreze = rreze; 
	}

	/**
	 * @return the rreze
	 */
	public double getRreze() {
		return rreze;
	}

	/**
	 * @param rreze the rreze to set
	 */
	public void setRreze(double rreze) {
		this.rreze = rreze;
	}
	@Override
	public double getPerimeter() {
		return 2 * Math.PI * rreze;
	}
    
    public double getSiperfaqe() {
    	return Math.PI * rreze * rreze; 
    }

	@Override
	public String toString() {
		
		return String.format("Rrethi me rreze %.2f\n", rreze)       
				+ super.toString();
	}
    
}
