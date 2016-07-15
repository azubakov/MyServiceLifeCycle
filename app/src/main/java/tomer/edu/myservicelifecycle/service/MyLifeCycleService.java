package tomer.edu.myservicelifecycle.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by azubakov on 7/15/16.
 */
public class MyLifeCycleService extends Service {

    private static final String TAG = "MyLifeCycleServiceTag";


    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "Service began his creating - onCreate()");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.i(TAG, "Service is beginning his starting - onStartCommand...");
        return super.onStartCommand(intent, flags, startId);
    }



    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }

    @Override
    public void onRebind(Intent intent) {
        super.onRebind(intent);
    }

    @Override
    public void onDestroy() {
        Log.i(TAG, "Service ends his existing and it is   destroying his runnung - onDestoy...");
        super.onDestroy();

    }
}
