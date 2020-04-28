package Model.Phsics;

import Model.Object.Ball;
import Model.Object.Paddle;

import java.util.ArrayList;

public class Collision {

    public Collision(){

    }
    /*
     * Only callable command of this class.
     * Calling this method enough to check all collisions.
     * If there is any collision, class will handle it and will collide the objects
     * which are colliding.
     */
    public void checkCollision(Ball ball, ArrayList<Paddle> paddles) {
        checkBallWallCollision(ball);
        checkBallPaddleCollision(ball, paddles);
    }

    /*
     * The method checks collisions between balls and paddles.
     * If there is any collision, method sends the colliding objects to collide method.
     */
    private void checkBallPaddleCollision(Ball ball, ArrayList<Paddle> paddles) {
        for(Paddle paddle : paddles) {
            if ( (Math.abs( (ball.getY() + ball.getRadius()) - (paddle.getY()+paddle.getHeight()/2) ))
                    < ball.getRadius() + paddle.getHeight()/2 &&
                (Math.abs( (ball.getX() + ball.getRadius()) - (paddle.getX() + paddle.getWidth()/2) ))
                    < paddle.getWidth()/2 + ball.getRadius() ) {

                ball.getVelocity().setY(ball.getVelocity().getY()*(-1));  // Silinecek

            }
        }
    }

    /*
     * The method checks collision between ball and walls.
     * It will automatically figure out collision.
     *
     * Ball's x velocity will be multiplied by (-1)
     */
    private void checkBallWallCollision(Ball ball){
        if(ball.getX() < 0 || (ball.getX() + ball.getRadius()*2) > 600){
            ball.getVelocity().setX(ball.getVelocity().getX()*(-1));
        }

    }


}
