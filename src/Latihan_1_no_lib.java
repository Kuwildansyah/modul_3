public class Latihan_1_no_lib<T>{
    //Top node of the stack
    private Node top = null;

    class Node{
        T item;
        Node next;
    }


    public T pop(){
        if(isEmpty()){
            return null;
        }
        T item = top.item;
        top = top.next;
        return item;
    }


    public void push(T s){
        Node oldtop = top;
        top = new Node();
        top.item = s;
        top.next = oldtop;
    }


    public boolean isEmpty(){
        return top == null;
    }
}

