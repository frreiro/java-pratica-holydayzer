import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

		Feriados feriados = new Feriados();
		feriados.setFeriado(new Feriado("01/01/2023" ,  "Confraternização mundial"));
		feriados.setFeriado(new Feriado("21/02/2023" ,  "Carnaval"));
		feriados.setFeriado(new Feriado("17/04/2023" ,  "Páscoa"));
		feriados.setFeriado(new Feriado("21/04/2023" ,  "Tiradentes"));
		feriados.setFeriado(new Feriado("01/05/2023" ,  "Dia do trabalho"));
		feriados.setFeriado(new Feriado("08/06/2023" ,  "Corpus Christi"));
		feriados.setFeriado(new Feriado("07/09/2023" ,  "Independência do Brasil"));
		feriados.setFeriado(new Feriado("12/10/2023" ,  "Nossa Senhora Aparecida"));
		feriados.setFeriado(new Feriado("02/11/2023" ,  "Finados"));
		feriados.setFeriado(new Feriado("15/11/2023" ,  "Proclamação da República"));
		feriados.setFeriado(new Feriado("25/12/2023" ,  "Natal"));

		//Data que não existe na lista
		feriados.getFeriado("01/02/2023");

		//Data que existe na lista
		feriados.getFeriado("01/05/2023");

		List<Feriado> listFeriados = feriados.getFeriados();
		for(int i = 0; i < listFeriados.size(); i++ ){
			Feriado feriadosFound = listFeriados.get(i);
			System.out.println(feriadosFound.getData() + " : " + feriadosFound.getNome());

		}
    }
}
