package xx.xx.xx.droidbench_indirecticc_9;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class TargetActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);
        Log.i("DroidBench", "noLeak");
    }
}
