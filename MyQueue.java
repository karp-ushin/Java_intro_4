import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MyQueue {
    Queue<String> myQueue = new LinkedList<>();
    public void enqueue(String element){
        myQueue.add(element);
    }
    public String dequeue(){
        return myQueue.poll();
    }
    public String first(){
        return myQueue.peek();
    }
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        Scanner sc= new Scanner(System.in);
        String command; String elementToAdd;
        do{
            System.out.println("1: enqueue      2: dequeue      3: first      4: quit");
            command = sc.nextLine();
            switch (command){
                case "1":
                    System.out.println("Enter an element: ");
                    elementToAdd = sc.nextLine();
                    q.enqueue(elementToAdd);
                    break;
                case "2":
                System.out.println("First element: " + q.dequeue());
                    break;
                case "3":
                    System.out.println("First element: " + q.first());
                    break;
            }
            System.out.println("Queue: " + q.myQueue);
        }while (!command.equals("4"));
        sc.close();
    }
}
    
