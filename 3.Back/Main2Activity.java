package com.example.back;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class Main2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView txt = (TextView)findViewById(R.id.textView2);
        Intent i = getIntent();
        String p = i.getStringExtra("number");
        txt.setText(p);
        Button b = (Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Main2Activity.this,MainActivity.class);
                //i1.putExtra("number",(String)mListView.getAdapter().getItem(i));
                startActivity(i1);
            }
        });
    }
}
