package servico;
import java.util.ArrayList;
import dominio.Livro;
import repositorio.LivroRepo;

public class LivroServico implements IBaseServico<Livro>{
    private LivroRepo repo;

public LivroServico(){
    this.repo = new LivroRepo();
}
@Override
public ArrayList<Livro> navegar(){
    return this.repo.read();
}
@Override
public Livro ler(int codigo){
    return this.repo.read(codigo);
}
@Override
public Livro editar(Livro instancia){
    return this.repo.update(instancia);
}
@Override 
public Livro adicionar(Livro instancia){
    return this.repo.create(instancia);
}
@Override 
public Livro deletar(int codigo){
    return this.repo.delete(codigo);
}
}