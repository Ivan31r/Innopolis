package testPack;

public class StacksTest {
    public static void main(String[] args) {

    }

}
class StackX {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackX(int maxSize){
        this.maxSize=maxSize;
        stackArray=new char[maxSize];
        top=-1;
    }
    public void push(char j){
        stackArray[top+1]=j;
        top++;
    }
    public char pop(){
        return stackArray[top--];
    }

    public char peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top==1);
    }
}

