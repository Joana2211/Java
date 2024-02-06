 import java.util.Date;

public class Account {
	private int id;
    private double balance;
    private static double interesVjetor;
    private Date dataKrijimit; // default value null
    
    public Account() 

{
    	dataKrijimit = new Date();
    	id = 0;
    	balance = 0.0;
    	interesVjetor = 0.0;
    }
    
    public Account(int id, double balance) {
    	
    	this(); // therritet konstruktori default i klases. this() duhet te jete rreshti 
    	this.id = id;
    	this.balance = balance;

}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static double getInteresVjetor() {
		return interesVjetor;
	}

	public static void setInteresVjetor(double interesVjetor) {
		Account.interesVjetor = interesVjetor;
	}

	public Date getDataKrijimit() {
		return dataKrijimit;
	}
    
    public double getPerqindjeInteresiMujor() {
    	return getInteresVjetor()/12.0;
    }
    
    public double getInteresiMujor() {
    	return getBalance() * getPerqindjeInteresiMujor() /100.0;
    }
    
    public boolean terhiq(double vlera) {
    	
    	if(vlera > balance) return false;
    	
    	balance -= vlera;
    	return true;
    }
    public void depozito(double vlera) {
    	balance += vlera;
    }
    public void print() {
    	
    	System.out.println("ID: "+getId());
    	System.out.println("Data e krijimit: "+getDataKrijimit());
    	System.out.println("Balance: "+ getBalance());
    	System.out.println("Interesi mujor: "+getInteresiMujor());
    
    }
}
