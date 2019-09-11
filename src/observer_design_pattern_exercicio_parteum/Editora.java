package observer_design_pattern_exercicio_parteum;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

public class Editora implements Subject {
	private List <Observer> observersEstadao;
	private List <Observer> observersMarie;
	private List <Observer> observersEstadaoDiario;
	Entregavel exemplar1 = new Entregavel();
	Entregavel exemplar2 = new Entregavel();
	Entregavel exemplar3 = new Entregavel();
	
	Editora(){
		observersMarie = new ArrayList<>();
		observersEstadao = new ArrayList<>();
		observersEstadaoDiario = new ArrayList<>();
	}
	
	@Override
	public void addObserverMarie(Observer observerMaria) {
		observersMarie.add(observerMaria);
	}
	
	@Override
	public void addObserverEstadao(Observer observerEstadao) {
		observersEstadao.add(observerEstadao);
	}

	@Override
	public void addObserverEstadaoDiario(Observer observerEstadaoDiario) {
		observersEstadaoDiario.add(observerEstadaoDiario);
	}

	
	@Override
	public void removeObserverMarie(Observer observer) {
		observersMarie.remove(observer);
		
	}
	@Override
	public void removeObserverEstadao(Observer observer) {
		observersEstadao.remove(observer);
		
	}
	
	@Override
	public void removeObserverEstadaoDiario(Observer observer) {
		observersEstadaoDiario.remove(observer);
		
	}


	@Override
	public void notifyObservers() {
		Calendar cal = Calendar.getInstance();
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
//		Random teste = new Random();
//		int day = teste.nextInt(7)+1;
		
		if(day==1||day==7) {
			
			if(!(observersEstadao.isEmpty())) {
				List <Observer> aux2 = new ArrayList<>();
				aux2.addAll(observersEstadao);
				
				for(Observer o: aux2) {
					o.update(exemplar1);
					System.out.println();
				}
			}
			
			if(!(observersMarie.isEmpty())) {
				List <Observer> aux3 = new ArrayList<>();
				aux3.addAll(observersMarie);
				
				for(Observer o: aux3) {
					o.update(exemplar2);
					System.out.println();
				}
			}
			
		}
		else {
			if(!(observersEstadaoDiario.isEmpty())) {
				List <Observer> aux = new ArrayList<>();
				aux.addAll(observersEstadaoDiario);
				
				for(Observer o: aux) {
					o.update(exemplar3);
					System.out.println();
				}
			}

		}

	}
	
	public void iniciar() {
				
		while((!this.observersEstadao.isEmpty() || !this.observersEstadaoDiario.isEmpty() || !this.observersMarie.isEmpty()) ) {

			exemplar1.setExemplar("Jornal Estadão Semanal");
			exemplar2.setExemplar("Revista Marie Semanal");
			exemplar3.setExemplar("Jornal Estadão Diário");
		
			notifyObservers();
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
			}
		}	
			
		System.out.println("Falimos");
		
	}
}
