public class Main {
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.append('A');
        list.append('B');
        list.append('C');
        list.append('D');

        System.out.println("Initial list: " + list);
        System.out.println("Initial list size: " + list.getSize() + "\n");

        list.printThirdElement();

        list.deleteLast();
        System.out.println("List post last node delete: " + list);
        System.out.println("List size post last node delete: " + list.getSize() + "\n");

        list.append('D');
        list.deleteFirst();
        System.out.println("List post first node delete: " + list);
        System.out.println("List size post first node delete: " + list.getSize() + "\n");


        list.addElementToIndex('A', 1);
        System.out.println("List after adding element to index: " + list);
        System.out.println("List size: " + list.getSize() + "\n");

        list.addElementToIndex('Z', 3);
        System.out.println("List after adding Z to spot 3: " + list);
        System.out.println("List size: " + list.getSize() + "\n");
    }
}