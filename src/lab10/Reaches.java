package lab10;

import java.util.ArrayList;
import java.util.List;

public class Reaches extends DepthFirstSearch {
    List<Vertex> vertices = new ArrayList<>();

    public Reaches(Digraph graph) {
        super(graph);
    }

    @Override
    protected void processEdge(DirectedEdge e) {
        vertices.add(e.v);
    }

    public boolean isReachable(Vertex s, Vertex v) {
        vertices.add(s);
        start(s);
        return vertices.contains(v);
    }
}
