package no.ntnu.fredrik.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
    }

    public void goToSettings(View view) {
        // Makes intent and sends to the next view
        Intent intent = new Intent(this, UserPreferance.class);
        startActivity(intent);


    }
}
