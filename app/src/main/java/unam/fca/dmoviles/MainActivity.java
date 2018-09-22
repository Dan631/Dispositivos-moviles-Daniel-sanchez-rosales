package unam.fca.dmoviles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.time.LocalDateTime;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Actividad 2 Introduccion a eventos con Button
        //https://developer.android.com/reference/android/widget/Button
        //Button es un componente de Android que realizar acciones al hacer click en el

        // El archivo del layout de la actividad se encuentra en la carpeta
        // res/layout/activity_main.xml
        setContentView(R.layout.activity_main);


        //Para hacer referencia a un componente del layout, utilizamos el metodo findViewById
        //y le pasamos como parametro el id correspondiente.

        //        Otorgamos texto al boton por medio de findViewById
        final TextView t = findViewById(R.id.btn);
        final Button btn1 = findViewById(R.id.btn);
//        Modificamos el texto del Boton
        t.setText("Boton");
//        Inicializamos findViewById para el textview y poder visualizar el texto deseado
        final TextView t1 = findViewById(R.id.tv);
//        Iniciamos la actividad del boton
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Indicamos el texto que aparecera al presionar el boton
                t1.setText(LocalDateTime.now().toString());
            }
        });

        //Actividades
        //a) Agrega un evento  setOnClickListener al boton como viene en la referencia
        //b) El el metodo onClick, modifica el texto de tv para que muestre la fecha actual con LocalDateTime.now().ToString()
        //c) Sube tu codigo al repositorio.
        //d) Sube un documento en word a la plataforma Moodle con las capturas de pantalla de tu actividad. Incluye la liga a tu repositorio

    }
}
