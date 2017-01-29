package com.pallefire.b_34broadcastrcvrex1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        String action=intent.getAction();
        switch (action){
            case Intent.ACTION_SCREEN_OFF:

                Toast.makeText(context, "Screen is off", Toast.LENGTH_SHORT).show();
                Log.d("Batch_34","Screen Off");
                break;
            case Intent.ACTION_BATTERY_LOW:
                Toast.makeText(context, "Battery is low", Toast.LENGTH_SHORT).show();
                Log.d("Batch_34","Power is Disconnected");
                break;
        }

    }
}
