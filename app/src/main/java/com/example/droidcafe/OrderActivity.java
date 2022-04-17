package com.example.droidcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class OrderActivity extends AppCompatActivity {
    RadioGroup rgDelivery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        setTitle("Đặt hàng");

        rgDelivery = findViewById(R.id.rgDelivery);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView tvGioHang = findViewById(R.id.order_textView);
        tvGioHang.setText(message);

        rgDelivery.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int id) {
                        switch (id) {
                            case R.id.sameday:
                                showMessage(R.string.sameday);
                                break;
                            case R.id.nextday:
                                showMessage(R.string.nextday);
                                break;
                            case R.id.pickup:
                                showMessage(R.string.pickup);
                                break;
                        }
                    }
                }
        );
    }

    public void showMessage(int idMessage) {
        Toast.makeText(this, getString(idMessage), Toast.LENGTH_SHORT).show();
    }
}