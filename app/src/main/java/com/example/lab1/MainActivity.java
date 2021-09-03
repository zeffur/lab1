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
        EditText et1 = findViewById(R.id.editText1);
        EditText et2 = findViewById(R.id.editText2);
        TextView tv1 = findViewById(R.id.tv1);
        TextView tv2 = findViewById(R.id.tv2);
        if(et1.getText().length() != 0 && et2.getText().length() != 0)
        {
            String value1 = et1.getText().toString();
            String value2 = et2.getText().toString();
            long et1v = Long.parseLong(value1);
            long et2v = Long.parseLong(value2);
            if (et1v <= Integer.MAX_VALUE && et1v >= Integer.MIN_VALUE && et2v <= Integer.MAX_VALUE && et2v >= Integer.MIN_VALUE)
            {
                int one = (int)et1v;
                int two = (int)et2v;
                int a = Min.min(one,two);
                int b = Max.max(one,two);

                tv1.setText(String.valueOf(a));
                tv2.setText(String.valueOf(b));
            }
            else
            {
                Toast.makeText(this, "Введенные числа слишком велики", Toast.LENGTH_SHORT).show();
            }
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