package com.eoxys.msa;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class addition extends AppCompatActivity {

    EditText num1, num2, ans;
    Button btn;
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addition);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        ans = (EditText) findViewById(R.id.ans);
        btn = (Button) findViewById(R.id.btn);

       /* btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                ans.setText(Integer.parseInt(num1.getText().toString())+ Integer.parseInt(num2.getText().toString())+"");
            }
        });*/
        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.operations, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

    }
        public void select(View v)
    {

        try {
            switch (spinner.getSelectedItem().toString())
        {
            case "add" :ans.setText(Integer.parseInt(num1.getText().toString()) + Integer.parseInt(num2.getText().toString()) + "");
                Toast.makeText(addition.this,"you have selected Addition", Toast.LENGTH_LONG).show();
                break;
            case "sub" : ans.setText(Integer.parseInt(num1.getText().toString()) - Integer.parseInt(num2.getText().toString()) + "");
                Toast.makeText(addition.this,"you have selected Substraction", Toast.LENGTH_LONG).show();
                break;
            case "mul" : ans.setText(Integer.parseInt(num1.getText().toString()) * Integer.parseInt(num2.getText().toString()) + "");
                Toast.makeText(addition.this,"you have selected Multiplication", Toast.LENGTH_LONG).show();
                break;
            case "div" : ans.setText(Integer.parseInt(num1.getText().toString()) / Integer.parseInt(num2.getText().toString()) + "");
                Toast.makeText(addition.this,"you have selected Division", Toast.LENGTH_LONG).show();
                break;
        }

        }
        catch (Exception e)
        {
            System.out.println("Entered value is not a Number");
            Toast.makeText(addition.this,"Entered value is not a Number", Toast.LENGTH_LONG).show();

        }
    }
}
