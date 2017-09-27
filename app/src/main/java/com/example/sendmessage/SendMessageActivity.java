package com.example.sendmessage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SendMessageActivity extends AppCompatActivity {

    private EditText edtMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
        edtMessage = (EditText) findViewById(R.id.edtMessage);
    }

    public void getOnClick(View view)
    {
        switch (view.getId())
        {
            case R.id.btnOK:

                Bundle bundle = new Bundle();
                bundle.putString("message",);
                //Recoger el mensaje
                //Crear un objeto bundle y añadir el mensaje
                //Crear un objeto intent
                //Iniciar la activity view message
                break;
        }
    }
}
