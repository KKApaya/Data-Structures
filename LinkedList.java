public class LinkedList {
Node head;
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
	/*
	*This method Inserts the specified element in this LinkedList.
	*/
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
	/*
	*This method Inserts the specified element at the beginning of this LinkedList.
	*/

    public void prepend(int data){
        Node newHead = new Node(data);
        newHead.next = head;
        head = newHead;
    }
	/*
	*This method Deletes a value from the LinkedList.
	*/

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
	/*
	*This method Inserts the specified element at the beginning of this LinkedList.
	*/

    public void addFirst(int data){
        Node newhead = new Node(data);
        newhead.next = head;
        head = newhead;
    }
	/*
	*This method removes all of the elements from this LinkedList 
	*/


    public void clear(){
        while(head.next!=null){
                head = null;
                return;
            }
        }
	/*
	*Method is used to check whether an element is present in a LinkedList or not
	*/

    public boolean contains(int data){
        Node current = head;
        if(head == null)
            {
                System.out.println("Empty Linked List");
            }
            if(head.data == data){
                return true;
            }
            while(current!=null){
                if(current.data == data){
                    return true;
                }
                current = current.next;
            }
            return false;
    }
	/*
	*Method is used to fetch or retrieve an element at a specific index from a LinkedList.
	*/

    public int get(int index){
        Node current = head;
        int temp = 0;

        while(current!=null){
            if(temp == index){
                return current.data;
            }
            temp++;
            current = current.next;
        }
        if(index >= temp ){
            System.out.println("Out Of Bound");
        }
        return 0;
        
    }

	/*
	*This method removes the last element from this LinkedList.
	*/

    public void removeLast(){
        Node current = head;
        if(head == null)
            {
                System.out.println("Empty Linked List");
            }
            if(head.next == null){
                head = null;
                return;
            }
            while(current.next!=null){
                if(current.next.next == null){
                    current.next = null;
                    return;
                }
                current = current.next;
            }
}
/*
    *This method retrieves, but does not remove, the first element of this list, or returns null if this list is empty.
    */
    public int peekFirst​(){
        if(head == null) return 0;
        int first = head.data;
        return first;
    }

    /*
    *This method retrieves, but does not remove, the last element of this list, or returns null if this list is empty.
    */
    public int peekLast​(){
        if(head == null) return 0;
        Node current = head;
        while(current!=null){
            if(current.next==null){
                return current.data;
            }
            current = current.next;
        }
        return 0;
    }

    /*
    *This method returns the number of elements in this list.
    */
    public int size​(){
        if(head == null) return 0;
        Node current = head;
        int count = 0;

        while(current!=null){
            count ++;
            current = current.next;
        }
        return count;
        
    } 

    /*
    *Set​(int index, E element): This method replaces the element at the specified position in this list with the specified element.
    */
    public void set(int index,int data){
        if(head == null) return ;
        Node current = head;
        int count = 0;

        while(current!=null){
            if(index == count){
                current.data = data;
            }
            count++;
            current = current.next;
        }
    }

        
    }
}
