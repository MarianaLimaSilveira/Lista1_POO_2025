package ex1;

//o main nao ta interativo, só printando pra testar
//faltando mostrar elenco da série tbm
public class Main {
    public static void main(String[] args) {
        
        Diretor diretor1 = new Diretor("Walter Salles");
        Diretor diretor2 = new Diretor("Alfred Hitchcock");

        Ator ator1 = new Ator("Connor Storrie");
        Ator ator2 = new Ator("Huddson Willians");
        Ator ator3 = new Ator("Fernanda Torres");
        Ator ator4 = new Ator("Selton Melo");

        
        Filme filme1 = new Filme("Ainda Estou Aqui", diretor1);
        filme1.adicionarAtor(ator3);
        filme1.adicionarAtor(ator4);


        Serie serie1 = new Serie("Heated Rivalry");
        Episodio ep1 = new Episodio("Piloto (S01E01)", serie1, 1, 1, diretor2);
        ep1.adicionarAtor(ator1);
        ep1.adicionarAtor(ator2);
        serie1.adicionarEpisodio(ep1);

       
        Usuario usuario1 = new Usuario("Carlos");
        Perfil perfil1 = new Perfil("Carlos - Principal");
        Perfil perfil2 = new Perfil("Carlos - Kids");

        usuario1.adicionarPerfil(perfil1);
        usuario1.adicionarPerfil(perfil2);

//tendo que trabalhar com polimorfismo aq pra aceitar filme e serie
        perfil1.assistirConteudo(filme1);
        perfil1.assistirConteudo(ep1);

       
        System.out.println("=== SISTEMA DE STREAMING ===\n");

        
        System.out.println("-> Perfis do usuário: " + usuario1.getNome());
        for (int i = 0; i < usuario1.getPerfis().size(); i++) {
            System.out.println("- " + usuario1.getPerfis().get(i).getNome());
        }

        System.out.println();
        System.out.println();

       
        System.out.println("-> Conteúdos assistidos pelo perfil: " + perfil1.getNome());
        for (int i = 0; i < perfil1.getConteudosAssistidos().size(); i++) {
            
            Conteudo conteudoAssistido = perfil1.getConteudosAssistidos().get(i);
            System.out.println("- " + conteudoAssistido.getTitulo());
        }

        System.out.println();
        System.out.println();
        
        System.out.println("-> Elenco do filme: " + filme1.getTitulo());
        for (int i = 0; i < filme1.getElenco().size(); i++) {
            System.out.println("- " + filme1.getElenco().get(i).getNome());
        }
        
        System.out.println("\n=================================================");
    }
}