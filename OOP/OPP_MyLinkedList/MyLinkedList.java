package OOP_hw3;

import java.util.Iterator;

public class MyLinkedList <T> implements Iterable<T>{

    public class ListIterator implements Iterator<T>{
        Node current;

        public ListIterator(Node current) {
            this.current = current;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T result = current.data;
            current = current.next;
            return result;
        }
    }
    @Override
    public Iterator<T> iterator() {
        return new ListIterator(head);
    }

    public class Node{
        public T data; // ссылка на какой-либо объект
        public Node next; // ссылка на следующий объект
        public Node(){
            this.data = null;
            this.next = null;
        }
        public Node(T data){
            this.data = data;
            this.next = null;
        }

        public Node(T data, Node next){
            this.data = data;
            this.next = next;
        }

        public String toString(){
            return "Node " + data.toString() +"";
        }
    }

    private int count = 0;
    private Node head = null;

    public int size(){
        return count;
    }
    public void addFirst(T element){

        if (head == null){
            head = new Node(element);
        } else {
            head = new Node(element, head);
        }

        count++;
    }

    public boolean addLast(T element) {

        if (head == null) {
            head = new Node(element);
        } else {
            Node node = head;
            while (node.next != null) {
                node = node.next;
            }
            node.next = new Node(element);
        }
        count++;
        return true;
    }
}
