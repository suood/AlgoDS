package ds.graph;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by sherxon on 1/1/17.
 */
public class Vertex<T> {
    private T value;
    private Collection<Vertex<T>> neighbors; // used with Unweighted graphs
    private Vertex<T> parent; // used in dfs and bfs
    private boolean visited; //used for bfs and dfs
    private Integer weight;
    public Vertex(T value) {
        this.value = value;
        this.neighbors= new ArrayList<>();
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public void addNeighbor(Vertex<T> vertex){
        this.neighbors.add(vertex);
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Collection<Vertex<T>> getNeighbors() {
        return neighbors;
    }


    public Vertex<T> getParent() {
        return parent;
    }

    public void setParent(Vertex parent) {
        this.parent = parent;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public void removeNeighrbor(Vertex<T> vertex) {
        this.neighbors.remove(vertex);
    }
}
