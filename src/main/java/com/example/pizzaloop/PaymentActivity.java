package com.example.pizzaloop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PaymentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
    }

    public  void goToCard(View view){
        Intent intent = new Intent(this, PayBycardActivity.class);
        startActivity(intent);
    }
    public  void goToOrder(View view){
        Intent intent = new Intent(this, OrderActivity.class);
        startActivity(intent);
    }

    public  void goToDetail(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }




}
