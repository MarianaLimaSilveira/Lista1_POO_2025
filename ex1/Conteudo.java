package ex1;

public class Conteudo {
    
    // 1. Mudamos de private para protected, tive que corrigir com ia pq nao conseguia resolver o erro de jeito nenhum
    protected String titulo;

    
    public Conteudo() {
    }

    public Conteudo (String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }
}