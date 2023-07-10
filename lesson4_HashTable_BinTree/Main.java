package lesson4_HashTable_BinTree;

public class Main {
    public static void main(String[] args) {

        HashTable<Integer, String> table = new HashTable<>();

        table.add( 1, "gffg");
        table.add( 12, "gffg");
        table.add( 65, "gffg");
        table.add( 45, "gffg");
        table.add( 9, "gffg");
        table.add( 7, "gffg");
        // table.add( 6, "gffg");
        // table.add( 5, "gffg");
        // table.add( 2, "gffg");
        
        table.print();

        System.out.println(table.getLength());
        System.out.println(table.getSize());


    }
}
