
public class TestData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data today = new Data(30, 1, 2024);
		today.afishoDaten();
		Data nodate = new Data();
		nodate.afishoDaten();
		Data error = new Data(29, 2, 2025);
		error.setDita(35);
		error.afishoDaten();
	}
	

}
