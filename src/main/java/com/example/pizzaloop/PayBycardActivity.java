package com.example.pizzaloop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PayBycardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay_bycard);
    }

    public  void goToOrder(View view){
        Intent intent = new Intent(this, OrderActivity.class);
        startActivity(intent);
    }

    public  void goToPay(View view){
        Intent intent = new Intent(this, PaymentActivity.class);
        startActivity(intent);
    }
}
