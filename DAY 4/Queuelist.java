	
public class Queuelist
{
	public static void main(String[] args) {
		Queue q=new  Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);
		q.print();
		int l=q.length();
		System.out.println(l);
		
	}
}
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Queue{
    Node head;
    Node rear;
    Queue(){
        this.head=null;
        this.rear=null;
    }
    boolean isempty(){
        if(head==null){
            return true;
        }
        else{
            return false;
        }
    }
    void enqueue(int val){
        Node newnode=new Node(val);
        if(isempty()){
            this.head=newnode;
            this.rear=newnode;
        }
        rear.next=newnode;
        rear=newnode;
    }
    int dequeue(){
        if(isempty()){
            return -1;
        }
        int value=head.data;
        head=head.next;
        return value;
    }
    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    int length(){
        Node temp=head;
        int length1=0;
        while(temp!=null){
            length1++;
            temp=temp.next;
        }
        return length1;
    }
}
