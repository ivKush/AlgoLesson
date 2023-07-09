package lessonHome3;

public class Main {
    public static void main(String[] args) {
        
        metodReverseLinkedlist list = new metodReverseLinkedlist();

        list.add(5);
        list.add(2);
        list.add(9);
        list.add(0);
        list.add(-5);

        list.print();
        list.reverse();
        list.print();
    }
}
