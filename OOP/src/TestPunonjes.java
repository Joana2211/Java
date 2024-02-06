
public class TestPunonjes {
	public static void main(String[] args) {
		punonjes p1= new punonjes();
		p1.setEmri("Agim");
		p1.setMbiemri("Bardhi");
		p1.setPagaMujore(60000);
		System.out.println("paga vjetore eshte " +p1.getPagaMujore()*12);
		
		punonjes p2= new punonjes("Denis","Hoxha", 95000);
		System.out.println("paga vjetore eshte "+p2.getPagaMujore()*12);
		
		
		//rritja e pages mujore per punonjesin p1 prej 10%
		p1.setPagaMujore(p1.getPagaMujore()*1.1);
		System.out.println("paga vjetore eshte " +p1.getPagaMujore()*12);
		
		//rritja e pages mujore per p2 me 5%
		p2.setPagaMujore(p2.getPagaMujore()*0.05);
		System.out.println("paga vjetore eshte " +p2.getPagaMujore()*12);
		
		
		
		//int t[]=new int[5];
		punonjes lista[]=new punonjes[5];
		lista[0]=p1;
		lista[1]=p2;
		lista[2]=new punonjes("Sotir","Prifti",10000);
		lista[3]=new punonjes("Sonila","Veshi",20000);
		lista[4]=new punonjes("Linda","Prifti",90000);
		
		//krijojme nje raport me listen  e punonjesve te tipit:
		//emer   mbiemer   paga vjetore
		System.out.println("*****Lista e punonjesve*****");
		System.out.println("Emri     "+"Mbiemri     "+"PagaVjetore");
		for(int i=0; i<lista.length; i++)
		System.out.printf("%9s%13s%11.2f\n",
				lista[i].getEmri(),
				lista[i].getMbiemri(),
				lista[i].getPagaMujore()*12
				);
		
		
		
	}
}
