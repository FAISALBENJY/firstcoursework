package must.ac.ug.csce.MugishaFaisal.thollererprogcolorswap;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Build;
import android.os.Bundle;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Button;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);

        LinearLayout linear = new LinearLayout(this);
        final Random rand = new Random();
        final TextView textView = new TextView( this);
        textView.setText("Tap to change the color");
//        textView.setText("30");

        //Creating the Button Dynamically
        Button bShow = new Button( this);
        bShow.setText("Tap me!");

       textView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        bShow.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));

        LinearLayout.LayoutParams txtlayoutparams =new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        txtlayoutparams.setMarginStart(300);
        setContentView(linear);
        LinearLayout.LayoutParams btnlayoutparams =new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        btnlayoutparams.setMarginStart(400);
        linear.setOrientation(LinearLayout.VERTICAL);
        bShow.setOnClickListener(new View.OnClickListener(){
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View V) {
                float red = rand.nextFloat();
                float green = rand.nextFloat();
                float blue = rand.nextFloat();
                textView.setText("r"+String.valueOf(red)+"      g"+String.valueOf(green)+"      b"+String.valueOf(blue));
                textView.setTextColor(Color.rgb(red,green,blue));
            }
        });
        linear.addView(textView,txtlayoutparams);
        // Add Button to LinearLayout
        if (linear != null){
            linear.addView(bShow,btnlayoutparams);
        }

    }
}
