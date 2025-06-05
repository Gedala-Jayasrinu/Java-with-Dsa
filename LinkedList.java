public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList(){
        this.size = 0;
    }

    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }

        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node =new Node( val, temp.next);
        temp.next=node;
        size++;

    }
    public void insertFirst(int val){
        Node node = new Node(val); //creating the new node
        node.next = head; //point new to current head;
        head = node;//now assiging new node as head 

        if(tail == null){
            tail = head;//assigning tail is also head if there is only one element exist
        }
        size += 1;      //increasing in the size
    }
    public void insertLast(int val){
        Node node=new Node(val);

        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        size++;
        temp.next=node;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondlast=get(size-2);
        int value=tail.value;
        tail=secondlast;
        tail.next=null;
        return value;
    }

    public int delete(int index){
        if(index==0){
            return  deleteFirst();
        }

        if(index==size-1){
            return  deleteLast();
        }

        Node prev=get(index-1);
        int val=prev.next.value;

        prev.next=prev.next.next;
        return  val;
    }
    public  int deleteFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public  Node get(int index){     //function to get the index point
        Node node= head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }

    public void display(){
        Node temp = head; //assigning the head as temp since to avoid structure breaking
        while(temp != null){
            System.out.print(temp.value + " -> ");//Return the current value
            temp = temp.next; //jumps to the next value
        }
        System.out.println("END");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
