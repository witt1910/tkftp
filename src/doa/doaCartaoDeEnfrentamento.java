package doa;

import activities.CartaoDeEnfrentamento;

public interface doaCartaoDeEnfrentamento {
	
	public void insert(CartaoDeEnfrentamento obj);
	public void update(CartaoDeEnfrentamento obj);
	public void delete(Integer id);
	public CartaoDeEnfrentamento getCartaoDeEnfrentamento(Integer id);
	
	
	
}
