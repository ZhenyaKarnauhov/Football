package com.example.kev.football;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Integer RealMadrid = 0;
    private Integer Barselona = 0;
    private String TAG;
    //*
    // Методы относящиеся к команде Real Madrid

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*
    // Кнопка добавления очков к команде Real Madrid
    */
    public void onClickBtnMadrid(View view) {
        RealMadrid++;
        TextView RealMadrid = (TextView)findViewById(R.id.ScoreMadrid);
        RealMadrid.setText(this.RealMadrid.toString());

    }

    /*
    // Кнопка добавления очков к команде Barselona
    */
    public void onClickBtnBarselona(View view) {
        Barselona++;
        TextView Barselona = (TextView)findViewById(R.id.ScoreBarselona);
        Barselona.setText(this.Barselona.toString());

    }

    //*
    // Сохранение счёта RealMadrid при перевороте телефона
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("RealMadrid", RealMadrid);
        outState.putInt("Barselona", Barselona);

        Log.d(TAG, "onSaveInstanceState" );
    }
    protected void onRestoreInstanceState( Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if (savedInstanceState != null && savedInstanceState.containsKey("RealMadrid")) {
            RealMadrid = savedInstanceState.getInt("RealMadrid");
        }
        if (savedInstanceState != null && savedInstanceState.containsKey("Barselona")) {
            RealMadrid = savedInstanceState.getInt("Barselona");
        }
        Log.d(TAG, "onRestoreInstanceState");
    }




    //*
    // Обнуление счёта

    public void ZeroButton(View view) {
        RealMadrid = 0;
        Barselona = 0;
        TextView MadridView = (TextView)findViewById(R.id.ScoreMadrid);
        TextView BarselonaView = (TextView)findViewById(R.id.ScoreBarselona);
        MadridView.setText(RealMadrid.toString());
        BarselonaView.setText(Barselona.toString());

    }
}

