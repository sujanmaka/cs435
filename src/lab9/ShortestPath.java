package lab9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ShortestPath extends BreadthFirstSearch {

    private HashMap<Vertex, Vertex> parentMap = new HashMap<>();

    public ShortestPath(Graph graph) {
        super(graph);
    }

    @Override
    protected void handleInitialVertex(Vertex v) {
        if (v != null) {
            setHasBeenVisited(v);
            processVertex(v);
            parentMap.put(v, null);
            makeVertexCurrent(v);
        }
    }

    @Override
    protected void processEdge(Edge e) {
        Vertex child = e.u;
        Vertex parent = e.v;
        parentMap.put(child, parent);
    }

    public List<Vertex> getShortestPath(Vertex s, Vertex v) {
        start(s);
        Vertex current = v;
        List<Vertex> vertices = new ArrayList<>();
        vertices.add(current);
        while (parentMap.get(current) != null) {
            vertices.add(parentMap.get(current));
            current = parentMap.get(current);
        }

        return vertices;
    }

    //professor's solution
    public List<Vertex> computeShortestPath(Vertex s, Vertex v) {
        start(s);
        List<Edge> edgePath = shortestEdgePath(new ArrayList<>(), s, v);
        System.out.println("Edge Path " + edgePath);
        List<Vertex> path = new ArrayList<>();
        path.add(s);
        if (!edgePath.isEmpty()) {
            for (int i = edgePath.size() - 1; i >= 0; i--) {
                path.add(edgePath.get(i).u);
            }
        }
        return path;
    }

    private List<Edge> shortestEdgePath(ArrayList<Edge> temp, Vertex s, Vertex v) {
        if (v.equals(s)) {
            return temp;
        }
        Vertex w = parentMap.get(v);
        temp.add(new Edge(v, w));
        return shortestEdgePath(temp, s, w);
    }
}
