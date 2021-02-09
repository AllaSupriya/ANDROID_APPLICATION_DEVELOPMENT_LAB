package com.example.database;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {
    DatabaseHelper db;
    EditText u, p;
    Button r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        db = new DatabaseHelper(this);
        u = (EditText)findViewById(R.id.lusername);
        p = (EditText)findViewById(R.id.lpassword);
        r = (Button)findViewById(R.id.lregister);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = u.getText().toString();
                String password = p.getText().toString();
                if(db.Insert(username, password)){
                            Toast.makeText(getApplicationContext(), "Registered", LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Failed", LENGTH_SHORT).show();
                }
            }
        });
    }
}