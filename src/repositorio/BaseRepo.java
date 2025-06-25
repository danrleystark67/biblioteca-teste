package repositorio;
import java.util.ArrayList;
import fakedb.BaseFakeDB;

public abstract class BaseRepo<TDominio>{
    protected BaseFakeDB<TDominio> baseDeDados;

public abstract TDominio create(TDominio instancia);

public abstract TDominio read(int codigo);

public ArrayList<TDominio>read(){
    return this.baseDeDados.getInstancia();
} 
public abstract TDominio update(TDominio instancia);

public abstract TDominio delete(int codigo);
}