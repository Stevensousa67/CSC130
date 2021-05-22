public class LinkedList {
    private Node head;
    private int size;

    public LinkedList(){
        head = new Node();
    }
    public void append(Character data){
        Node n = new Node();
        n.data = data;
        if(head == null){
            head = n;
            size++;
        }
        else{
            Node node = head;
            while(node.next != null){
                node = node.next;
            }
            node.next = n;
            size++;
        }
    }
    public int getSize(){
        return size;
    }
    public String toString(){
        Node n = head.next;
        String temp = "";
        while(n != null){
            temp = temp + n.data + " ";
            n = n.next;
        }
        return temp;
    }
    public void deleteFirst(){
        if(size > 0) {
            head.next = head.next.next;
            size--;
        }
    }
    public void deleteLast(){
        if(size == 1){
            head.next = null;
            size--;
        }
        else if(size != 0){
            Node n = head.next;
            int counter = 1;
            while(counter != size-1){
                n = n.next;
                counter++;
            }
            n.next = null;
            size--;
        }
    }
    public void addElementToIndex(Character data, int index){
        Node n = new Node();
        n.data = data;
        if(index == 0){
            n.next = head;
            head = n;
            size++;
        }
        else{
            Node node = head;
            for(int i = 0; i < index-1; i++){
               node = node.next;
            }
            n.next = node.next;
            node.next = n;
            size++;
        }
    }
    public void printThirdElement(){
        System.out.println("Third node: " + head.next.next.next.data + "\n");
    }
}
