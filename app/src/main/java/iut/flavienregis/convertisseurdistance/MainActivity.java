package iut.flavienregis.convertisseurdistance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import static java.lang.Integer.getInteger;

public class MainActivity extends AppCompatActivity {

    // Récuperation des Edit Text
    EditText etPied = (EditText) findViewById(R.id.etPied);
    EditText etCentimetre = (EditText) findViewById(R.id.etCentimetre);
    EditText etPouces = (EditText) findViewById(R.id.etPouces);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCalculer = (Button) findViewById(R.id.btnCalculer);

        btnCalculer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String txtPied = etPied.getText().toString();

                String txtPouce = etPouces.getText().toString();

                String txtCentimetre = etCentimetre.getText().toString();

                if (txtPied.length() == 0 && txtPouce.length() == 0 && txtCentimetre.length() == 0 ) {
                    // TODO Msg erreur saise (rien de saisie)
                }

                if (txtPied.length() != 0 && txtPouce.length() != 0 && txtCentimetre.length() != 0 ) {
                    // TODO Msg erreur saise (trop de truc saisie)
                }

                if (txtPied.length() == 0 && txtPouce.length() == 0 && txtCentimetre.length() != 0 ) {
                    // TODO remplir la longeur en Pouce et Pied (faire calcul)
                }

                if ((txtPied.length() != 0 || txtPouce.length() != 0) && txtCentimetre.length() == 0 ) {
                    // TODO remplir la longeur en centimetre (faire calcul)
                }
            }
        });

        Button btnAnnuler = (Button) findViewById(R.id.btnAnnuler);
        btnAnnuler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO
            }
        });
    }

}
