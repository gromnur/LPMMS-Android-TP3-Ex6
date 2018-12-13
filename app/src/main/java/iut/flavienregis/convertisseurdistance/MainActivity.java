package iut.flavienregis.convertisseurdistance;

import android.app.Activity;
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
            Double pied = Double.parseDouble(textCentimetre)/30.48;
            Double pouce = Double.parseDouble(textCentimetre)/2.54;

            etPied.setText(String.format("%.2f",pied));
            etPouce.setText(String.format("%.6f",pouce));

            etPied.setTextColor(getColor(R.color.vert));
            etPouce.setTextColor(getColor(R.color.vert));

        } else if (textCentimetre.isEmpty() && !textPouce.isEmpty() && textPied.isEmpty()) {
            Double centimetre = Double.parseDouble(textPouce)*2.54;
            Double pied = Double.parseDouble(textPouce)/12;

            etCentimetre.setText(String.format("%.2f",centimetre));
            etPied.setText(String.format("%.2f",pied));

            etCentimetre.setTextColor(getColor(R.color.vert));
            etPied.setTextColor(getColor(R.color.vert));

        } else if (textCentimetre.isEmpty() && textPouce.isEmpty() && !textPied.isEmpty()) {
            Double centimetre = Double.parseDouble(textPied)*30.48;
            Double pouce = Double.parseDouble(textPied)*12;

            etCentimetre.setText(String.format("%.2f",centimetre));
            etPouce.setText(String.format("%.2f",pouce));
            etCentimetre.setTextColor(getColor(R.color.vert));
            etPouce.setTextColor(getColor(R.color.vert));

        } else if (textCentimetre.isEmpty() && !textPouce.isEmpty()) {
            Double centimetre = Double.parseDouble(textPied)*30.48 + Double.parseDouble(textPouce)*2.54;

            etCentimetre.setText(String.format("%.2f",centimetre));
            etCentimetre.setTextColor(getColor(R.color.vert));
        } else {
            errSaisie.setVisibility(View.VISIBLE);
        }
    }
}
