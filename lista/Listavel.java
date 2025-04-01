//Listable
public interface Listavel {
    void inserir (Object dado);                         //C     insert
    void anexar (Object dado);                          //C     append
    Object selecionar (int posicao);                    //R     select
    Object[] selecionarTodos();                         //R     selectALL
    void atualizar (Object dado, int posicao);          //U     update
    Object apagar (int posicao);                        //D     delete
    boolean contem (Object dado);                       //S     sort  
    void limpar();                                      //D
    
    //extra
    int primeiraOcorrencia (Object dado);
    int ultimaOcorrencia (Object dado);
}
