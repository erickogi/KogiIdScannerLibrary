package com.calista.kogiscan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.developer.scanner.Mrz.CaptureActivity;
import com.developer.scanner.models.Kipande;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    TextView results;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button scan=findViewById(R.id.scan);
        results=findViewById(R.id.result);
        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(MainActivity.this, CaptureActivity.class), 1001);

            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==1001){
            if(resultCode== Activity.RESULT_OK){


                results.setText("MY D____"+new Gson().toJson(data));

                Kipande kipande=((Kipande)data.getParcelableExtra("Data") );
                results.setText("MY D____"+new Gson().toJson(data));


            }


        }
    }
}
