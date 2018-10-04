package com.example.raccoon.rgb_seekbars;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import static android.graphics.Color.*;


public class RGB extends AppCompatActivity {

    int r=0, g=0, b=0;
    private TextView Text_r;
    private TextView Text_g;
    private TextView Text_b;
    private SeekBar Sb_r;
    private SeekBar Sb_g;
    private SeekBar Sb_b;
    private TextView Text_kep;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rgb);

        init();




        Sb_r.setOnSeekBarChangeListener(new OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar Sb_r, int i, boolean bo) {
                r = i;
                Text_r.setText("Red: "+r);
                Text_kep.setText("("+r + ","+ g +"," +b+")");
                Text_kep.setBackgroundColor(rgb(r, g, b));
            }
            @Override
            public void onStartTrackingTouch(SeekBar Sb_r) {}
            @Override
            public void onStopTrackingTouch(SeekBar Sb_r) {}
        });
        Sb_b.setOnSeekBarChangeListener(new OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar Sb_b, int i, boolean bo) {
                b = i;
                Text_b.setText("Blue: "+b);
                Text_kep.setText("("+r + ","+ g +"," +b+")");
                Text_kep.setBackgroundColor(rgb(r, g, b));
            }
            @Override
            public void onStartTrackingTouch(SeekBar Sb_b) {}
            @Override
            public void onStopTrackingTouch(SeekBar Sb_b) {}
        });
        Sb_g.setOnSeekBarChangeListener(new OnSeekBarChangeListener(){
            @Override
            public void onProgressChanged(SeekBar Sb_g, int i, boolean bo) {
                g = i;
                Text_g.setText("Green: "+g);
                Text_kep.setText("("+r + ","+ g +"," +b+")");
                Text_kep.setBackgroundColor(rgb(r, g, b));
            }
            @Override
            public void onStartTrackingTouch(SeekBar Sb_r) {}
            @Override
            public void onStopTrackingTouch(SeekBar Sb_r) {}
        });





}




    private void init() {
        Text_r= findViewById(R.id.Text_r);
        Text_g= findViewById(R.id.Text_g);
        Text_b= findViewById(R.id.Text_b);
        Sb_r= findViewById(R.id.Sb_r);
        Sb_g= findViewById(R.id.Sb_g);
        Sb_b= findViewById(R.id.Sb_b);
        Text_kep= findViewById(R.id.Text_kep);

    }


}
