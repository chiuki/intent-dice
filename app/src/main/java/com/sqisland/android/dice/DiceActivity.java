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

    int numDice = 2;

    rollAll(resultView, numDice);
  }

  private void rollAll(TextView textView, int numDice) {
    StringBuilder builder = new StringBuilder();
    int total = 0;
    for (int i = 0; i < numDice; ++i) {
      int result = rollOne();
      total += result;

      if (i > 0) {
        builder.append(" + ");
      }

      builder.append(result);

      if (numDice > 1 && i == numDice - 1) {
        builder.append(" = ");
        builder.append(total);
      }
    }

    textView.setText(builder.toString());
  }

  private int rollOne() {
    return random.nextInt(6) + 1;
  }
}