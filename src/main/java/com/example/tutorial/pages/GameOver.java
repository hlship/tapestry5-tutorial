package com.example.tutorial.pages;

import org.apache.tapestry5.annotations.Persist;
import org.apache.tapestry5.annotations.Property;

public class GameOver
{
  @Property
  @Persist
  private int target, guessCount;

  void setup(int target, int guessCount)
  {
    this.target = target;
    this.guessCount = guessCount;
  }
}
