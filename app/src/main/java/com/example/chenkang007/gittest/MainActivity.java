package com.example.chenkang007.gittest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

  Button button;
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    button = findViewById(R.id.bt);
    button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {

      }
    });
  }
}
