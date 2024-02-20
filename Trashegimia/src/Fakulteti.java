enum GRADA {LEKTOR, ASISTENT_PROFESOR, PROFESOR_ASOCIUAR, DOKTOR, PROFESOR};
public class Fakulteti extends Punonjes{
      private int oreQendrimiZyre;
      private GRADA grada;
	/**
	 * 
	 */
	public Fakulteti() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param emri
	 * @param adrese
	 * @param nrTel
	 * @param email
	 * @param zyra
	 * @param paga
	 * @param dataPunesimit
	 */
	public Fakulteti(String emri, String adrese, String nrTel, String email, String zyra, double paga,
			Data dataPunesimit, int oreQendrimiZyre, GRADA grada) {
		super(emri, adrese, nrTel, email, zyra, paga, dataPunesimit);
		this.oreQendrimiZyre = oreQendrimiZyre; 
		this.grada = grada; 
	}
	/**
	 * @return the oreQendrimiZyre
	 */
	public int getOreQendrimiZyre() {
		return oreQendrimiZyre;
	}
	/**
	 * @param oreQendrimiZyre the oreQendrimiZyre to set
	 */
	public void setOreQendrimiZyre(int oreQendrimiZyre) {
		if (oreQendrimiZyre >= 0) this.oreQendrimiZyre = oreQendrimiZyre;
	}
	/**
	 * @return the grada
	 */
	public GRADA getGrada() {
		return grada;
	}
	/**
	 * @param grada the grada to set
	 */
	public void setGrada(GRADA grada) {
		this.grada = grada;
	}
	@Override
	public String toString() {

		return super.toString() + String.format("Ore Qendrimi ne zyre: %d\nGrada: %s\n", oreQendrimiZyre, grada.name());
	}
	/** 
	 * Rishkruan metoden e superklases 
	 * Per gradat Profesor, Doktor, Profesor_Asociuar pavaresisht viteve te punes aplikohet shtesa prej 15% 
	 * Per gradat e tjera aplikohet shtese prej 10% vetem ne varesi te viteve te punes 
	 * @return true ose false kur nuk plotesohet kriteri i viteve te punes 
	 */
	@Override
	public boolean rritjePage() {
		switch(grada) {
		case PROFESOR,
		       DOKTOR,
		       PROFESOR_ASOCIUAR : 
		    	   this.setPaga(paga * 1.5);
		return true; 
		
		default :  
		
		return super.rritjePage();
	} 
      
 }    
      
}
