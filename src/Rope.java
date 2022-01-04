public class Rope {
    Node root;

    public Rope(){
        root = new Node();
        initRope();
    }

    public void initRope() {
        append("rope");
        append("_is");
        append("_st");
        append("ron");
        append("ger");
    }

    public void append(String str){
        Node newNode = new Node(str);
        Node tmpRoot = new Node();

        tmpRoot.right = newNode;
        tmpRoot.left = root;

        if (tmpRoot.left.right == null){
            tmpRoot.weight = tmpRoot.left.weight;

        }else{
            tmpRoot.weight = tmpRoot.left.weight +  tmpRoot.left.right.weight;
        }

        root = tmpRoot;
    }
    public void findIndex(int index){
        Node tmpNode = root;
        if (index > tmpNode.weight){
            index -= tmpNode.weight;
            System.out.println(tmpNode.right.data.charAt(index));
        }
        while (index < tmpNode.weight){
            tmpNode = tmpNode.left;
        }
        index -= tmpNode.weight;
        System.out.println(tmpNode.right.data.charAt(index));
    }

    public void printRoot (){
        Node.printNode(root);
    }
}
