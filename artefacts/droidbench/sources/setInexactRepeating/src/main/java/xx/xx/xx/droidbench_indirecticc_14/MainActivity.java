package xx.xx.xx.droidbench_indirecticc_14;


import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.telephony.TelephonyManager;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String imei = ((TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE)).getDeviceId();
        Intent i = new Intent(this, TargetActivity.class);
        i.putExtra("DroidBench", imei);
        PendingIntent pi = PendingIntent.getActivity(this, 0, i, 0);
        AlarmManager am = ((AlarmManager) this.getSystemService(Context.ALARM_SERVICE));
        am.setInexactRepeating(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() - 100, 10, pi);
    }
}
