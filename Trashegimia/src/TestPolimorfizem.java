/**
 * ObjektGjeometrik r = new Rreth();
 * variabli r eshte nje objekt reference dhe ka si tip te deklaruar ObjektGjeometrik
 * dhe si tip aktual ka klasen rreth
 * ne kete rast variabli r quhet variabel polimorf
 * r.toString() do therritet metoda e tipit aktual qe eshte ajo e klases Rreth 
 * 
 * operatori instanceOf perdoret ne java per te treguar nese nje objekt i perket nje klase te caktuar 
 * 
 * o instanceOf Rreth kthen vleren true nese o eshte nje objekt konkret i klases Rreth dhe false perndryshe
 */
public class TestPolimorfizem {

	public static void main(String[] args) {
		ObjektGjeometrik r = new Rreth();
		r.setNgjyra("jeshile");
		r.isNjgyrosur();
		System.out.println(r.toString());
		ObjektGjeometrik o; // eshte variabel shumeformesh 
		o = new Trekendesh("kuqe", true, 3.0, 4.0, 5.0);
		System.out.println(o);
		o = new Drejtkendesh("blu", true, 3.5, 2.7);
		System.out.println(o);
		ObjektGjeometrik[] lista = new ObjektGjeometrik[5];
		lista[0] = new Rreth("verdhe", false, 3.4);
		lista[1] = new Trekendesh("jeshile", true, 3.0, 4.0, 5.0);
		lista[2] = o;
		lista[3] = r; 
		lista[4] = new Katror("blu", true, 2.2);
		printSiperfaqe(lista);
		
	
	}
	public static void printSiperfaqe(ObjektGjeometrik[] lista) {
		for(ObjektGjeometrik o:lista) {
			String emri = "";
			if(o instanceof Rreth) emri = " e rrethit"; 
			else if(o instanceof Trekendesh) emri = " e trekendeshit";
			else if(o instanceof Drejtkendesh) emri = " e drejtkendeshit"; 
			else if(o instanceof Katror) emri = " e katrorit"; 
			else {
				System.out.println("Objekt Gjeometrik i panjohur per momentin");
				return; 
			}
			System.out.println("Siperfaqja "+emri + " = " +  o.getSiperfaqe());
			
		}
	}

}
