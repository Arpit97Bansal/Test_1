package com.example.arpitbansal.test_1;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.apache.commons.math3.linear.RealMatrix;

public class MainActivity extends AppCompatActivity implements SensorEventListener
{
    RealMatrix H;
    private SensorManager sensorManager; // manages all the sensors
    private Sensor accelerometer; // we are using the sensor accelerometer
    private Sensor gyroscope
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
