import javax.swing.*;


class LoginS extends JFrame{

    LoginS(String s1){
        super(s1);
    }

    LoginS() {

    }

    void setComponents() {
        JLabel l1 = new JLabel("welcome");
        JTextField t1 = new JTextField();
        setLayout(null);
        l1.setBounds(200, 100, 100, 30);
        t1.setBounds(200, 200, 100, 30);
        add(t1);
        add(t1);
    }

    
        public static void main(String[] args) {
            LoginS s1 = new LoginS("welcome to java lover ....");
            s1.setVisible(true);
            s1.setSize(700, 700);
            s1.setComponents();
            JFrame j1 = new JFrame();
            j1.setVisible(true);
            j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
