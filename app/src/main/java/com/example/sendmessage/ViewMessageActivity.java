package com.example.sendmessage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.example.sendmessage.pojo.Message;


public class ViewMessageActivity extends AppCompatActivity {

    private TextView txvViewUser;
    private TextView txvViewMessage;
    Message mensaje;
    private static final String TAG = "com.example.sendmessage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_message);
        txvViewUser = (TextView) findViewById(R.id.txvViewUser);
        txvViewMessage = (TextView) findViewById(R.id.txvViewMessage);
        mensaje = (Message) getIntent().getExtras().getSerializable("objeto");
        txvViewMessage.setText(mensaje.getMessage());
        txvViewUser.setText(String.format(getResources().getString(R.string.txvViewUser), mensaje.getUser()));
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ViewMessage: OnPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ViewMessage: OnResume()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ViewMessage: OnStop()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ViewMessage: OnStart()");
    }

}
