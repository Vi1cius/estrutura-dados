public class FilaEstaticaCircular implements Enfileiravel {

	private int ponteiroInicio;
	private int ponteiroFim;
	private int quantidade;
	private Object[] dados;
	
	public FilaEstaticaCircular(int tamanho) {
		ponteiroInicio = 0;
		ponteiroFim = -1;
		quantidade = 0;		
		dados = new Object[tamanho];
	}

	public FilaEstaticaCircular() {
		this(10);
	}	

	@Override	
	public void enfileirar(Object dado){
		if (!estaCheia()) {
			ponteiroFim++;			

			if (ponteiroFim == dados.length) {
				ponteiroFim = 0;
			}
			quantidade++;

			dados[ponteiroFim] = dado;			
		} else {
			System.err.println("Fila Cheia!");
		}
	}
	
	@Override	
	public Object desenfileirar(){
		Object dadoInicio = null;	
		if (!estaVazia()) {
			dadoInicio = dados[ponteiroInicio];			
			ponteiroInicio++;		
			if (ponteiroInicio == dados.length) {
				ponteiroInicio = 0;
			}
			quantidade--;	
		} else {
			System.err.println("Fila Vazia!");
		}
		return dadoInicio;
	}
	
	@Override	
	public Object espiar() {
		Object dadoInicio = null;
		if (!estaVazia()) {
			dadoInicio = dados[ponteiroInicio];
		} else {
			System.err.println("Fila Vazia!");		
		}
		return dadoInicio;
	}
	
	@Override	
	public boolean estaCheia(){
		return (quantidade == dados.length);
	}
	
	@Override	
	public boolean estaVazia(){
		return (quantidade == 0);
	}
	
	@Override
	public String imprimir(){
		String resultado = "[";
		for (int i = 0, ponteiroAux = ponteiroInicio; i < quantidade; i++, ponteiroAux++) {

			if (i == quantidade - 1) {
				resultado += dados[ponteiroAux % dados.length];
			} else {
				resultado += dados[ponteiroAux % dados.length] + ",";		
			}
		}
		return resultado + "]";		
	}
}