package xx.xx.xx.droidbench_indirecticc_7;

import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.location.Criteria;
import android.location.LocationManager;
import android.os.IBinder;
import android.util.Log;

public class IntermediateService extends Service {
    public IntermediateService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int startId, int ii) {
        super.onStartCommand(intent, startId, ii);
        String imei = intent.getStringExtra("DroidBench");
        Intent i = new Intent(this, TargetBroadcastReceiver.class);
        i.putExtra("DroidBench", imei);
        PendingIntent pi = PendingIntent.getBroadcast(this, 0, i, 0);

        LocationManager l = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
        Criteria c = new Criteria();
        l.requestLocationUpdates(0, 0, c, pi);
        return 0;
    }
}
