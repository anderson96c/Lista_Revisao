
import java.util.*;
public class Estante
{
	private String codigo;
	private ArrayList<Livro> estante;

	public Estante()
	{
		estante = new ArrayList<Livro>();
	}

	public void addLivro(Livro l)
	{
		estante.add(l);
	}

	public void removeLivro(Livro l)
	{
		estante.remove(l);
	}
	
	public void verLivros()
	{
		for(int i=0; i < estante.size(); i++)
		{
			System.out.println(estante.get(i));
			System.out.println();
		}
	}
}
