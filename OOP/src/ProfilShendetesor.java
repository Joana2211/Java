import java.util.Calendar;
import java.util.Date;

/**
 * Ndertojme nje klase qe ka te bej me profilin shendetesor te nje personi
 * 
 */
public class ProfilShendetesor {
     private String emri; 
     private String mbiemri;
     private Data dataLindjes; 
     private char gjinia; 
     private double gjatesia;
     private double pesha; 
  /**
   * 
   *     Konstruktori pa parametra qe nderton nje objekt default
   */
     public ProfilShendetesor(){
    	
    	 
     }
     /**
      * 
      * Konstruktori me parametra qe nderton objektin me parametrat e specifikuara me poshte 
      * @param emri emri i personit
      * @param mbiemri mbiemri i personit
      * @param dataLindjes data e lindjes e personit
      * @param gjinia gjinia e personit
      * @param pesha pesha e personit
      * @param gjatesia gjatesia e personit 
      * @param emri
      * @param mbiemri
      * @param datalindjes
      * @param gjinia
      * @param gjatesia
      * @param pesha
      */
     public ProfilShendetesor(String emri, String mbiemri, Data datalindjes,char gjinia, double gjatesia, double pesha) {
    	 this.emri = emri;
    	 this.mbiemri = mbiemri; 
    	 this.gjatesia = gjatesia; 
    	 this.pesha = pesha; 
    	 this.gjinia = gjinia;
    	 this.dataLindjes = datalindjes;
     }
     /**
      * 
      * metoda get per fushen emri
      * @return emri
      */
	public String getEmri() {
		return emri;
	}
	/**
	 * 
	 * metoda set per vendosjen e emrit 
	 * @param emri
	 */
	public void setEmri(String emri) {
		this.emri = emri;
	}
	public String getMbiemri() {
		return mbiemri;
	}
	public void setMbiemri(String mbiemri) {
		this.mbiemri = mbiemri;
	}
	public Data getDataLindjes() {
		return dataLindjes;
	}
	public void setDataLindjes(Data dataLindjes) {
		this.dataLindjes = dataLindjes;
	}
	public char getGjinia() {
		return gjinia;
	}
	public void setGjinia(char gjinia) {
		this.gjinia = gjinia;
	}
	public double getGjatesia() {
		return gjatesia;
	}
	public void setGjatesia(double gjatesia) {
		this.gjatesia = gjatesia;
	}
	public double getPesha() {
		return pesha;
	}
	public void setPesha(double pesha) {
		this.pesha = pesha;
	}
	public int getMosha() {   
		Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        int year = cal.get(Calendar.YEAR);
        int mosha = cal.get(Calendar.MONTH);
		if(this.getDataLindjes().getMuaji()< mosha)
			return year - this.getDataLindjes().getViti();
		else
			return year - this.getDataLindjes().getViti() - 1;
	}
	public double getMaximumRrahjetZemres() {
		return 200 - getMosha();
	}
	public double getBMI() {
		return getGjatesia()/getPesha()*getPesha();
	}
	/*
	 * public String getStatusi() { if(getBMI() < 18.5) return "nenpeshe";
	 * if(getBMI() >18.5 && < 24.9) return "normal"; if(25 < getBMI() && getBmi( )<
	 * 29.9)return "mbipeshe"; if(getBMI()>30) return "obez";
	 * 
	 * }
	 */
}
