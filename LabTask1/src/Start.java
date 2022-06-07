import java.net.Inet4Address;
import java.util.Scanner;

public class Start{
    public static void menu(){
        System.out.println("Menu");
        System.out.println("1. Stack");
        System.out.println("2. Queue");
        System.out.println("3. Exit");
    }
    public static void stackMenu() {
        System.out.println("Stack Menu");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Show Stack");
        System.out.println("4. Go Back");
    }
    public static void queueMenu(){
        System.out.println("Queue Menu");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Show Queue");
        System.out.println("4. Go Back");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int option=0;
        int subOption;

        while(option != 3) {
            menu();
            System.out.print("Enter your option: ");
            option = input.nextInt();

            if(option == 1){
                System.out.println("Enter the size of the stack: ");
                size = input.nextInt();
                Stack<Integer> s1 = new Stack<Integer>(size);
                while(true){
                    stackMenu();
                    System.out.print("Enter your option: ");
                    subOption = input.nextInt();


                    if(subOption == 1){
                        for(int i = 0; i< size; i++){
                            System.out.print("Push element "+(i+1)+": ");
                            s1.push(input.nextInt());
                        }
                    } else if(subOption == 2){
                        System.out.println("Element "+s1.pop()+" is popped");
                    }
                    else if(subOption == 3){
                        s1.showStack();
                    }
                    else if(subOption==4){
                        break;
                    }
                }
            }
            else if(option==2) {
                System.out.println("Enter the size of the Queue: ");
                size = input.nextInt();
                Queue<Integer> q1 = new Queue<Integer>(size);
                while(true){
                    queueMenu();
                    System.out.print("Enter your option: ");
                    subOption = input.nextInt();


                    if(subOption == 1){
                        for(int i = 0; i< size; i++){
                            System.out.print("Enqueue element "+(i+1)+": ");
                            q1.enqueue(input.nextInt());
                        }
                    } else if(subOption == 2){
                        q1.dequeue();
                    }
                    else if(subOption == 3){
                        q1.showQueue();
                    }
                    else if(subOption==4){
                        break;
                    }
                }
            }
            else if(option==3){
                break;
            }


        }
    }
}
