package CommandImplementation;

//Aqui e criado o comando para remover as janelas do projeto

public class RemoverJanela implements Comando {
    private Projeto projeto;

    public RemoverJanela(Projeto projeto) {
        this.projeto = projeto;
    }

    @Override
    public void executar() {
        projeto.removerJanela();
    }
}

