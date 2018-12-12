package iut.flavienregis.convertisseurdistance;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText etPied;
    EditText etPouce;
    EditText etCentimetre;

    TextView errSaisie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPied = (EditText) findViewById(R.id.etPied);
        etPouce = (EditText) findViewById(R.id.etPouces);
        etCentimetre = (EditText) findViewById(R.id.etCentimetre);

        errSaisie = (TextView) findViewById(R.id.msgErreur);

    }

    public void clicAnnuler(View v) {
        errSaisie.setVisibility(TextView.INVISIBLE);

        // RAZ couleur text
        etPied.setTextColor(getColor(R.color.noir));
        etCentimetre.setTextColor(getColor(R.color.noir));
        etPouce.setTextColor(getColor(R.color.noir));

        // RAZ valeur
        etPied.setText("");
        etPouce.setText("");
        etCentimetre.setText("");
    }

    public void clicValider(View v) {
        String textCentimetre = etCentimetre.getText().toString();
        String textPied = etPied.getText().toString();
        String textPouce = etPouce.getText().toString();

        if (!textCentimetre.isEmpty() && textPouce.isEmpty() && textPied.isEmpty()) {
            // TODO remplir les pied et pouce
            etPied.setText(etCentimetre);

            etPied.setText("-1");
            etPouce.setText("-1");
            etPied.setTextColor(getColor(R.color.vert));
            etPouce.setTextColor(getColor(R.color.vert));

        } else if (textCentimetre.isEmpty() && !textPouce.isEmpty() && textPied.isEmpty()) {
            // TODO remplir les centimetre et pouce

            etCentimetre.setText("-1");
            etPied.setText("-1");
            etCentimetre.setTextColor(getColor(R.color.vert));
            etPied.setTextColor(getColor(R.color.vert));

        } else if (textCentimetre.isEmpty() && textPouce.isEmpty() && !textPied.isEmpty()) {
            // TODO remplir les centimetre et pouce

            etCentimetre.setText("-1");
            etPouce.setText("-1");
            etCentimetre.setTextColor(getColor(R.color.vert));
            etPouce.setTextColor(getColor(R.color.vert));

        } else if (textCentimetre.isEmpty() && !textPouce.isEmpty() && !textPied.isEmpty()) {
            // TODO remplir les centimetre

            etCentimetre.setText("-1");
            etCentimetre.setTextColor(getColor(R.color.vert));
        } else {
            errSaisie.setVisibility(View.VISIBLE);
        }
    }
}
