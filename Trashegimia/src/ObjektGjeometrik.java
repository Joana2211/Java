import java.util.Date;

public class ObjektGjeometrik {
 protected String ngjyra; 
 protected boolean njgyrosur;
 protected Date dataKrijimit;
 
 /**
  * Konstruktori default 
  */
 public ObjektGjeometrik() {
	 System.out.println("Konsruktori pa parametra i klases ObjektGjeometrik");
	 this.dataKrijimit = new Date();
 }

/**
 * @param ngjyra
 * @param njgyrosur
 * @param dataKrijimit
 */
public ObjektGjeometrik(String ngjyra, boolean njgyrosur) {
	this();
	System.out.println("Konsruktori me parametra i klases ObjektGjeometrik");
	this.ngjyra = ngjyra;
	this.njgyrosur = njgyrosur;
}

/**
 * @return the ngjyra
 */
public String getNgjyra() {
	return ngjyra;
}

/**
 * @param ngjyra the ngjyra to set
 */
public void setNgjyra(String ngjyra) {
	this.ngjyra = ngjyra;
}

/**
 * @return the njgyrosur
 */
public boolean isNjgyrosur() {
	return njgyrosur;
}

/**
 * @param njgyrosur the njgyrosur to set
 */
public void setNjgyrosur(boolean njgyrosur) {
	this.njgyrosur = njgyrosur;
}

/**
 * @return the dataKrijimit
 */
public Date getDataKrijimit() {
	return dataKrijimit;
}

@Override
public String toString() {
	return String.format("Krijuar me %s\nNgjyra %s\nNgjyrosur %s", getDataKrijimit(), getNgjyra(), isNjgyrosur());
}
 
}
