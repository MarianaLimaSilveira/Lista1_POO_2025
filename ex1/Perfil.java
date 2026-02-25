package ex1;

import java.util.ArrayList;
import java.util.List;

public class Perfil {
    
    private String nome;
    private List<Conteudo> conteudosAssistidos;

    public Perfil(String nome) {
        this.nome = nome;
        this.conteudosAssistidos = new ArrayList<>();
    }

    public void assistirConteudo(Conteudo conteudo) {
        conteudosAssistidos.add(conteudo);
    }

    public List<Conteudo> getConteudosAssistidos() {
        return (conteudosAssistidos);
    }

    public String getNome() {
        return nome;
    }
}