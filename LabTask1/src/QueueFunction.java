public interface QueueFunction<T> {
    void enqueue(T item);
    void dequeue();
    boolean overFlow();
    boolean underFlow();
    boolean isEmpty();
    void showQueue();
}