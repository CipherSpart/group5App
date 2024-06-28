package com.example.messageapp;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView addProduct, editProduct, viewProduct, deleteProduct;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addProduct = findViewById(R.id.addProduct);
        editProduct = findViewById(R.id.editProduct);
        deleteProduct = findViewById(R.id.deleteProduct);
        viewProduct = findViewById(R.id.viewProduct);
        
        addProduct.setOnClickListener(new View.OnClickListener(){
          @Override
          public void onClick(View view){
              startActivity(new Intent(getApplicationContext(), AddProduct.class));
          }
        });
        editProduct.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(getApplicationContext(), EditProduct.class));
            }
        });
        viewProduct.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(getApplicationContext(), ViewProduct.class));
            }
        });
        deleteProduct.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(getApplicationContext(), DeleteProduct.class));
            }
        });
    }
}
