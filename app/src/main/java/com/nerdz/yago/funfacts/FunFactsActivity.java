package com.nerdz.yago.funfacts;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class FunFactsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
        //Declare our view variables
        final TextView factLabel = (TextView) findViewById(R.id.fact);
        Button nextButton = (Button) findViewById(R.id.botao);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //The button was clicked, so we updatede the factView with a new fact
                String newFact="Caio é um cara enrolado que ainda não começou a aprender programação pra android.";
                //Randomly select a fact
                Random randomGenerator = new Random(); //Construct a new random number generator
                int randomNumber = randomGenerator.nextInt(3)+1;


                //Update the label with our dynamic fact
                factLabel.setText(newFact);
            }
        };

        nextButton.setOnClickListener(listener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fun_facts, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
