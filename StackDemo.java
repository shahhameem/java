class Stack {
    private int[] elements;
    private int top;
    Stack(int size){
        elements = new int[size];
        top = -1;
    }
    public void push(int num){
        if(top == elements.length - 1)
            System.out.println("Stack Overflow");
        else 
            elements[++top] = num;
    }
    public void pop(){
        if(top < 0)
            System.out.println("Stack Underflow");
        else 
            top--;
    }
    public void peek(){
        if(top < 0)
            System.out.println("Stack Underflow");
        else
            System.out.println(elements[top]);
    }
}

public class StackDemo{
    public static void main(String[] args) {
        Stack s = new Stack(10);
        s.push(10);
        s.push(20);
        s.peek();
        s.pop();
        s.peek();
        s.pop();
        s.peek();
        s.pop();
    }
}
