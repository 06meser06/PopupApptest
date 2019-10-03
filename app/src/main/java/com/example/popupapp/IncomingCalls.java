package com.example.popupapp;

import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class IncomingCalls extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent ıntent) {
        try{
            Toast.makeText(context,"mesaj",Toast.LENGTH_LONG).show();



        }catch (Exception e){
            e.printStackTrace();
        }
    }



}
