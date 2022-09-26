import java.util.Scanner;

public class Base {
    static Scanner leia = new Scanner(System.in);

    static Contato criarContato() {
        String n,e;

        long c;

        System.out.println("CPF: ");
        c = leia.nextLong();
        leia.skip("\\R");

        System.out.println("Nome: ");
        n = leia.nextLine();

        System.out.println("Endereço: ");
        e = leia.nextLine();

        Contato aux = new Contato(n ,e, c);

        return aux;
    }
    public static void main(String[] args) throws Exception {
        
        int op;
        Contato aux = null;
        Lista objLista = new Lista();

        op = 256;

        while(!objLista.setMaxTam(op));

        do {
            
            System.out.println("\nDigite: ");
            System.out.println("\n1 - Inserir um contato: ");
            System.out.println("\n2 - Remover um contato: ");
            System.out.println("\n3 - Buscar um contato: ");
            System.out.println("\n4 - Mostrar a lista: ");
            System.out.println("\n5 - Encerrar programa.");

            op = leia.nextInt();

            switch(op) {

                case 1:

                    aux = criarContato();

                    if(objLista.insereOrdenado(aux)) System.out.println("\nSucesso!\n");

                    else System.out.println("\nLista cheia!\n");

                    aux = null;

                    break;

                case 2:

                    aux = criarContato();
                    aux = objLista.retira(aux);

                    if(aux == null) System.out.println("\nContato existente");

                    else {
                        System.out.println("*****************************");

                        System.out.println("\nCONTATO REMOVIDO");
                        System.out.println("\nNome: " + aux.getNome());
                        System.out.println("\nEndereço: " + aux.getEndereco());
                        System.out.println("\nCPF: " + aux.getCpf());

                        System.out.println("*****************************");

                    }

                    aux = null;

                    break;

                case 3:

                    aux = criarContato();
                    aux = objLista.pesquisa(aux);

                    if(aux == null) System.out.println("\nContato inexistente!");

                    else {
                        System.out.println("*****************************");
                        System.out.println("\nRESULTADO ENCONTRADO: \n");

                        System.out.println("\nNome: " + aux.getNome());
                        System.out.println("\nEndereço: " + aux.getEndereco());
                        System.out.println("\nCPF: " + aux.getCpf());
                        System.out.println("*****************************");

                    }


                case 4:
                    
                    System.out.println("*****************************");
			        System.out.println("\nLISTA ATUAL: \n");
			        System.out.println("\n" + objLista.getLista() + "\n");
                    System.out.println("*****************************");


                    break;

                case 5:

				    System.out.println("\nPrograma encerrando.\n");
            }


        } while (op != 5);

    }
}
