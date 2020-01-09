public class LinkedList {
Node head;
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
    }
}
    public void append(int data){
        
        if(head == null){
            head = new Node(data);
            return;
        }
        Node current = head;
        while(current.next!=null){
            current = current.next;
        }
        current.next = new Node(data);
    }

    public void prepend(int data){
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }
    public void nodeDeleteWithValue(int data){
        Node current = head;
        if(head == null){
            return;
        }
        if(head.data == data){
            head = head.next;
        }
        while(current.next!=null){
            if(current.next.data ==  data){
                current.next =  current.next.next;
            }
            current =current.next;
        }
    }

    public void display(){
        if(head == null){
            System.out.println("Empty List");
        }
        Node current = head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }

    public static void main(String args[]){
        LinkedList listTest = new LinkedList();
        listTest.append(10);
        listTest.append(20);
        listTest.append(30);

        listTest.display();
    }
}