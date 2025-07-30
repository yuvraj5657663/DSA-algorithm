class process1 extends Thread {
    public void run() {
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println("process1 " + i);
        }

    }
}

class process2 extends Thread {
    public void run() {
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println("process2 " + i);
        }

    }
}

class MultiT2 {
    public static void main(String[] args) {
        process1 p1 = new process1();
        process2 p2 = new process2();
        p1.start();
        p2.start();
       

    }

}