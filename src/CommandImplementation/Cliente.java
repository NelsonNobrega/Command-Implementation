package CommandImplementation;

//Cria��o real do projeto, junto com a execu��o dos objetos 

public class Cliente {
    public static void main(String[] args) {

        Projeto projeto = new Projeto();

        Comando adicionarParede = new AdicionarParede(projeto);
        Comando removerJanela = new RemoverJanela(projeto);

        GerenteProjeto gerente = new GerenteProjeto();
        
        gerente.setComando(adicionarParede);
        gerente.executarComando(); 
        
        gerente.setComando(removerJanela);
        gerente.executarComando(); 
    }
}

