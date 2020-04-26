package controller;


public class Controller {
    private static Controller instance;

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }

    private Controller(){
        Game game = new Game();
    }

    public Ball getBall() {
        return game.getBall();
    }

    public ArrayList<Paddle> getPaddles() {
        return game.getPaddles();
    }

    public void updateGame() {
        game.updateGame();
    }

    public void rightButtonPressed() {
        game.rightButtonPressed();
    }

    public void leftButtonPressed() {
        game.leftButtonPressed();
    }
}
