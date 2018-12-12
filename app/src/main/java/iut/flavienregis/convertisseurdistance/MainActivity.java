package iut.flavienregis.convertisseurdistance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // Récuperation des Edit Text
    EditText etPied = (EditText) findViewById(R.id.etPied);
    EditText etCentimetre = (EditText) findViewById(R.id.etCentimetre);
    EditText etPouces = (EditText) findViewById(R.id.etPouces);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

}
