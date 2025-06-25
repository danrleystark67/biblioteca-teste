package fakedb;
import dominio.Livro;

public class LivroFakeDB extends BaseFakeDB<Livro>{
    @Override
protected void preencherDados(){

Livro livro1 = new Livro(1,"jkr","Harry Potter");


this.instancia.add(livro1);

}
public LivroFakeDB(){
    super();
}
}