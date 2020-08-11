package entities;

public class PessoaJuridica extends TaxaImposto {

	private int TotalFuncionario;

	public PessoaJuridica() {
		super();
	}
	public PessoaJuridica(String nome, Double rendaAnual, int totalFuncionario) {
		super(nome, rendaAnual);
		TotalFuncionario = totalFuncionario;
	}
	public int getTotalFuncionario() {
		return TotalFuncionario;
	}
	public void setTotalFuncionario(int totalFuncionario) {
		TotalFuncionario = totalFuncionario;
	}
	
	
	
}
