package dominio;

public class Livro{
    private int codigo;
    private String autor;
    private String nome;

public int getCodigo(){
    return codigo;
} 
public String getAutor(){
    return autor;
}
public String getNome(){
    return nome;
}
public void setCodigo(int codigo){
    this.codigo = codigo;
}
public void setAutor(String autor){
    this.autor = autor;
}
public void setNome(String nome){
    this.nome = nome;
}

public Livro(){
}
public Livro(int codigo,String autor,String nome){
this.codigo = codigo;
this.autor = autor;
this.nome = nome;
}
}