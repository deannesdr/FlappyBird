import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;


public class FlappyBird extends JPanel implements ActionListener{
    int boardwidth = 360;
    int boardheight = 640;


    //Images
    Image background;
    Image birdImg;
    Image topPipeImg;
    Image botPipeImg;

    //Bird
    int birdX = boardwidth/8;
    int birdY = boardheight/2;
    int birdWidth = 34;
    int birdHeight = 24;
    
    class Bird{
        int x = birdX;
        int y= birdY;
        int width = birdWidth;
        int height = birdHeight;
        Image img;
        Bird(Image img){
            this.img = birdImg;
        }
    
    }

    //game logic
    Bird bird;
    Timer gameloop;
    
    FlappyBird(){
        setPreferredSize(new Dimension(boardwidth, boardheight));
        //setBackground(Color.blue);

        //load images
        background = new ImageIcon(getClass().getResource("./flappybirdbg.png")).getImage();
        birdImg = new ImageIcon(getClass().getResource("./flappybird.png")).getImage();
        topPipeImg = new ImageIcon(getClass().getResource("./toppipe.png")).getImage();
        botPipeImg = new ImageIcon(getClass().getResource("./bottompipe.png")).getImage();
        

        bird = new Bird(birdImg);

        //bird 
        gameloop = new Timer(1000/60, this);
        gameloop.start();
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g){
        //background
        g.drawImage(background, 0, 0, boardwidth,boardheight, null);    
    
        g.drawImage(birdImg, bird.x, bird.y, bird.width, bird.height, null);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    
    }


}
