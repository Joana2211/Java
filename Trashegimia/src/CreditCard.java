/**
 * Klasa CreditCard modelon nje karte krediti konsumatore
 */


/**
 * 
 */
public class CreditCard {
       protected String customer; // emri i klientit
       protected String bank; // emri i bankes qe emeton kete karte
       protected String account; // nr i llogarise qe lidhet me karten
       protected int limit; // limiti i shpenzimit 
       protected double balanca; // balanca e kartes qe perfaqeson detyrimin qe klienti ka ndaj bankes 
       /**
        * Konstruktori default pa parametra
        */
       public CreditCard() {
    	   
       }

	/**
	 * Krijon nje karte te re krediti 
	 * @param customer emri i klientit p.sh (Joana Cero)
	 * @param bank emri i bankes p.sh (raiffeisen)
	 * @param account nr i llogarise p.sh 5391....
	 * @param limit limiti i kreditit ne euro p.sh 2000 euro
	 * @param balanca balanca fillestare e matur ne euro p.sh 
	 */
	public CreditCard(String customer, String bank, String account, int limit, double balanca) {
		super();
		this.customer = customer;
		this.bank = bank;
		this.account = account;
		this.limit = limit;
		this.balanca = balanca;
	}

	/**
	 * @return the customer
	 */
	public String getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(String customer) {
		this.customer = customer;
	}

	/**
	 * @return kthen emrin e bankes
	 */
	public String getBank() {
		return bank;
	}

	/**
	 * @param vendos emrin e bankes
	 */
	public void setBank(String bank) {
		this.bank = bank;
	}

	/**
	 * @return nr e llogarise
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * @param vendos nr e llogarise
	 */
	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * @return limiin e kartes
	 */
	public int getLimit() {
		return limit;
	}

	/**
	 * @param vendos limitin e kartes
	 */
	public void setLimit(int limit) {
		this.limit = limit;
	}

	/**
	 * @return kthen balancen 
	 */
	public double getBalanca() {
		return balanca;
	}

	/**
	 * @param vendos balancen 
	 */
	public void setBalanca(double balanca) {
		this.balanca = balanca;
	}

       /**
        * 
        * Metoda realizon blerjen me nje karte krediti
        * bleja konsiderohet e suksesshme nese balanca + amount nuk e kalon limitin 
        * @param amount shuma e blejes
        * @return kthen true nese blerja realizohet dhe false perndrsyhe
        */
     public boolean charge(double amount) {
    	 if(amount+ this.getBalanca()> this.getLimit())
    		 return false; // blerja nuk u realizua 
    	 setBalanca(amount+ this.getBalanca());
    	 return true; 
     }
     /**
      * Meoda ben nje pagese te kartes dhe zvogelon detyrimin nga fusha balanca me vleren amount 
     * @param amount vlera e pageses se kartes 
     */
    public void makePayment(double amount) {
    	 if(amount >= 0 ) 
    		 setBalanca(this.getBalanca()-amount);
     }
}
