public class LinkedList2 {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
    public static class LinkedList{
        Node head=null;
        Node tail=null;
        int size=0;
        void insertAtEnd(int data){
            Node temp = new Node(data);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
            size++;
        }
        void insertAtHead(int data){
            Node temp=new Node(data);
            if(head==null){
                head=tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
            size++;
        } 
        void display(){
            Node temp=head;
            while(temp!=null){
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }
        int size(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
        void insertAt(int index,int data){
            Node t=new Node(data);
            Node temp=head;
            if(index==size()){
                insertAtEnd(data);
                return;
            }
            else if(index==0){
                insertAtHead(data);
            }
            for(int i=1;i<=index-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
            size++;
        }
        int getAt(int index){
            Node temp=head;
            for(int i=1;i<=index;i++){
                temp=temp.next;
            }
            return temp.data;
        }
    }
    public static void main(String[] args) {
        LinkedList a1=new LinkedList();
        a1.insertAtHead(6);
        a1.insertAtEnd(5);
        // a1.display();
        a1.insertAtEnd(15);
        a1.display();
        System.out.println("size:");
        System.out.println(a1.size()); 
        System.out.println("after insertion of 8 at 1nd position");
        a1.insertAt(1, 8);
        a1.display();
        System.out.println("getAt");
        System.out.println(a1.getAt(3));
        System.out.println("size using variable efficient mathod");
        System.out.println(a1.size);

    }
}
    

