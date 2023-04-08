package com.example.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Context context;

    private TextView productName, productInfo;
    private ProductStorage productStorage;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = MainActivity.this;
        productStorage = ProductStorage.getInstance();

        recyclerView = findViewById(R.id.productRV);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ProductListAdapter(getApplicationContext(), productStorage.getProducts()));
    }

    public void addProduct(View view){

        Intent intent = new Intent(this, ProductEditActivity.class);
        startActivity(intent);

    }


}