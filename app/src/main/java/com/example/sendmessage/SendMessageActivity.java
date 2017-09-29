package com.example.sendmessage;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.sendmessage.pojo.Message;

/**
 * SendMessage: Envia un mensaje desde un layout a otro
 *
 * @author Alejandro Aguilar
 * @version 1.0
 * @see android.app.Activity
 */

public class SendMessageActivity extends AppCompatActivity {

    private EditText edtMessage;
    private EditText edtUser;
    private Button btnOK;
    Message mensaje;
    private static final String TAG = "com.example.sendmessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
        edtMessage = (EditText) findViewById(R.id.edtMessage);
        edtUser = (EditText) findViewById(R.id.edtUser);
        btnOK = (Button) findViewById(R.id.btnOK);
        mensaje = new Message(edtMessage.getText().toString(),edtUser.getText().toString());
        //Registramos un listener al evento OnClickListener
        btnOK.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Crear un objeto bundle y añadir el mensaje
                Bundle bundle = new Bundle();
                bundle.putSerializable("objeto", mensaje);
                //Crear un objeto intent
                Intent intent = new Intent(SendMessageActivity.this, ViewMessageActivity.class);
                //Añadir el Bundle al intent
                intent.putExtras(bundle);
                //Iniciar la activity view message
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "SendMessage: OnPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "SendMessage: OnResume()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "SendMessage: OnStop()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "SendMessage: OnStart()");
    }

    /*public void getOnClick(View view)
    {
        switch (view.getId())
        {
            case R.id.btnOK:
                //Recoger el mensaje
                //Crear un objeto bundle y añadir el mensaje
                Bundle bundle = new Bundle();
                bundle.putString("message",edtMessage.getText().toString());
                bundle.putString("user",edtUser.getText().toString());
                //Crear un objeto intent
                Intent intent = new Intent(SendMessageActivity.this,ViewMessageActivity.class);
                //Añadir el Bundle al intent
                intent.putExtras(bundle);
                //Iniciar la activity view message
                startActivity(intent);
                break;
        }
        */
}
