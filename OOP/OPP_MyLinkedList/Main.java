package OOP_hw3;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.addLast(6);
        list.addLast(7);

        for(int i : list){
            System.out.println(i);
        }
    }
}
