import java.util.ArrayList;
import java.util.List;

public class Feriados {
	
	private List<Feriado> feriados = new ArrayList<Feriado>();

	public void setFeriado(Feriado feriado){
		this.feriados.add(feriado);
	}


	
	public String getFeriado(String data){
		
		for( Feriado feriado : this.feriados){

			if(feriado.getData().equals(data)){
				System.out.println("Feriado dia "+ feriado.getData() + " : "+ feriado.getNome());
				return feriado.getNome();
			}
		}
		System.out.println("Não tem feriado no dia "+ data);
		return null;
	}


	public List<Feriado> getFeriados(){
		return this.feriados;
	} 
}
