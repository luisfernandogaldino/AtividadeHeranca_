package Heranca;

public class Sorvete  extends Produto{
	private Double tempAdequada ;

	public Sorvete(long id, String nome, Double preco, Double tempAdequada) {
		super(id, nome, preco);
		this.tempAdequada = tempAdequada;
	}

	public Double getTempAdequada() {
		return tempAdequada;
	}

	public void setTempAdequada(Double tempAdequada) {
		this.tempAdequada = tempAdequada;
	}
	

}
