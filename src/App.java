import javax.swing. *;  // Importing all classes from javax.swing package

public class App {
    public static void main(String[] args) throws Exception {
        
        //initializing the board dimentions.
        int boardwidth = 360;
        int boardheight = 640;

        JFrame frame = new JFrame("Flappy Bird"); // Creating a new JFrame object
        //frame.setVisible(true); // Setting the frame to be visible
        frame.setSize(boardwidth, boardheight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Setting the default close operation of the frame
    
        FlappyBird flappyBird = new FlappyBird(); // Creating a new FlappyBird object
        frame.add(flappyBird); // Adding the FlappyBird object to the frame
        frame.pack(); // Sizes the frame so that all its contents are at or above their preferred sizes
        frame.setVisible(true);
    
    
    }
}
