public class Ordenacao {
    int dados[] = {6, 8, 3, 1, 9, 0, 2, 5};
    
    public void imprimirTela() {
        for (int dado: dados)
            System.out.print(dado + " ");
        System.out.println(" ");
    }

    public void selectionSort() {
        for (int j = 0; j< dados.length; i++) { 
        int menor = j;
        }
            for(int i = 1 + j; i< dados.length; i++) {
                if (dados[menor] > dados[i]) {
                    int menor =i;
                }
            }
        troca(0, menor);
    }
    
    public void bubleSort() {
        for (int i = 0; i < dados.length-1; i++) {
            if (dados[i] > dados[i+1])
                troca(i, i+1);
        }
    }
}

private void troca(int indice1, int indice2) {
    int temp = dados[indice1];
    dados[indice1] = dados[indice2];
    dados[indice2] = temp;
