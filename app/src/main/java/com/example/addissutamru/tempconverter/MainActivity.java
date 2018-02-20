package com.example.addissutamru.tempconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView DegreeTextView;
    private EditText FahrenheitEditText;
    private EditText celsiusEditText;
    private Button ConvertButton;
    private SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //connecting the xml to java code
    ConvertButton = (Button) findViewById(R.id.ConvertButton);
    celsiusEditText = (EditText) findViewById(R.id.celsiusEditText);
    FahrenheitEditText = (EditText) findViewById(R.id.fahrenheitEditText);
    DegreeTextView = (TextView) findViewById(R.id.DegreetextView);
    seekBar = (SeekBar) findViewById(R.id.seekBar);


        //seekBar.setOnSeekBarChangeListener((SeekBar.OnSeekBarChangeListener) this);

        //onclick listener to convert the temp to celsius
       /* ConvertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // get information
                double degree = Double.valueOf(FahrenheitEditText.getText().toString());
                //math converter
                double cells = (degree  - 32) * 5 / 9;
                //set celsius after degree has been input by user
                celsiusEditText.setText(String.valueOf(cells));



            }


        });*/seekBar.setMax(200);
        //seekBar.setProgress(100, true);
       seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
           @Override
           public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
            i = i - 100;
            celsiusEditText.setText("" + i );
            int fah = (i * 5/9) + 32;
            FahrenheitEditText.setText("" + fah);


           }

           @Override
           public void onStartTrackingTouch(SeekBar seekBar) {

           }

           @Override
           public void onStopTrackingTouch(SeekBar seekBar) {
               //int progress = seekBar.getProgress();

           }
       });

    }


}
