package com.example.tutorial.pages;

import java.util.Random;

import org.apache.tapestry5.annotations.InjectPage;
import org.apache.tapestry5.annotations.Log;

public class Index
{
  private final Random random = new Random(System.nanoTime());

  @InjectPage
  private Guess guess;

  @Log
  Object onActionFromStart()
  {
    int target = random.nextInt(10) + 1;

    guess.setup(target);

    return guess;
  }
}
