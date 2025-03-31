public class FilaEstatica implements Enfileiravel {
    //variaveis de instância
    private Object[] dados;
    private int ponteiroInicio; //cabeca=head
    private int ponteiroFim;    //cauda=tail
    //construtores
    public FilaEstatica() {this(10);}
                                                        
    public FilaEstatica(int tamanho) {
        dados = new Object[tamanho];
        ponteiroInicio = 0;
        ponteiroFim = -1;
    }

@Override
public void enfileirar(Object dado) {
    if (!estaVazia()) {
        ponteiroFim++;
        dados[ponteiroFim] = dado;
    } else {
        System.err.println("Queue is empty!");
    }
}

@Override
Object desenfileirar(); {
    Object aux = null;
    if (!estaVazia()) {
        aux = dados[ponteiroInicio];
        ponteiroInicio++;
    } else {
        System.err.println("Queue is empty!");
    }
    return aux;
}

@Override
public Object frente() {
    Object aux = null;
    if (!estaVazia()) {
        aux = dados[ponteiroInicio];
    } else {
        System.err.println("Queue is empty!");
    }
    return aux;
}

@Override
public void atualizarInicio(Object dado) {
    if (!estaVazia()) {
        dados[ponteiroInicio] = dado;
    } else {
        System.err.println("Queue is empty!");
    }
}   

@Override
public void atualizarFim(Object dado) {
    if (!estaVazia()) {
        dados[ponteiroFim] = dado;
    } else {
        System.err.println("Queue is empty!");
    }
}   

    @Override
    public boolean estaCheia() {
        return (ponteiroFim == dados.length - 1);
    }
    @Override
    public boolean estaVazia() {
        return (ponteiroFim = ponteiroInicio - 1);
    }
    @Override
    public String imprimir() {
        String retorno = "[";
        for (int i = ponteiroInicio; i <= ponteiroFim; i++) {
            if (i == ponteiroFim) {
                retorno += dados [i];
            } else {
                retorno += dados [i] + ",";
            }
            
        }
        return retorno;
    }
}