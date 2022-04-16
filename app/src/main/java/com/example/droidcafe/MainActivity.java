package com.example.droidcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String mOrderMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDonutOrder(View view) {
        Toast.makeText(this, getString(R.string.donut_order_message), Toast.LENGTH_SHORT).show();
        mOrderMessage = getString(R.string.donut_order_message);
    }

    public void showIceCreamOrder(View view) {
        Toast.makeText(this, getString(R.string.ice_cream_order_message), Toast.LENGTH_SHORT).show();
        mOrderMessage = getString(R.string.ice_cream_sandwiches);

    }

    public void showFroyoOrder(View view) {
        Toast.makeText(this, getString(R.string.froyo_order_message), Toast.LENGTH_SHORT).show();
        mOrderMessage = getString(R.string.froyo_order_message);
    }

    public void showOrderActivity(View view) {
        if (mOrderMessage == "") {
            Toast.makeText(this, "Please choose a droid desserts", Toast.LENGTH_SHORT).show();
        }
        Toast.makeText(this, mOrderMessage, Toast.LENGTH_SHORT).show();

    }
}