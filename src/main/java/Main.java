public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup mainGroup = new ThreadGroup("main group");
        Thread myThread1 = new Thread(mainGroup, new MyThread());
        Thread myThread2 = new Thread(mainGroup, new MyThread());
        Thread myThread3 = new Thread(mainGroup, new MyThread());
        Thread myThread4 = new Thread(mainGroup, new MyThread());

        myThread1.setName("поток 1");
        myThread2.setName("поток 2");
        myThread3.setName("поток 3");
        myThread4.setName("поток 4");

        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();

        Thread.sleep(10000);

        mainGroup.interrupt();
    }
}
