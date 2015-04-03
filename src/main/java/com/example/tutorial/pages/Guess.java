package com.example.tutorial.pages;

import org.apache.tapestry5.PersistenceConstants;
import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;

public class Guess {

    @Property
    @Persist
    private int target, guessCount;

    @Property
    private int current;

    void setup(int target)
    {
        this.target = target;
        guessCount = 1;
    }

    @Property
    @Persist(PersistenceConstants.FLASH)
    private String message;

    @InjectPage
    private GameOver gameOver;

    Object onActionFromMakeGuess(int value)
    {
        if (value == target)
        {
            gameOver.setup(target, guessCount);
            return gameOver;
        }

        guessCount++;

        message = String.format("Your guess of %d is too %s.", value,
                value < target ? "low" : "high");

        return null;
    }
}
