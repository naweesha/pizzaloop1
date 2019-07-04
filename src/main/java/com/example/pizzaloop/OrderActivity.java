package com.example.pizzaloop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class OrderActivity extends AppCompatActivity {

    private static final String URL_DATA = "http://localhost:8080/pizzaloop/addorder?name=" + "&address=" + "&contactNo=" + "&pizzaId=" + "";
    private static String name;
    private static String address;
    private static String contactNumber;
    EditText Name;
    EditText Address;
    EditText ContactNumber;
    Button confirm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        Name = findViewById(R.id.txtName);
        Address = findViewById(R.id.txtAddress);
        ContactNumber = findViewById(R.id.txtContactNo);

        confirm = (Button) findViewById(R.id.btnConfirm);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(OrderActivity.this, MapActivity.class);
                startActivity(intent);
                name = String.valueOf(Name.getText());
                address = String.valueOf(Address.getText());
                contactNumber = String.valueOf(ContactNumber.getText());
                StringRequest stringRequest = new StringRequest(Request.Method.GET, "http://172.16.40.226:8080/demo/addorder?name=" + name + "&&address=" + address + "&&contactNo=" + contactNumber + "",

                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {

                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(OrderActivity.this, error.getMessage(), Toast.LENGTH_LONG).show();
                        error.printStackTrace();
                    }
                });

                Volley.newRequestQueue(OrderActivity.this).add(stringRequest);
                Toast.makeText(OrderActivity.this, "Your order is placed", Toast.LENGTH_LONG).show();

            }
        });


    }

}


