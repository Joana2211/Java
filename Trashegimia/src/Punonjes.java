import java.util.Calendar;
import java.util.Date;

public class Punonjes extends Person{
       protected String zyra; 
       protected double paga; 
       protected Data dataPunesimit;
       final static public int MOSHAPENSIONIT = 65;
	/**
	 * 
	 */
	public Punonjes() {
		super();
		
	}
	/**
	 * @param emri
	 * @param adrese
	 * @param nrTel
	 * @param email
	 */
	public Punonjes(String emri, String adrese, String nrTel, String email, String zyra, double paga, Data dataPunesimit) {
		super(emri, adrese, nrTel, email);
		this.zyra = zyra; 
		setPaga(paga); 
		this.dataPunesimit = dataPunesimit; 
	}
	/**
	 * @return the zyra
	 */
	public String getZyra() {
		return zyra;
	}
	/**
	 * @param zyra the zyra to set
	 */
	public void setZyra(String zyra) {
		this.zyra = zyra;
	}
	/**
	 * @return the paga
	 */
	public double getPaga() {
		return paga;
	}
	/**
	 * @param paga the paga to set
	 */
	public void setPaga(double paga) {
		this.paga = paga;
	}
	/**
	 * @return the dataPunesimit
	 */
	public Data getDataPunesimit() {
		return dataPunesimit;
	}
	/**
	 * @param dataPunesimit the dataPunesimit to set
	 */
	public void setDataPunesimit(Data dataPunesimit) {
		this.dataPunesimit = dataPunesimit;
	}
	@Override
	public String toString() {
		return super.toString() + String.format("Zyra: %s\nPaga: %.2f\nData e Punesimit: %s\nVite Pune: %d\n", zyra, paga, 
				dataPunesimit.toString(), getVitet());
	} 
	/**
	 * Metoda llogarit dhe kthen vitet e punes se nje punonjesi
	 * @return vitet e punes se nje punonjesi midis vitit korent dhe viteve te punesimit
	 */
	public int getVitet() {   
		Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        int year = cal.get(Calendar.YEAR);
        int mosha = cal.get(Calendar.MONTH);
		if(this.getDataPunesimit().getMuaji()< mosha)
			return year - this.getDataPunesimit().getViti();
		else
			return year - this.getDataPunesimit().getViti() - 1;
	}
	/**
	 * rishikon pagen me varesi te vjetersimit (me shume se 5 vite pune) rrit pagen me 10%
	 * @return true nese punonjesi ploteson kriteret
	 */
       public boolean rritjePage() {
    	   if(getVitet()<5) return false; 
    	   
    	   this.setPaga(paga*1.1);
    	   return true; 
    	  
       }
}
