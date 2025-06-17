
public class Queuearray
{
	public static void main(String[] args) {
	    Queue q=new Queue(5);
	    q.enqueue(10);
	    q.enqueue(20);
	    q.enqueue(30);
	    q.enqueue(40);
	    q.dequeue();
	    q.print();
	
	}
}
class Queue{
    int[] queue;
    int rear;
    int front;
    int size;
    Queue(int size){
      
        this.front=0;
        this.size=0;
        this.queue=new int[size];
    }
    boolean isfull(){
        if(rear==size-1){
            return true;
        }
        else{
            return false;
        }
    }
    boolean isempty(){
        if(rear==-1){
            return true;
        }
        else{
            return false;
        }
    }
    void enqueue(int val){
        if(isfull()){
            return ;
        }
        rear=rear+1;
        queue[rear]=val;
    }
    int dequeue(){
        if(isempty()){
            return -1;
        }
        int removedele=queue[front];
        for(int i=1;i<=rear;i++){
            queue[i-1]=queue[i];
        }
        return removedele;
    }
    void print(){
        for(int i=1;i<=rear;i++)
        System.out.println(queue[i]);
    }
    
}
