/**
 * Classe que representa uma tarefa a ser executada no servidor multitarefa
 * Cada tarefa possui um identificador unico e umda descrição
 */
public class Tarefa {
    private int id;
    private String descricao;
    
    /**
     * Construtor da classe tarefa
     * @param id Identificador unico de tarefa
     * @param id descricao Descricao da tarefa a ser executada
     */
    public Tarefa(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }
    
    /**
     * Executa a tarefa, imprimindo sua descricao e simulando processamento
     * @throws TarefaInvalidaException Se a descrição for nula ou vazia
     */
    public void executar() throws TarefaInvalidaException {
        // Valida se a descricao é valida
        if (descricao == null || descricao.trim() .isEmpty()) {
            throw new TarefaInvalidaException("Tarefa com ID " + id +", descricao " + "[[ " + descricao +" ]] " +" invalida!");
    }

    // Imprime inforacoes da tarefa
    System.out.println("[" + Thread.currentThread() .getName() + "] Executando tarefa " + id +: " + descricao);

    try {
        // Simula processamento  da tarefa (1 segundo)
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        System.out.println(" + Thread.currentThread().getName() + "] Tarefa " + id + " foi interrompido");
        Thread.currentThread(). interrupt() ; // Restaura o status de interrupcao
    }

        System.out.println("[" Thread.currentThread().getname() + "] Tarefa " + id + "concluida");
    }

    // Geters
    public int getId() {
        return id;
    }

    public string getDescricao() {
        return descricao;
    }
}
