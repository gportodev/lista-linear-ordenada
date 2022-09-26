public class Lista {
    private int ultimo;
    private int maxTam;
    private Contato vetor[];


    public Lista() {
		maxTam = ultimo = 0;
		vetor = null;
    }


    public int getUltimo() {
        return ultimo;
    }

    public void setUltimo(int ultimo) {
        this.ultimo = ultimo;
    }

    public int getMaxTam() {
    
        return maxTam;

    }

    public boolean setMaxTam(int aux) {

        if(aux <= 1) return false;

            maxTam = aux;
            ultimo = 0;
            vetor = new Contato[maxTam];
            return true;
    }

    public Contato[] getVetor() {
        return vetor;
    }

    public void setVetor(Contato[] vetor) {
        this.vetor = vetor;
    }

    public boolean listaVazia() {
        return ultimo == 0;
    }

    public boolean listaCheia() {
        return ultimo == maxTam;
    }

    public boolean insereOrdenado(Contato contato) {

        if(listaCheia()) return false;

        int pos = 0;

        while (pos < ultimo && contato.getCpf() > vetor[pos].getCpf()) pos++;

        if(pos == ultimo) {
            
            vetor[ultimo] = contato;
            
            ultimo++;

            return true;
        }

        for(int i = ultimo;i > pos;i--)
		
		{
			vetor[i] = vetor[i-1];
		}
		vetor[pos] = contato;
		ultimo++;

        return true;
    }

    public Contato retira(Contato contato) {

        if(listaVazia()) return null;

        int i = 0;

        while (i < ultimo && contato.getCpf() != vetor[i].getCpf()) i++;

        if(i == ultimo) return null;

        Contato ret = vetor[i];
        ultimo--;

        for (int j = i; j < ultimo; j++) vetor[j] = vetor[j + 1];

        vetor[ultimo] = null;

        return ret;

    }

    public Contato pesquisa(Contato contato) {

        if(listaVazia()) return null;

        int i = 0;

        while(i < ultimo && contato.getCpf() != vetor[i].getCpf()) i++;

        if(i == ultimo) return null;

        Contato ret = new Contato(vetor[i].getNome(), vetor[i].getEndereco(), vetor[i].getCpf());

        return ret;
    }

    public String getLista() {
        if(listaVazia()) return "\nLista vazia\n";

        String aux = "";

        for (int i = 0; i < ultimo; i++) 
        
        aux = aux + vetor[i].getContato() + "\n";

        return aux;
 
    }

}
