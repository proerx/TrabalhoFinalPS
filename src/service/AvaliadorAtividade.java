	package service;
	
	import model.*;
	
	import java.util.ArrayList;
	import java.util.List;
	
	public class AvaliadorAtividade {
	    private static AvaliadorAtividade instancia;
	    private List<RegistroAtividade> registros = new ArrayList<>();
	
	    private AvaliadorAtividade() {}
	
	    public static AvaliadorAtividade getInstancia() {
	        if (instancia == null) {
	            instancia = new AvaliadorAtividade();
	        }
	        return instancia;
	    }
	
	    public void registrar(Atividade atividade, int horas) {
	        registros.add(new RegistroAtividade(atividade, horas));
	    }
	
	    public List<RegistroAtividade> getRegistros() {
	        return registros;
	    }
	}