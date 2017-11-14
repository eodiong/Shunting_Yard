package com.example.awesomefat.csc537_fall2017_hw2_template;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ShuntingYardActivity extends AppCompatActivity{
    EditText inputString;
    TextView postfix,result;
    Button resultButton;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_shunting_yard);
        /** Accept infix expression **/
        System.out.println("Enter infix expression");


        inputString=(EditText)findViewById(R.id.first_string);
        postfix=(TextView)findViewById(R.id.result_postfix);
        result=(TextView)findViewById(R.id.result);
        resultButton=(Button)findViewById(R.id.add_button);
        resultButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(inputString.getText().toString().isEmpty())
                {
                    Toast.makeText(ShuntingYardActivity.this, "Enter an arithmetic expression", Toast.LENGTH_SHORT).show();
                    return;
                }
                ShuntingYard sy = new ShuntingYard();
                String postfixResult = sy.infixToPostfix(inputString.getText().toString());
                Evaluation e=new Evaluation();
                int resulte=e.calculate(postfixResult);
                postfix.setText(postfixResult);
                result.setText(""+resulte);

            }
        });


        //Toast.makeText(this, ""+postfix, Toast.LENGTH_SHORT).show();
    }







}
