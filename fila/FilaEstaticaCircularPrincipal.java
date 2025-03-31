public class FilaEstaticaCircularPrincipal {
	public static void main(String args []) {
		Empilhavel p2 = new PilhaEstatica(30);
		fila.empilhar("Instituto");
		fila.empilhar("Federal");
		System.out.println("Espiar:" + fila.topo());		
		fila.empilhar("de");
		fila.empilhar("Educação");
		fila.empilhar("Ciência");
		fila.empilhar("e");		
		System.out.println("Espiar:" + fila.topo());		
		Object conteudo = fila.desempilhar();
		fila.desempilhar();
		fila.empilhar("Tecnologia");
		fila.empilhar("da");
		fila.empilhar("Bahia");	
		fila.empilhar(fila.desempilhar());
		fila.empilhar(conteudo);
		System.out.println("fila="+fila.imprimir());
	}
}