//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Grafo<String> grafo = new Grafo<String>();
    grafo.addVertice("Joao");
    grafo.addVertice("Maria");
    grafo.addVertice("Pablo");
    grafo.addVertice("Marcos");
    grafo.addVertice("Matheus");

    grafo.addAresta(2.0, "Joao", "Maria");
    grafo.addAresta(3.0, "Maria", "Marcos");
    grafo.addAresta(1.0, "Marcos", "Pablo");
    grafo.addAresta(1.0, "Joao", "Pablo");
    grafo.addAresta(2.0, "Matheus", "Maria");
    grafo.addAresta(3.0, "Matheus", "Joao");
    }
}