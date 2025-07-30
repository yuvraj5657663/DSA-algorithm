package MultiThread; 


class Sender extends Thread {
    public void run() {
        String[] messages = { "Hi", "How are you?", "Are you learning Java?", "Bye" };
        for (String msg : messages) {
            System.out.println("You sent: " + msg);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }
}

class Receiver extends Thread {
    public void run() {
        String[] replies = { "Hello", "Yes, I am good!", "Yes, multithreading today", "Goodbye" };
        for (String reply : replies) {
            try {
                Thread.sleep(1500);
            } catch (Exception e) {
            }
            System.out.println("Friend replied: " + reply);
        }
    }
}

public class ChatApp {
    public static void main(String[] args) {
        Sender send = new Sender();
        Receiver receive = new Receiver();

        send.start();
        receive.start();
    }
}
