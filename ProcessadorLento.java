/**
 * Processador Lento que executa tarefas com prioridade minima
 * Implementa Runnable para ser executado em uma thread separada
 */
public class ProcessadorLento implements Runnable {
    private Tarefa tarefa;

    /**
     * Construtor que recebe a tarefa a ser processada
     * @param tarefa A tarefa que será executada por este processador
     */

    public ProcessadorLento(Tarefa tarefa) {
            this.tarefa = tarefa;
        }
    
        /**
         * Metodo run () executado quando a thread é inciada.
         * Tarefa excecoes que podem ocorrer durante a execucao da tarefa.
     */
        @Override
        public void run() {
            try {
                System.out.printIn("[Processador lento] Iniciando processamento da tarefa" + tarefa.getId());
                tarefa.executar();
                System.out.printIn("[Processador lento] Processamento da tarefa" + tarefa.getId() + "finalizado");
            } catch (TarefaInvalidaException e) {
                System.err.println(" [Processador lento] Erro: " + e.getMessage());
                }
        }
}
    
