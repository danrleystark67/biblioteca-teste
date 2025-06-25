package repositorio;
import java.util.ArrayList;
import dominio.Livro;
import fakedb.LivroFakeDB;

public class LivroRepo extends BaseRepo<Livro>{
    private LivroFakeDB fakeDB;

public LivroRepo(){
    this.fakeDB = new LivroFakeDB();
    this.baseDeDados = this.fakeDB;
}
@Override
public Livro create(Livro instancia){
Livro p = this.baseDeDados.getInstancia().getLast();
int chave = p.getCodigo() + 1;
instancia.setCodigo(chave);
this.baseDeDados.getInstancia().add(instancia);
return instancia;
}
@Override
public Livro read(int codigo){
ArrayList<Livro> lista = this.baseDeDados.getInstancia();
for(Livro livro:lista){
    if(livro.getCodigo() == codigo){
        return livro;
    }
}
return null;
}
@Override
public Livro update(Livro instancia){
Livro alterado = this.read(instancia.getCodigo());
if(alterado != null){
    alterado.setCodigo(instancia.getCodigo());
    alterado.setAutor(instancia.getAutor());
    alterado.setNome(instancia.getNome());
    return alterado;
}
return alterado;
}
@Override
public Livro delete(int codigo){
Livro deletado = this.read(codigo);
if(deletado != null){
    this.baseDeDados.getInstancia().remove(deletado);
    return deletado;
}
return deletado;
}
}