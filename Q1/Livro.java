
public class Livro
{
	private String titulo;
	private String genero;
	private String autor;
	private String isbn;
	private int ano_lancamento;

	public Livro(String t, String g, String a, String i, int al)
	{
		titulo = t;
		genero = g;
		autor = a;
		isbn = i;
		ano_lancamento = al;		
	}

	public String getTitulo()
	{
		return titulo;
	}

	public String getGenero()
	{
		return genero;
	}
	
	public String getAutor()
	{
		return autor;
	}
	
	public String getISBN()
	{
		return isbn;
	}
	
	public int getAnoLancamento()
	{
		return ano_lancamento;
	}

	public String toString()
	{
		return ("Livro: " + titulo + "\n" + "Gênero: " + genero + "\n" + "Autor: " + autor + "\n" + "Lançamento: " + ano_lancamento);
	}

}

