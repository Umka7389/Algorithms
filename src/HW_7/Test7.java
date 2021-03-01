package HW_7;

public class Test7 {

    public static void main(String[] args) {
//        testGraph();
//        testDfs();
//        testBfs();
        testMinDestination();
    }

    private static void testGraph() {
        IGraph graph = new Graph(4);
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        graph.addEdges("A", "B", "C");
        graph.addEdges("B", "A", "C", "D");
        graph.addEdges("C", "A", "B", "D");
        graph.addEdges("D", "B", "C");

        System.out.println("Size of graph is " + graph.getSize());
        graph.display();
    }

    private static void testDfs() {
        Graph graph = new Graph(7);
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");

        graph.addEdges("A", "B", "C", "D");
        graph.addEdges("B", "E");
        graph.addEdges("D", "F");
        graph.addEdges("F", "G");

        graph.dfs("A");
        //A B E C D F G
    }

    private static void testBfs() {
        Graph graph = new Graph(8);
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");
        graph.addVertex("H");

        graph.addEdges("A", "B", "C", "D");
        graph.addEdges("B", "E");
        graph.addEdges("E", "H");
        graph.addEdges("C", "F");
        graph.addEdges("D", "G");

        graph.bfs("A");
    }
    private static void testMinDestination() {
        Graph graph = new Graph(10);
        graph.addVertex("Москва");
        graph.addVertex("Тула");
        graph.addVertex("Липецк");
        graph.addVertex("Воронеж");
        graph.addVertex("Рязань");
        graph.addVertex("Тамбов");
        graph.addVertex("Саратов");
        graph.addVertex("Калуга");
        graph.addVertex("Орел");
        graph.addVertex("Курск");


        graph.addEdges("Москва", "Тула", "Рязань", "Калуга");
        graph.addEdges("Тула", "Липецк", "Москва");
        graph.addEdges("Липецк", "Тула", "Воронеж");
        graph.addEdges("Воронеж", "Липецк", "Саратов", "Курск");
        graph.addEdges("Рязань", "Москва", "Тамбов");
        graph.addEdges("Тамбов", "Рязань", "Саратов");
        graph.addEdges("Саратов", "Тамбов", "Воронеж");
        graph.addEdges("Калуга", "Москва", "Орел");
        graph.addEdges("Орел", "Калуга", "Курск");
        graph.addEdges("Курск", "Орел", "Воронеж");

        graph.optimalDestination("Москва", "Воронеж");
    }
}
