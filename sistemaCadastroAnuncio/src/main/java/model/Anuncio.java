package model;

public class Anuncio {
   
	private int id;
	private String nomeAnuncio;
	private String cliente;
	private String datainicio;
	private String datatermino;
	private int investimentodia;
	private int maxCom;
	private int qpca;
	private int quantV;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNomeAnuncio() {
		return nomeAnuncio;
	}
	
	public void setNomeAnuncio(String nomeAnuncio) {
		this.nomeAnuncio = nomeAnuncio;
	}
	
	public String getCliente() {
		return cliente;
	}
	
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	
	public String getDatainicio() {
		return datainicio;
	}
	
	public void setDatainicio(String datainicio) {
		this.datainicio = datainicio;
	}
	
	public String getDatatermino() {
		return datatermino;
	}
	
	public void setDatatermino(String datatermino) {
		this.datatermino = datatermino;
	}
	
	public int getInvestimentodia() {
		return investimentodia;
	}
	
	public void setInvestimentodia(int investimentodia) {
		this.investimentodia = investimentodia;
	}
	
	public int getMaxCom() {
		return maxCom;
	}
	
	public void setMaxCom(int maxCom) {
		this.maxCom = maxCom;
	}
	
	public int getQpca() {
		return qpca;
	}
	
	public void setQpca(int qpca) {
		this.qpca = qpca;
	}
	
	public int getQuantV() {
		return quantV;
	}
	
	public void setQuantV(int quantV) {
		this.quantV = quantV;
	}

	@Override
	public String toString() {
		return "Anuncio [id=" + id + ", nomeAnuncio=" + nomeAnuncio + ", cliente=" + cliente + ", datainicio="
				+ datainicio + ", datatermino=" + datatermino + ", investimentodia=" + investimentodia + ", maxCom="
				+ maxCom + ", qpca=" + qpca + ", quantV=" + quantV + "]";
	}

	
}
