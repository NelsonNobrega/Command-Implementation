package CommandImplementation;

//Essa classe recebe os comandos da classes e os executa

public class GerenteProjeto {
    private Comando comando;

    public void setComando(Comando comando) {
        this.comando = comando;
    }

    public void executarComando() {
        comando.executar();
    }
}
