package com.example.sendmessage;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class ViewMessageActivity extends AppCompatActivity {

    private TextView txvViewUser;
    private TextView txvViewMessage;
    private static final String TAG = "com.example.sendmessage";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_message);
        txvViewUser = (TextView) findViewById(R.id.txvViewUser);
        txvViewMessage = (TextView) findViewById(R.id.txvViewMessage);
        txvViewUser.setText(String.format(getResources().getString(R.string.txvViewUser), getIntent().getExtras().getString("user")));
        txvViewMessage.setText(getIntent().getExtras().getString("message"));
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"ViewMessage: OnPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"ViewMessage: OnResume()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"ViewMessage: OnStop()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"ViewMessage: OnStart()");
    }

}
