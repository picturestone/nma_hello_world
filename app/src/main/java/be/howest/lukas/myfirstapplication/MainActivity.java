package be.howest.lukas.myfirstapplication;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textViewHeading = findViewById(R.id.textViewHeading);
        String textViewHeadingText = "What's your name?";
        textViewHeading.setText(textViewHeadingText);

        EditText editTextName = findViewById(R.id.editTextName);
        String editTextNameText = "";
        editTextName.setText(editTextNameText);
        String editTextNameHint = "Your name";
        editTextName.setHint(editTextNameHint);

        Button buttonGreetMe = findViewById(R.id.buttonGreetMe);
        String buttonGreetMeText = "Greet me!";
        buttonGreetMe.setText(buttonGreetMeText);

        TextView textViewGreeting = findViewById(R.id.textViewGreeting);
        String textViewGreetingText = "";
        textViewGreeting.setText(textViewGreetingText);
    }

    public void onButtonGreetMeClick(View view) {
        TextView textViewGreeting = findViewById(R.id.textViewGreeting);
        EditText editTextName = findViewById(R.id.editTextName);
        String editTextNameText = editTextName.getText().toString();

        if(editTextNameText.equals("")) {
            String greetingAlternative = "Please tell me your name!";
            textViewGreeting.setText(greetingAlternative);
        } else {
            String greeting = "Hello " + editTextNameText + "!";
            textViewGreeting.setText(greeting);
        }
    }
}
