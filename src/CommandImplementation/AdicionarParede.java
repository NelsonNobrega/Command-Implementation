package CommandImplementation;

//Classe para adicionar paredes ao projeto geral da casa

public class AdicionarParede implements Comando {
    private Projeto projeto;

    public AdicionarParede(Projeto projeto) {
        this.projeto = projeto;
    }

    @Override
    public void executar() {
        projeto.adicionarParede();
    }
}

