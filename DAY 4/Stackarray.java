
public class Stackarray{
    public static void main(String[] args){
        Stack s=new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.print();
    }
}
class Stack{
    int[] stack;
    int size;
    int top;
    Stack(int size){
        this.size=size;
        this.stack=new int[size];
       
    }
    boolean isfull(){
        if(top==size-1){
            System.out.println("full");
            return true;
        }
        else{
            return false;
        }
    }
    boolean isempty(){
        if(top==-1){
            System.out.println("empty");
            return true;
        }
        else{
            return false;
        }
    }
    void push(int val){
        if(isfull()){
            return;
        }
        else{
            top=top+1;
            stack[top]=val;
        }
    }
    int pop(){
        if(isempty()){
            System.out.println("empty");
        }
        int removes=stack[top];
        top=top-1;
        return removes;
    }
    int peak(){
        if(isempty())  return -1;
        return stack[top];
    }
    void print(){
        for(int i=0;i<=top-1;i++){
            System.out.println("|"+stack[i]+"|");
        }
    }
}