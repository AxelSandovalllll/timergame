package edu.guilford;

/**
 * Hello world!
 *
 */
public class GameState
// use enum for a game state with initializing, running, paused, and game over
// states
{
    public enum State {
        INITIALIZING, RUNNING, PAUSED, GAME_OVER
    }
    // enum is a collection of public static final values
    // behind the scenes, each of these has an associated integer value, the ordinal
    // the first one is 0, the second is 1, etc.

    // delcare a method of type State to hold the current game state
    private State currentState;

    // declare some other variables to hold the current score and the current level
    private int currentScore;
    private int currentLevel;

    // declare a constructor that initialiazes the game state to INITIALIZING
    public GameState() {
        currentState = State.INITIALIZING;
        // state.INITIALIZING is the INITIALIZING value of the enum State
        currentScore = 0;
        currentLevel = 1;
    }

    // constructor to set all of the values to user defined values
    public GameState(State currentState, int currentScore, int currentLevel) {
        this.currentState = currentState;
        this.currentScore = currentScore;
        this.currentLevel = currentLevel;
    }

    // declare a method o get the current game state
    public State getCurrentState() {
        return currentState;
    }

    // declare a method to set the current game state
    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    // declare a method to get the current score
    public int getCurrentScore() {
        return currentScore;
    }

    // declare a method to set the current score
    public void setCurrentScore(int currentScore) {
        this.currentScore = currentScore;
    }

    // declare a method to get the current level
    public int getCurrentLevel() {
        return currentLevel;
    }

    // declare a method to set the current level

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    // provide methods to start, resume, puase, and end the game
    public void startGame() {
        currentState = State.INITIALIZING;
    }

    public void resumeGame() {
        currentState = State.RUNNING;
    }

    public void pauseGame() {
        currentState = State.PAUSED;
    }

    public void endGame() {
        currentState = State.GAME_OVER;
    }

    // write a getBanner method that uses a switch statement to generate a banner
    // based on the value of the current game state
    public String getBanner() {
        String banner = "";
        switch (currentState) {
            case INITIALIZING:
                banner = "Initializing...";
                break;
            case RUNNING:
                banner = "Running...";
                break;
            case PAUSED:
                banner = "Paused...";
                break;
            case GAME_OVER:
                banner = "Game Over...";
                break;
        }
        return banner;
    }
}
