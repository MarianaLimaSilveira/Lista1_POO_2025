package ex1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Episodio extends Conteudo {
    
    private Serie serie;
    private int temporada;
    private int numero;
    private Diretor diretor;
    private List<Ator> elenco;

    public Episodio(String titulo, Serie serie, int temporada, int numero, Diretor diretor) {
        this.titulo = titulo;
        this.serie = serie;
        this.temporada = temporada;
        this.numero = numero;
        this.diretor = diretor;
        this.elenco = new ArrayList<>();
    }

    public void adicionarAtor(Ator ator) {
        elenco.add(ator);
    }

    public List<Ator> getElenco() {
        return Collections.unmodifiableList(elenco);
    }

    public Serie getSerie() {
        return serie;
    }

    public int getTemporada() {
        return temporada;
    }

    public int getNumero() {
        return numero;
    }

    public Diretor getDiretor() {
        return diretor;
    }
}