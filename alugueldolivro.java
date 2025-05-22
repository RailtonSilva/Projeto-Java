package EmpretimoDeLivro;

public class Emprestimo {

int date;
String livro;


public Emprestimo( int date, String livro ) {
	this.date=date;
	this.livro=livro;
}
public int verificarDevolucao() {
	return date;
}
}
