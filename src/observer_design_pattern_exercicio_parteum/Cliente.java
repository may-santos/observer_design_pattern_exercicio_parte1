package observer_design_pattern_exercicio_parteum;

public abstract class Cliente implements Observer {
	
	public abstract void querSair();
	
	public Cliente(Subject s) {
		this.s = s;
	}
	
	private Subject s;
	
	public Subject getS() {
		return s;
	}
}
