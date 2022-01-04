public class Node {
    public String data = null;
    public Node left = null;
    public Node right = null;
    public int weight = 0;

    public Node (String data){
        this.data = data;
        this.weight = data.length();
    }
    public Node(){

    }
    public static void printNode(Node node){
        if (node != null){
            printNode(node.left);
            if (node.data != null){
                System.out.println(node.data);
            }
            printNode(node.right);
        }
    }
}
