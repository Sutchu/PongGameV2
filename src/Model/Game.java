package Model;

import Model.Object.Ball;
import Model.Object.Paddle;

import java.util.ArrayList;

public class Game {

    private Ball ball;
    private ArrayList<Paddle> paddles;

    public Game() {
        ball = new Ball(290, 290);
        paddles = new ArrayList();

        // creating paddles
        paddles.add(new Paddle(285,595 ));  //bottom paddle
        paddles.add(new Paddle(285, 0));    //top paddle
    }

    public void updateGame() {}
    public void rightButtonPressed() {}
    public void leftButtonPressed() {}

    public Ball getBall() { return ball; }
    public ArrayList<Paddle> getPaddles() { return paddles; }



}
