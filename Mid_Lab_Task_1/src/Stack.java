import java.lang.reflect.Array;

public class Stack <T>{

    private int size;
    private int index;
    private T[] stackArray;

    public Stack(int size){
        this.size = size;
        stackArray = (T[])new Object[size];
        index = 0;
    }
    public void push(T element){
        stackArray[index++] = element;
    }
    public T pop(){
        T element = (T) stackArray[--index];
        return element;
    }
    public void showStack(){
        for(int i =0; i<index; i++){
            System.out.println("Element "+ (i+1)+ " is "+stackArray[i]);
        }
    }
}

