package ProjetoECommerce.model;

public abstract class ECom {
	private String nome;
	private int ano;
	private String genero;
	private String plataforma;
	private int tempo;
	private float preco;
	
	public ECom (String nome,int ano, String genero,String plataforma,int tempo,float preco) {
		super();
		this.nome = nome;
		this.ano = ano;
		this.genero = genero;
		this.plataforma = plataforma;
		this.tempo = tempo;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	public void visualizar() {
		
		System.out.println("\n\n***********************************************************");
		System.out.println("Dados do Jogo:");
		System.out.println("***********************************************************");
		System.out.println("Nome do jogo: " + this.nome);
		System.out.println("Ano do jogo: " + this.ano);
		System.out.println("Gênero do jogo: " + this.genero);
		System.out.println("Plataforma do jogo: " + this.plataforma);
		System.out.println("Tempo de jogo: " + this.tempo);
		System.out.println("Preço do jogo: " + this.preco);
		
	}
}
