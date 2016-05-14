package com.sqisland.android.dice;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class DiceActivity extends Activity {
  private Random random = new Random();

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_dice);

    TextView resultView = (TextView) findViewById(R.id.result);

    int result = rollOne();
    String text = String.valueOf(result);
    resultView.setText(text);
  }

  private int rollOne() {
    return random.nextInt(6) + 1;
  }
}