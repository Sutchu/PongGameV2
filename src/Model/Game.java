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
        paddles.get(0).update();
        paddles.get(1).update();
        collision.checkCollision(ball, paddles);
    }

    public void rightButtonPressedPlayer0() {
        paddles.get(0).moveRight();
    }
    public void leftButtonPressedPlayer0() {
        paddles.get(0).moveLeft();
    }
    public void stopPaddlePlayer0() {paddles.get(0).stopPaddle();}

    public void rightButtonPressedPlayer1() {
        paddles.get(1).moveRight();
    }
    public void leftButtonPressedPlayer1() {
        paddles.get(1).moveLeft();
    }
    public void stopPaddlePlayer1() { paddles.get(1).stopPaddle(); }

    public Ball getBall() { return ball; }
    public ArrayList<Paddle> getPaddles() { return paddles; }



}
