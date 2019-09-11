package observer_design_pattern_exercicio_parteum;

public interface Subject {
	public void addObserverEstadao(Observer observer);
	public void addObserverMarie(Observer observer);
	public void addObserverEstadaoDiario(Observer observer);
	public void removeObserverMarie(Observer observer);
	public void removeObserverEstadao(Observer observer);
	public void removeObserverEstadaoDiario(Observer observer);
	public void notifyObservers();
}
