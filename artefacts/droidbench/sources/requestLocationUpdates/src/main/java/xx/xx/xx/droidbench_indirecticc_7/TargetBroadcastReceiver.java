package xx.xx.xx.droidbench_indirecticc_7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class TargetBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String imei = intent.getStringExtra("DroidBench");
        Log.i("DroidBench", imei);
    }
}
