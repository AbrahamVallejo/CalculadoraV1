package com.example.jahir.calculadora;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class calculadora extends AppCompatActivity {
    private TextView Dispaly, Dispaly2;
    private Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bma, bme, bmul, bdiv, bigu, bpun, bC;
    /** * ATTENTION: This was auto-generated to implement the App Indexing API. * See https://g.co/AppIndexing/AndroidStudio for more information. */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        b0 = (Button) findViewById(R.id.button22);
        b1 = (Button) findViewById(R.id.button25);
        b2 = (Button) findViewById(R.id.button26);
        b3 = (Button) findViewById(R.id.button27);
        b4 = (Button) findViewById(R.id.button28);
        b5 = (Button) findViewById(R.id.button29);
        b6 = (Button) findViewById(R.id.button30);
        b7 = (Button) findViewById(R.id.button31);
        b8 = (Button) findViewById(R.id.button32);
        b9 = (Button) findViewById(R.id.button33);
        bma = (Button) findViewById(R.id.button35);
        bme = (Button) findViewById(R.id.button36);
        bmul = (Button) findViewById(R.id.button38);
        bdiv = (Button) findViewById(R.id.button39);
        bigu = (Button) findViewById(R.id.button24);
        bpun = (Button) findViewById(R.id.button23);
        bigu = (Button) findViewById(R.id.button34);
        Dispaly = (TextView) findViewById(R.id.textView);
        Dispaly2 = (TextView) findViewById(R.id.textView2);
        // ATTENTION: This was auto-generated to implement the App Indexing API.  // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void imprimir0(View view) {
        if (Dispaly.getText().equals(" ")) {
            Dispaly.setText("0");
        } else {
            Dispaly.setText(Dispaly.getText() + "0");
        }
    }

    public void imprimir1(View view) {
        if (Dispaly.getText().equals(" ")) {
            Dispaly.setText("1");
        } else {
            Dispaly.setText(Dispaly.getText() + "1");
        }
    }

    public void imprimir2(View view) {
        if (Dispaly.getText().equals(" ")) {
            Dispaly.setText("2");
        } else {
            Dispaly.setText(Dispaly.getText() + "2");
        }
    }

    public void imprimir3(View view) {
        if (Dispaly.getText().equals(" ")) {
            Dispaly.setText("3");
        } else {
            Dispaly.setText(Dispaly.getText() + "3");
        }
    }

    public void imprimir4(View view) {
        if (Dispaly.getText().equals(" ")) {
            Dispaly.setText("4");
        } else {
            Dispaly.setText(Dispaly.getText() + "4");
        }
    }

    public void imprimir5(View view) {
        if (Dispaly.getText().equals(" ")) {
            Dispaly.setText("5");
        } else {
            Dispaly.setText(Dispaly.getText() + "5");
        }
    }

    public void imprimir6(View view) {
        if (Dispaly.getText().equals(" ")) {
            Dispaly.setText("6");
        } else {
            Dispaly.setText(Dispaly.getText() + "6");
        }
    }

    public void imprimir7(View view) {
        if (Dispaly.getText().equals(" ")) {
            Dispaly.setText("7");
        } else {
            Dispaly.setText(Dispaly.getText() + "7");
        }
    }

    public void imprimir8(View view) {
        if (Dispaly.getText().equals(" ")) {
            Dispaly.setText("8");
        } else {
            Dispaly.setText(Dispaly.getText() + "8");
        }
    }

    public void imprimir9(View view) {
        if (Dispaly.getText().equals(" ")) {
            Dispaly.setText("9");
        } else {
            Dispaly.setText(Dispaly.getText() + "9");
        }
    }

    public void Limpiar(View view) {
        Dispaly.setText("");    Dispaly2.setText("");
    } //String display1;  //float res;
    int boton1, boton2, boton3, boton4, boton5;
    int cont;

    public void Suma(View view) {
        boton1 = Integer.parseInt(Dispaly.getText().toString());
        Dispaly.setText("");  Dispaly2.setText(String.valueOf(boton1)+" + ");
    }

    public void Resta(View view) {
        boton3 = Integer.parseInt(Dispaly.getText().toString());
        Dispaly.setText("");  Dispaly2.setText(String.valueOf(boton3)+" - ");
    }

    public void resul(View view) {
        boton2 = Integer.parseInt(Dispaly.getText().toString());
        cont =boton1+boton5+boton3+boton4;

        if (boton1 > 0) {
            boton1 = boton1 + boton2;
            Dispaly.setText(String.valueOf(boton1)); Dispaly2.setText(Dispaly2.getText().toString() + String.valueOf(boton2));
            boton1 = 0;
        }
        if (boton3 > 0) {
            boton3 = boton3 - boton2;
            Dispaly.setText(String.valueOf(boton3)); Dispaly2.setText(Dispaly2.getText().toString() + String.valueOf(boton2));
            boton3 = 0;
        }
        if (boton4 > 0) {
            boton4 = boton4*boton2;
            Dispaly.setText(String.valueOf(boton4)); Dispaly2.setText(Dispaly2.getText().toString() + String.valueOf(boton2));
            boton4 = 0;
        }
        if (boton5 > 0) {
             boton5 = boton5 / (boton2);
            Dispaly.setText(String.valueOf(boton5)); Dispaly2.setText(Dispaly2.getText().toString() + String.valueOf(boton2));
            boton5 = 0;
        }
        if (cont ==0){
            Dispaly.setText("");    Dispaly2.setText("");
        }
    }

    public void Multi(View view) {
        boton4 = Integer.parseInt(Dispaly.getText().toString());
        Dispaly.setText("");     Dispaly2.setText(String.valueOf(boton4)+" x ");
    }
    public void Divi(View view) {
        boton5 = Integer.parseInt(Dispaly.getText().toString());
        Dispaly.setText("");    Dispaly2.setText(String.valueOf(boton5)+" / ");
    }

    /*** ATTENTION: This was auto-generated to implement the App Indexing API. * See https://g.co/AppIndexing/AndroidStudio for more information. */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("calculadora Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();
        // ATTENTION: This was auto-generated to implement the App Indexing API.  // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.  // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}