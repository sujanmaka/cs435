package lab10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * This extension of DFS successfully outputs a topological ordering
 * as long as input graph is a DAG. If every vertex is reachable
 * from the starting vertex, the output will be a topological ordering
 * of the entire graph; if not, it will be a topological ordering
 * of all vertices in the graph that are reachable from the starting
 * vertex.  (As mentioned in the slides, this approach can be improved
 * so that all vertices are output in topologically sorted order.)
 * <p>
 * IMPLEMENT
 */
public class TopologicalSort extends DepthFirstSearch {
    private Vertex[] sortedVertices;
    private Vertex topSortStartVertex = null;
    Stack<Vertex> startVertices = new Stack<>();
    private List<Vertex> visited = new ArrayList<>();

    public Vertex getTopSortStartVertex() {
        return topSortStartVertex;
    }

    /**
     * Assumption: g is a DAG. If not, there is no guarantee concerning
     * the nature of the output.
     */
    public TopologicalSort(Digraph g) {
        super(g);
        computeTopStartVertex();
        sortedVertices = new Vertex[vertices.size()];
        int length = vertices.size() - 1;
        while (!startVertices.isEmpty()) {
            stack.push(startVertices.pop());
            while (!stack.isEmpty()) {
                Vertex v = null;
                v = nextUnvisitedAdjacent(stack.peek());
                if (v == null) {
                    visitedVertices.put(stack.peek(), stack.peek());
                    sortedVertices[length] = stack.pop();
                    length--;
                } else {
                    stack.push(v);
                }

            }

        }
    }

    public List<Vertex> getTopologicalOrdering() {
        //warning: will return null until this class has been implemented!
        return Arrays.asList(sortedVertices);
    }

    /**
     * Finds, if possible, a vertex that has no in-vertices and sets this value
     * in topSortStartVertex
     * If not found, throws an IllegalStateException, indicating that
     * the input graph is not a DAG.
     */
    public void computeTopStartVertex() {
        //implement
        List<Vertex> possibleStartVertices = new ArrayList<>(vertices);
        for (DirectedEdge edge : edges) {
            possibleStartVertices.remove(edge.v);
        }
        if (possibleStartVertices.isEmpty()) {
            throw new RuntimeException("No start vertex available.");
        }
        //Assuming there is only one possible start vertex
        topSortStartVertex = possibleStartVertices.get(0);
        //Assuming there are multiple possible start in-vertices
        possibleStartVertices.forEach(v -> startVertices.push(v));

    }


}
