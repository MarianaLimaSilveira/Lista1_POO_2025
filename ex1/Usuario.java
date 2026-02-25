package ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Usuario {
    
    private String nome;
    private List<Perfil> perfis;

    public Usuario(String nome) {
        this.nome = nome;
        this.perfis = new ArrayList<>();
    }

    public void adicionarPerfil(Perfil perfil) {
        perfis.add(perfil);
    }

    public List<Perfil> getPerfis() {
        return Collections.unmodifiableList(perfis);
    }

    public String getNome() {
        return nome;
    }
}