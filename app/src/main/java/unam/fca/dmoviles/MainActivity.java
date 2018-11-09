package unam.fca.dmoviles;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private final static int IMAGE_WIDTH = 400;
    private final static String TEXT_VIEW_KEY = "TEXT_VIEW_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        //Actividad 8 Creacion de una calculadora de porcentajes
        //En esta actividad crearas una aplicacion que calcule la diferencia relativa en porcentaje entre dos numeros.


        // El archivo del layout de la actividad se encuentra en la carpeta
        // res/layout/activity_main.xml
        setContentView(R.layout.activity_main);

        final TextView textViewResult = findViewById(R.id.textViewResult);
        final Button calcular = findViewById(R.id.calcular);
        final EditText numero1 = (EditText)findViewById(R.id.editText);
        final EditText numero2 = (EditText)findViewById(R.id.editText2);

        calcular.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Float num1 = Float.parseFloat(numero1.getText().toString());
                Float num2 = Float.parseFloat(numero2.getText().toString());
                Float total=((num2-num1)/num1)*100;
                textViewResult.setText(total.toString()+'%');
            }
        });


        //Actividades
        //a) Ejecuta la aplicacion y familiarizate con el layout definido en R.layout.activity_main
        //b) Crea la logica para calcular la diferencia relativa en porcentaje entre dos numeros
        //c) La formula para calcular la diferencia relativa en porcentaje esta en: https://www.calculatorsoup.com/calculators/algebra/percent-change-calculator.php
        //d) La aplicacion debe calcular la diferencia relativa en porcentaje de los valores contenidos en "editText" y "editText2"
        //e) Al hacer click en el boton "button", la aplicacion debera calcular dicha diferencia y poner el resultado en el campo "textViewResult"
        //f) La aplicacion debera manejar adecuadamente el cambio de rotacion para el resultado y los campos de texto
        //e) Anota tus respuestas y las capturas de pantalla en un documento en Word
        //f) Sube tu codigo al repositorio.
        //g) Sube el documento Word a la plataforma Moodle. Incluye la liga a tu repositorio


    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        final TextView textViewResult = findViewById(R.id.textViewResult);
        final EditText numero1 = findViewById(R.id.editText);
        final EditText numero2 = findViewById(R.id.editText2);
        String e1 = numero1.getText().toString();
        String e2 = numero2.getText().toString();
        outState.putString("numero1", e1);
        outState.putString("numero2", e2);
        outState.putString(TEXT_VIEW_KEY, textViewResult.getText().toString());
        super.onSaveInstanceState(outState);
    }


    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        final TextView textViewResult = findViewById(R.id.textViewResult);
        final EditText editText = findViewById(R.id.editText);
        final EditText editText2 = findViewById(R.id.editText2);
        String e1 = savedInstanceState.getString("numero1");
        String e2 = savedInstanceState.getString("numero2");
        textViewResult.setText(savedInstanceState.getString(TEXT_VIEW_KEY));
        editText.setText(e1);
        editText2.setText(e2);
    }


}
