package com.f19.session1a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.welcome_note);
        editText = findViewById(R.id.name_field);

        textView.setText(editText.getHint());
    }

    public void sayHello(View view) {
        textView.setText("Happy birthday " + editText.getText());
    }
}
