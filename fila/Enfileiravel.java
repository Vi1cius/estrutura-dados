//Fila (Queue)
//Foça Circular (Cycle Queue)
//Fila com Dupla Terminação (DeQUE)

public interface Enfileiravel {
void enfileirar(Object dado);   //C enqueue
Object frente();                //R front
void atualizar(Object dado);    //U update
void atualizarInicio(Object dado);    
void atualizarFim(Object dado);      
Object desenfileirar();         //D dequeue
                                //S sort
boolean estaCheia();
boolean estaVazia();
String imprimir();

}