package session1.threedos.com.session1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText firstNum;
    private EditText secondNum;
    private Button plus;
    private Button minus;
    private Button multiply;
    private Button divide;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstNum = (EditText) findViewById(R.id.first_num);
        secondNum = (EditText) findViewById(R.id.second_num);
        plus = (Button) findViewById(R.id.plus);
        minus = (Button) findViewById(R.id.minus);
        multiply = (Button) findViewById(R.id.multiply);
        divide = (Button) findViewById(R.id.divide);
        result = (TextView) findViewById(R.id.result);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first = firstNum.getText().toString();
                String second = secondNum.getText().toString();
                double firstNum = Double.parseDouble(first);
                double secondNum = Double.parseDouble(second);
                double results = firstNum + secondNum;
                result.setText("" + results);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first = firstNum.getText().toString();
                String second = secondNum.getText().toString();
                double firstNum = Double.parseDouble(first);
                double secondNum = Double.parseDouble(second);
                double results = firstNum - secondNum;
                result.setText("" + results);
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first = firstNum.getText().toString();
                String second = secondNum.getText().toString();
                double firstNum = Double.parseDouble(first);
                double secondNum = Double.parseDouble(second);
                double results = firstNum * secondNum;
                result.setText("" + results);
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first = firstNum.getText().toString();
                String second = secondNum.getText().toString();
                double firstNum = Double.parseDouble(first);
                double secondNum = Double.parseDouble(second);
                double results = firstNum / secondNum;
                result.setText("" + results);
            }
        });
    }
}
