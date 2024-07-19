package ifba.webII;

public class Titulos {

	private int id;
	private String titulo;
	private String genero;
	private String duracao;
	private String diretor;
	private String ano;
	private String atores;
	private String tipo;
	
	
	public Titulos() {
	}


	public Titulos(String titulo, String genero, String duracao, String diretor, String ano, String atores,
			String tipo) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.duracao = duracao;
		this.diretor = diretor;
		this.ano = ano;
		this.atores = atores;
		this.tipo = tipo;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getDuracao() {
		return duracao;
	}


	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}


	public String getDiretor() {
		return diretor;
	}


	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}


	public String getAno() {
		return ano;
	}


	public void setAno(String ano) {
		this.ano = ano;
	}


	public String getAtores() {
		return atores;
	}


	public void setAtores(String atores) {
		this.atores = atores;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
}
