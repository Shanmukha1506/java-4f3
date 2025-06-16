
public class Singlelinkedlist
{
	public static void main(String[] args){
	    LinkedList list=new LinkedList();
	    list.insertbeg(10);
	    list.insertbeg(20);
	    list.insertbeg(30);
	    list.insertbeg(40);
	    list.insertend(60);
	    list.insertpos(70,3);
	    list.deletebeg();
	    list.deleteend();
	    list.deletepos(2);
	    list.print();
	}
}
   class Node{
        int data;
        Node next;
        Node(int data){
          this.data=data;
          this.next=next;
    }
   }
 class LinkedList{
        Node head;
        LinkedList(){
            this.head=null;
        }
    
    Node gethead(){
        return head;
    }
    void insertbeg(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
    }
    void insertend(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
    int length(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    void insertpos(int data,int pos){
        Node newnode=new Node(data);
        Node length=length();
        Node temp=head;
        if(pos>=0 &&pos<=length){
            if(pos==0){
                insertbeg(data);
            }
            else if(pos==length){
                insertend(data);
            }
            else
            {
                for(int i=0;i<pos;i++){
                    temp=temp.next;
                }
                newnode.next=temp.next;
                temp.next=newnode;
            }
        }
        else{
            System.out.println("invalid position");
        }
    }
    void print(){
        Node temp=head;
        System.out.println("the elements are:");
	       while(temp!=null){
	           System.out.print(temp.data+"-->");
	           temp=temp.next;
	       }
	       System.out.println("null\n");
    }
    int deletebeg(){
        if(head==null){
            System.out.println("no elements");
            return -1;
        }
        Node temp=head;
        int removedelement=head.data;
        head=temp.next;
        return removedelement;
    }
    int deleteend(){
        int length1=length();
        Node temp=head;
        if(length1==0){
            System.out.println("no elements");
            return -1;
        }
        if(length1==1){
            int removedelement=head.data;
            head=head.next;
            return removedelement;
        }
        for(int i=1;i<length1-1;i++){
            temp=temp.next;
        }
        int removedelement=temp.next.data;
        temp.next=null;
        return removedelement;
    }
    int deletepos(int pos){
        Node length1=length();
        if(pos>=0 &&pos<=length1-1){
            if(pos==0){
               return deletebeg();
            }
            else if(pos<=length1-1){
                 return deleteend();
            }
            else{
                Node temp=head;
                for(int i=0;i<length1-1;i++){
                    temp=temp.next;
                }
                int removedele=temp.next.data;
                temp.next=temp.next.next;
                return removedele;
            }
        }
        else{
            System.out.println("Invalid position");
            return -1;
        }
    }
}


