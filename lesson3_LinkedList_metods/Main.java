package lesson3_LinkedList_metods;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(5);
        list.add(2);
        list.add(9);
        list.add(0);
        list.add(-5);

        list.print();
        list.remove(-5);
        list.removeAt(2);
        list.addAt(20, 0);
        // list.quickSort();
        list.print();

    }
}
