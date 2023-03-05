package lambdas;

public class RunnableExample {
    public static void main(String[] args) {
        //prior java 8
       Runnable runnable = new Runnable() {
           @Override
           public void run() {
               System.out.println("Inside Runnable 1");
           }
       };
       new Thread(runnable).start();
        //java 8 lambda
        // () ->{}
        // 1.way
        Runnable runnableLambda = ()->{
            System.out.println("Inside Runnable 2");
        };
        //2.way(simpler way)
        Runnable runnableLambda1 = ()-> System.out.println("Inside Runnable 3");
        // If you are dealing with a lambda expression where you need to print single line statement,
        // you do not need to put it in a curly braces.
        new Thread(runnableLambda1).start();
        new Thread(runnableLambda).start();
        //even simpler way without declaring Runnable interface
        new Thread(()-> System.out.println("Inside Runnable 4")).start();
        //Another example
        Runnable runnableLambda2 = ()->{
            System.out.println("inside runnable 5");
            System.out.println("Inside runnable 6");
        };
        new Thread(runnableLambda2).start();
    }
}
