package ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Serie {
    
    private String titulo;
    private List<Episodio> episodios;

    public Serie(String titulo) {
        this.titulo = titulo;
        this.episodios = new ArrayList<>();
    }

    public void adicionarEpisodio(Episodio episodio) {
        episodios.add(episodio);
    }

    public String getTitulo() { 
        return titulo; 
    }
    
    public List<Episodio> getEpisodios() { 
        return Collections.unmodifiableList(episodios); 
    }
}