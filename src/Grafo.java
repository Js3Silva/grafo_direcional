import java.util.ArrayList;

public class Grafo <TIPO>{
    private ArrayList<Vertice<TIPO>> vertices;
    private ArrayList<Aresta<TIPO>> arestas;

    public Grafo(){
        vertices = new ArrayList<Vertice<TIPO>>();
        arestas = new ArrayList<Aresta<TIPO>>();
    }

    public void addVertice(TIPO dado){
        Vertice<TIPO> novoVertice = new Vertice<>(dado);
        this.vertices.add(novoVertice);
    }

    public void addAresta(double peso, TIPO dadoInicio, TIPO dadoFim){
        Vertice<TIPO> inicio = this.getVertice(dadoInicio);
        Vertice<TIPO> fim = this.getVertice(dadoFim);
        Aresta<TIPO> aresta = new Aresta<TIPO>(peso, inicio, fim);
        inicio.addArestaSaida(aresta);
        fim.addArestaEntrada(aresta);
        arestas.add(aresta);
    }

    public Vertice<TIPO> getVertice(TIPO dado){
        Vertice<TIPO> novoVertice = null;
        for(Vertice<TIPO> v : vertices){
            if(v.equals(dado)){
                novoVertice = v;
                break;
            }
        }
        return novoVertice;
    }
}
