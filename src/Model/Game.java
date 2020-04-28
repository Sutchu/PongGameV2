package Model;

import Model.Object.Ball;
import Model.Object.Paddle;
import Model.Phsics.Collision;
import java.util.ArrayList;

public class Game {

    private Ball ball;
    private ArrayList<Paddle> paddles;
    private Collision collision;

    public Game() {
        ball = new Ball(290, 290);
        paddles = new ArrayList();

        paddles.add(new Paddle(255,595 ));  //bottom paddle
        paddles.add(new Paddle(255, 0));    //top paddle

        collision = new Collision();
    }

    public void updateGame() {
        ball.update();
        collision.checkCollision(ball, paddles);
    }

    public void rightButtonPressed() {
        paddles.get(0).setX(paddles.get(0).getX() + 5);
        if((paddles.get(0).getX() + paddles.get(0).getWidth()) > 600)
            paddles.get(0).setX(600 - paddles.get(0).getWidth());
    }
    public void leftButtonPressed() {
        paddles.get(0).setX(paddles.get(0).getX() - 5);
        if(paddles.get(0).getX() < 0)
            paddles.get(0).setX(0);
    }

    public Ball getBall() { return ball; }
    public ArrayList<Paddle> getPaddles() { return paddles; }



}
