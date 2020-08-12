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
	
	
	@Override
	public Double imposto() {
		double renda = 0.0;
		
		if(TotalFuncionario >= 10) {
			renda = getRendaAnual() * 0.14;
		}else
			renda = getRendaAnual() * 0.16;
		
		return renda;
	}
	
	
	
}
