package com.example.lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view)
    {
        // выводим сообщение
        EditText et1 = findViewById(R.id.editText1);
        EditText et2 = findViewById(R.id.editText2);
        TextView tv1 = findViewById(R.id.tv1);
        TextView tv2 = findViewById(R.id.tv2);
        if(et1.getText().length() != 0 && et2.getText().length() != 0)
        {
            String value = et1.getText().toString();
            int et1v = Integer.parseInt(value);
            value = et2.getText().toString();
            int et2v = Integer.parseInt(value);
            int a = Min.min(et1v,et2v);
            int b = Max.max(et1v,et2v);

            tv1.setText(String.valueOf(a));
            tv2.setText(String.valueOf(b));
        }
        else
        {
            Toast.makeText(this, "Заполните все поля", Toast.LENGTH_SHORT).show();
        }
    }

  /*  public int min(int a, int b)
    {
        if(a <= b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }*/
   /* public int max(int a, int b)
    {
        if(a >= b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }*/

}