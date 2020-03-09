package au.edu.jcu.sp3406.quicksum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonClicked(View view){
        Button button = (Button) view;
        TextView textView = findViewById(R.id.sum);
            int number = Integer.parseInt(button.getText().toString());
            sum += number;
            String result = "" + sum;
            textView.setText(result);
        }
    public void clearButton(View view){
        TextView textView = findViewById(R.id.sum);
        textView.setText("");
        sum = 0;
    }
}
