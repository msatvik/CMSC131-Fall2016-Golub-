package bbtCode;

public class Launcher {

    public static void main(String args[]) {
    	java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hallway().setVisible(true);
            }
        });
    }

}
