package tomer.edu.myservicelifecycle.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import tomer.edu.myservicelifecycle.R;
import tomer.edu.myservicelifecycle.service.MyLifeCycleService;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void StartService(View view)
    {
        startService(new Intent(this, MyLifeCycleService.class));
    }

    public void StopService(View view)
    {
        stopService(new Intent(this, MyLifeCycleService.class));
    }
}
