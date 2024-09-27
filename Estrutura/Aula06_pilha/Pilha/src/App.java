import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Stack<String> pilha_pratos = new Stack();

        pilha_pratos.push("Prato Laranja");
        pilha_pratos.push("Prato Azul");
        pilha_pratos.push("Prato Vermelho");
        pilha_pratos.push("Prato verde");

        int tam = pilha_pratos.size();
        System.out.println("O tamanho da pilha é: "+tam);

        //verificar o topo da pilha
        String topo = pilha_pratos.peek();
        System.out.println("O prato que está no topo é o: "+topo);


        //Removendo o que ta no topo
        String rem = pilha_pratos.pop();
        System.out.println("O elemento removido foi: "+rem);

        topo = pilha_pratos.peek();
        System.out.println("O prato que está no topo é o: "+topo);

        System.out.println("Utilizando Conceito LIFO(ultimo a entrar, primeiro a sair");

        for(int i=pilha_pratos.size()-1;i>0;i--){
           System.out.println(pilha_pratos.get(i));
        }
    }
}
