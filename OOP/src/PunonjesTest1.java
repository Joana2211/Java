
public class PunonjesTest1 {
	public static void main(String[] args) {
		punonjes p1= new punonjes();
		p1.setEmri("Agim");
		p1.setMbiemri("Bardhi");
		p1.setPagaMujore(60000);
		punonjes p2= new punonjes("Denis","Hoxha", 95000);
		punonjes lista[]=new punonjes[5];
		lista[0]=p1;
		lista[1]=p2;
		lista[2]=new punonjes("Sotir","Prifti",10000);
		lista[3]=new punonjes("Sonila","Veshi",20000);
		lista[4]=new punonjes("Linda","Prifti",90000);
		lista[1].setPaga13(true);
		lista[4].setPaga13(true);
		System.out.println("*****Lista e punonjesve*****");
		System.out.println("numri total i punonjesve = "+punonjes.getNrPunonjes());
		System.out.println("Emri     "+"Mbiemri     "+"PagaVjetore");
		
		//menyra for each e bredhjes se nje tabele
		for(punonjes p:lista)
			punonjes.afishoPunonjes(p);
	
		//for(int i=0;i<lista.length;i++)
			//punonjes.afishoPunonjes(lista[i]);
	}

}
