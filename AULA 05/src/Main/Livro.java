package Main;

public class Livro {
    private String nome, autor, genero;
    private float preco ;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public void imprime(){
        System.out.println("Nome: "    + this.nome);
        System.out.println("Autor: "   + this.autor);
        System.out.println("Genero: "  + this.genero);
        System.out.println("Preço: "   + this.preco);
    }
}
