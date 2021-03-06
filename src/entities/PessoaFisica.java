package entities;

public class PessoaFisica extends TaxaImposto {

	private Double gastoSaude;

	public PessoaFisica() {
		super();
	}
	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}
	public Double getGastoSaude() {
		return gastoSaude;
	}
	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	@Override
	public Double imposto() {
		double renda = 0.0;
		double gasto = 0.0;
		
		if(getRendaAnual() <= 20000.00) {
			renda = getRendaAnual() * 0.15;
		}else if(getRendaAnual() > 20000.00) {
			renda = getRendaAnual() * 0.25;
		}
		
		if(gastoSaude > 0) {
			gasto = gastoSaude * 0.5;
		}
		return renda - gasto;
	}
	
	

}
