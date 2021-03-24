package must.ac.ug.csce.MugishaFaisal.thollererxmlcolorswap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView tView;
    Button bShow;
    float red, green, blue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tView = (TextView) findViewById(R.id.tView);
        bShow = (Button) findViewById(R.id.bShow);

        final Random rand = new Random();
        bShow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                red = rand.nextFloat();
                green = rand.nextFloat();
                blue = rand.nextFloat();
                tView.setText("R" + String.valueOf(red) + "    \nG" + String.valueOf(green) + "  \nB" + String.valueOf(blue));
                tView.setTextColor(Color.rgb(red, green, blue));
            }
        });
    }
}
