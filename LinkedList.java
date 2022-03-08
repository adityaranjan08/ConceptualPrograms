class LinkedList {
    Node start;


    class Node{
        int data;
        Node link;

        Node(int data){
            this.data = data;
            link = null;
        }
    }

    public void add(int data){
        Node newNode = new Node(data);
        newNode.link = start;
        start = newNode;
    }


    void removeDuplicates(){
        Node temp = start;
        Node prev = start;

        while(temp!=null){
            if(temp.data!= prev.data){
                prev.link = temp;
                prev = temp;
            }
            temp = temp.link;
        }
    }


    void displayList(){
        Node temp = start;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp= temp.link;
        }
        System.out.println();
    }

    void printReverse(Node start){
        if(start==null){
            return;
        }
        printReverse(start.link);
        System.out.println(start.data+" ");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(20);
        list.add(13);
        list.add(13);
        list.add(11);
        list.add(11);
        list.add(11);

        System.out.println("List before removal of duplicates");
        list.displayList();
        list.removeDuplicates();
        System.out.println("List After removal of duplicates");
        list.displayList();
        System.out.println("In Reverse Order");
        list.printReverse(list.start);

    }
}
