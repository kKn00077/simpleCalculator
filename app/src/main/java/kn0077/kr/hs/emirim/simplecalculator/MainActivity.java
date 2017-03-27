package kn0077.kr.hs.emirim.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit1;
    EditText edit2;
    TextView teview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit1=(EditText)findViewById(R.id.edit_first);
        edit2=(EditText)findViewById(R.id.edit_second);
        Button but1=(Button)findViewById(R.id.but_plus);
        Button but2=(Button)findViewById(R.id.but_minus);
        Button but3=(Button)findViewById(R.id.but_multiply);
        Button but4=(Button)findViewById(R.id.but_division);
        teview=(TextView)findViewById(R.id.text_result);


        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first=Integer.parseInt(edit1.getText().toString());
                int second=Integer.parseInt(edit2.getText().toString());
                //teview.setText(first-second);//원래 문자열 값만 넣을 수 있는데 문자열이 아니라서 오류남
                teview.setText(String.valueOf(first+second));
                //이거 말고 teview.setText(first+second+""); 도 가능하다

            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first=Integer.parseInt(edit1.getText().toString());
                int second=Integer.parseInt(edit2.getText().toString());
                //teview.setText(first-second);
                teview.setText(String.valueOf(first-second));

            }
        });

        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first=Integer.parseInt(edit1.getText().toString());
                int second=Integer.parseInt(edit2.getText().toString());
                teview.setText(first*second);
                teview.setText(String.valueOf(first*second));

            }
        });

        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first=Integer.parseInt(edit1.getText().toString());
                int second=Integer.parseInt(edit2.getText().toString());
                teview.setText(first/second);
                teview.setText(String.valueOf(first/(double)second));

            }
        });
    }
}
