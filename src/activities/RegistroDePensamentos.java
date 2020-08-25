package activities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RegistroDePensamentos {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH");
	
	private Date data;
	private String situacao;
	private String penAut;
	private String emocoes;
	private String respAdapt;
	private String resultados;
	
	public RegistroDePensamentos() {}
	
	public String ok() {
		return "Ok";
	}
	
}
