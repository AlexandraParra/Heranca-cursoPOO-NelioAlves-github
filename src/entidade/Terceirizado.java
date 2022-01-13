package entidade;

public class Terceirizado extends Funcionario {
	private Double despesa;
	
	public Terceirizado() {
		super();
	}

	public Terceirizado(String nome, Integer horas, Double valorHora, Double despesa) {
		super(nome, horas, valorHora);
		this.despesa = despesa;
	}

	public Double getDespesa() {
		return despesa;
	}

	public void setDespesa(Double despesa) {
		this.despesa = despesa;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + (despesa * 1.1);
	}
}
