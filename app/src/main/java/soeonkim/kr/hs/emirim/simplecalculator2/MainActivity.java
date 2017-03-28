package soeonkim.kr.hs.emirim.simplecalculator2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity /*implements View.OnClickListener*/ {
    EditText edit_first, edit_second;
    TextView text_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText edit_first = (EditText) findViewById(R.id.edit_first);
        final EditText edit_second = (EditText) findViewById(R.id.edit_second);
        Button but_plus = (Button) findViewById(R.id.but_plus);
        Button but_minus = (Button) findViewById(R.id.but_minus);
        Button but_multiply = (Button) findViewById(R.id.but_multiply);
        Button but_division = (Button) findViewById(R.id.but_division);
        text_result = (TextView) findViewById(R.id.text_result);

        /*but_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first_num = Integer.parseInt(edit_first.getText().toString());
                int second_num  = Integer.parseInt(edit_second.getText().toString());
                text_result.setText((first_num + second_num) + "");
            }
        });

        but_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first_num = Integer.parseInt(edit_first.getText().toString());
                int second_num  = Integer.parseInt(edit_second.getText().toString());
                text_result.setText((first_num - second_num) + "");
            }
        });

        but_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first_num = Integer.parseInt(edit_first.getText().toString());
                int second_num  = Integer.parseInt(edit_second.getText().toString());
                text_result.setText((first_num * second_num) + "");
            }
        });
        but_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first_num = Integer.parseInt(edit_first.getText().toString());
                int second_num  = Integer.parseInt(edit_second.getText().toString());
                text_result.setText((first_num / second_num) + "");
            }
        });*/
        but_plus.setOnClickListener(butHandler);
        but_minus.setOnClickListener(butHandler);
        but_multiply.setOnClickListener(butHandler);
        but_division.setOnClickListener(butHandler);

    }//end oncreat

    View.OnClickListener butHandler = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int first_num = Integer.parseInt(edit_first.getText().toString());
            int second_num  = Integer.parseInt(edit_second.getText().toString());
            int result = 0;


            switch (v.getId()){
                case R.id.but_plus:
                    result = first_num + second_num;
                    break;
                case R.id.but_minus:
                    result = first_num - second_num;
                    break;
                case R.id.but_multiply:
                    result = first_num * second_num;
                    break;
                case R.id.but_division:
                    result = first_num / second_num;
                    break;

            }
            text_result.setText(result + "");
        }
    }

    /*@Override
    public void onClick(View v) {
        int first_num = Integer.parseInt(edit_first.getText().toString());
        int second_num  = Integer.parseInt(edit_second.getText().toString());
        int result = 0;


        switch (v.getId()){
            case R.id.but_plus:
                result = first_num + second_num;
                break;
            case R.id.but_minus:
                result = first_num - second_num;
                break;
            case R.id.but_multiply:
                result = first_num * second_num;
                break;
            case R.id.but_division:
                result = first_num / second_num;
                break;

        }
        text_result.setText(result + "");
    }
}*/
}

