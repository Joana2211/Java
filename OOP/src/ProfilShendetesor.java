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
     private boolean sistemiMates = true; // kur eshte true kemi te bejme me sistemin metrik perndryshe eshte imperial
     
    
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
      * 
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
	/**
	 * llogarit diapazonin e rrahjeve te zemres 50%-85% te maksimumit te rrahjeve 
	 * return diapazonin e synuar te rrahjeve
	 * p.sh 80-120
	 */
	public String getDiapazoniRrahjeve() {
		return String.format("%.0f - %.0f", 0.5*getMaximumRrahjetZemres(), 0.85*getMaximumRrahjetZemres());
	}
	
	public double getBMI() {
		return sistemiMates?getPesha()/(getGjatesia()*getGjatesia()):getPesha()*703/(getGjatesia()*getGjatesia());
	}
	/**
	 * Printon tabelen e BMI si me poshte :
	 * VLERAT BMI:
     *Nënpeshë: me pak se 18.5
     *Normal: midis 18.5 dhe 24.9
     *Mbipeshe: midis 25 dhe 29.9
     *Obez: 30 ose me e larte
	 */
	  public static void printoTabelenBMI() { 
		  System.out.println("Vlera BMI: ");
		  System.out.println("Nenpeshe me pak se 18.5");
		  System.out.println("Normal midis 18.5 dhe 24.9");
		  System.out.println("Mbipeshe mbi 24.9");
		  System.out.println("Obez mbi 29.9");
	  }
        public void afishoProfil() {
        	System.out.println("****Profili Shendetesor******");
        	System.out.println("Emri: "+ getEmri() + getMbiemri());
        	System.out.println("Mosha: "+ getMosha());
        	System.out.println("Max i rrahjeve te zemres: "+ getMaximumRrahjetZemres());
        	System.out.println("Diapazoni i synuar: "+ getDiapazoniRrahjeve());
        	System.out.println("BMI: "+ getBMI());
        	ProfilShendetesor.printoTabelenBMI();
        	System.out.println();
        	
        	
        }
}
