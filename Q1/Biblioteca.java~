
public class Biblioteca
{
	public static void main(String [] args)
	{
		Estante e = new Estante();
	
		Livro toRemove = new Livro("Ser removido", null, null,null, 2017);

		e.addLivro(toRemove);

		for(int i=0; i<10; i++)
		{
			Livro newLivro = new Livro("T" + (i+1), "Ação", 									   "Autor" + (i+1),
									   "18215" +i,
									   2001+i);
			e.addLivro(newLivro);
			
		}

		e.verLivros();

		e.removeLivro(toRemove);

		e.verLivros();
	}
}
