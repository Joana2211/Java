/**
 * 
 * Klasa PredatoryCreditCard zgjeron klasen CreditCrad ne 2 menyra:
 * 1)nëse një kreditim i tentuar refuzohet sepse do të kishte tejkaluar kufirin e
 *fushës limit, një tarifë prej 5 euro do te shtohet ne balancën e kartës
 *do të ketë një mekanizëm për llogaritjen e tarifës mujore bazuar ne balancën e
 *kartës, duke përdorur një interes përqindjeje vjetore i specifikuar si një
 *parametër i ri ne konstruktorin e klasës.
 *Fjala kyce extends krijon nje nenklas te klases CreditCard
 *Themi qe CreditCard eshte nje superklase e PredatoryCreditCard
 *dhe PredaoryCreditCard eshe nenklase e klases CreditCard
 *Trashegimia shton nje marredhenie midis klasave qe njihet si eshte-nje 
 *ne kete rast kemi qe PredatoryCreditCrad eshte-nje CreditCard 
 *
 *Nenklasa trashegon te gjitha variablat e instances dhe metodat e superklase 
 *pervec konstruktorit i cili nuk trashegohet
 *Nese duam ta therrasim konstruktoin e superklases duhet te perdorim fjalen kyce super()
 *Te gjitha fushat qe jane private te superklasa mbeten te paaksesueshem te nenklasa dhe mund te aksesohen vetem nepermjet 
 *metodave publike 
 *Nese duam te aksesojme nje fushe private nga superklasa duhet ta ndryshojme nga private ne protected 
 */
public class PredatoryCreditCard extends CreditCard {
  private double apr; // annual interes raste perdoret per llogaritjen e tarifes mujore 

/**
 * 
 */
public PredatoryCreditCard() {
	super();
	// TODO Auto-generated constructor stub
}

/**
 * @param customer
 * @param bank
 * @param account
 * @param limit
 * @param balanca
 */
public PredatoryCreditCard(String customer, String bank, String account, int limit, double balanca, double apr) {
	super(customer, bank, account, limit, balanca);
	this.apr = apr;
}

/**
 * @return kthen apr
 */
public double getApr() {
	return apr;
}

/**
 * @param vendos apr 
 */
public void setApr(double apr) {
	this.apr = apr;
}
@Override 
public boolean charge(double amount) {
	if(!super.charge(amount))
	{
		this.setBalanca(this.getBalanca()+5);
		return false;
	}
      return true;

  }
/**
 * Metode e re specifike per kete klase e cila nje here ne muaj aplikon nje interes mujor ne baze te detyrimit qe ka klieni 
 */
  public void processMonthly() {
	  double interes = Math.pow(1+apr, 1/12.0)*getBalanca();
	  setBalanca(interes+this.getBalanca());
  }


  
}
  

