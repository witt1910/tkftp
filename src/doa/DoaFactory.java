package doa;

import activities.CartaoDeEnfrentamento;
import activities.PlanilhaDeAtividadesSemanais;
import activities.RegistroDePensamentos;

public class DoaFactory {

	public static CartaoDeEnfrentamento novoCartaoDeEnfrentamento() {
		return new CartaoDeEnfrentamento();
	}
	
	public static PlanilhaDeAtividadesSemanais novaPlanilhaDeAtividades() {
		return new PlanilhaDeAtividadesSemanais();
	}
	
	public static RegistroDePensamentos novoRegistroDePensamentos() {
		return new RegistroDePensamentos();
	}
}
