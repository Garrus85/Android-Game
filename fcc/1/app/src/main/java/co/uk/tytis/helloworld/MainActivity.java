package co.uk.tytis.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void onBtnClick(View view) {
        TextView txtView = findViewById(R.id.textView);
        EditText firstNameTxt= findViewById(R.id.firstTxt);
        EditText lastNameTxt = findViewById(R.id.lastTxt);
        EditText editText = findViewById(R.id.emailTxt);

        txtView.setText("Firstname: " +  firstNameTxt.getText().toString() + "\n" +
                "Lastname: " + lastNameTxt.getText().toString() + "\n" +
                "Email: " + editText.getText().toString());
    }
}