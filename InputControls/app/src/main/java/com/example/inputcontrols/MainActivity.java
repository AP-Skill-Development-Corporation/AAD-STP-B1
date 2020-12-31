package com.example.inputcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /*Global Declaration*/
    /*Declare the views here*/
    EditText uname,umail,uphone;
    RadioGroup rg;
    RadioButton rb;
    Spinner sp;
    CheckBox tel,hin,eng;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Intialise or instantiate all the views here*/
        uname = findViewById(R.id.uname);
        umail = findViewById(R.id.umail);
        uphone = findViewById(R.id.uphone);
        rg = findViewById(R.id.ugender);
        sp = findViewById(R.id.branch);
        tel = findViewById(R.id.tel);
        hin = findViewById(R.id.hin);
        eng = findViewById(R.id.eng);

    }

    public void submit(View view) {
        String name = uname.getText().toString();
        String mail = umail.getText().toString();
        String number = uphone.getText().toString();
        int rid = rg.getCheckedRadioButtonId();
        rb = findViewById(rid);
        String gender = rb.getText().toString();
        String branch = sp.getSelectedItem().toString();
        StringBuilder builder = new StringBuilder();
        if (tel.isChecked()){
            builder.append("Telugu"+",");
        }
        if (hin.isChecked()){
            builder.append("Hindi"+",");
        }
        if (eng.isChecked()){
            builder.append("English"+"");
        }
        if (name.isEmpty()) {
            uname.setError("Is Mandatory");
        }
        if (mail.isEmpty()){
            umail.setError("Is Mandatory");
        }
        else{
            Log.i("APSSDC",name+"\n"+mail+"\n"+number+"\n"+
                    gender+"\n"+branch+"\n"+builder.toString());
        }
    }
}