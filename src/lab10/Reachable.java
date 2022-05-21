package lab10;

import java.util.ArrayList;
import java.util.List;

public class Reachable extends DepthFirstSearch {
    List<Vertex> vertices = new ArrayList<>();

    public Reachable(Digraph graph) {
        super(graph);
    }

    @Override
    protected void processEdge(DirectedEdge e) {
        vertices.add(e.v);
    }

    public List<Vertex> getReachableVertices(Vertex s) {
        //implement
        vertices.add(s);
        start(s);
        return vertices;
    }
}
