import com.sun.xml.internal.fastinfoset.util.PrefixArray;

public class Queue<T> implements QueueFunction<T>{
    private int size;
    private T[] queue;
    private int front;
    private int rare;

    public Queue(int size){
        this.size = size;
        queue = (T[]) new Object[size];
        front = 0;
        rare = 0;
    }

    @Override
    public void enqueue(T item) {
        if(!overFlow()){
            queue[rare] = item;
            rare++;
        }
    }

    @Override
    public void dequeue() {
        if(!underFlow()){
            System.out.println("Dequeue: "+queue[front]);
            for(int i=1;i<=(rare-1);i++){
                queue[i-1] = queue[i];
            }
            rare--;
        }
    }

    @Override
    public boolean overFlow() {
        if((rare+1)>size){
            System.out.println("Queue Overflow");
            return true;
        }
        return false;
    }

    @Override
    public boolean underFlow() {
        if((rare-1)<0){
            System.out.println("Queue Underflow");
            return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        if(front==rare){
            System.out.println("Queue Empty");
            return true;
        }
        return false;
    }

    @Override
    public void showQueue() {
        if(isEmpty()) return;
        for (int i =front; i< rare; i++) {
            System.out.print(queue[i]);
        }
        System.out.println();
    }
}