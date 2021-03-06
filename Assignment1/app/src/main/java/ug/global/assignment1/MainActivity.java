package ug.global.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
TextView txtView1;
TextView txtView2;
TextView txtView3;
TextView txtView4;
TextView txtView5;
TextView txtView6;
TextView txtView7;
Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtView1 = (TextView)findViewById(R.id.textView);
        txtView2 = (TextView)findViewById(R.id.textView2);
        txtView3 = (TextView)findViewById(R.id.textView3);
        txtView4 = (TextView)findViewById(R.id.textView4);
        txtView5 = (TextView)findViewById(R.id.textView5);
        txtView6 = (TextView)findViewById(R.id.textView6);
        txtView7 = (TextView)findViewById(R.id.textView7);
        button1 = (Button)findViewById(R.id.button);
        button1.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button){
            txtView7.setText("Below Is A List Of Courses");
        }
    }
}