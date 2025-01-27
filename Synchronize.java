class Queue{
    boolean valSet=false;
    int n;

    synchronized void put(int n){
        while(valSet){
            try{
                wait();
            }catch(Exception e){
                System.out.println(e);
            }
        }
        this.n=n;
        valSet=true;
        notify();
    }
    synchronized void get(){
        while (!valSet) {
            try {
                wait();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
        System.out.println(this.n);
        valSet=false;
        notify();
    }
}
class Producer extends Thread{
    Queue q;
    Producer(Queue q){
        this.q=q;
    }
    public void run(){
        int i=0;
        while(i<10){
            q.put(i++);
        }
    }
}

class Consumer extends Thread{
    Queue q;
    Consumer(Queue q){
        this.q=q;
    }
    public void run(){
        while(true){
            q.get();
        }
    }
    
}
public class Synchronize {
    public static void main(String[] args) {
        Queue q=new Queue();

        Producer p=new Producer(q);
        Consumer c=new Consumer(q);

        p.start();
        c.start();
    }
}
