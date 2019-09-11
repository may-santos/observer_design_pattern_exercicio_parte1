package observer_design_pattern_exercicio_parteum;
public class PontoInicial {

	public static void main(String[] args) {
		Editora e = new Editora();
		e.addObserverEstadaoDiario(new Jose(e));
		e.addObserverEstadao(new Joao(e));
		e.addObserverMarie(new Maria(e));
		
		e.iniciar();
	}

}
