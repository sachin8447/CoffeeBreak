package com.example.sachin.coffeebreak;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int qnt1=0;
    double price;
   static boolean b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        CheckBox check=(CheckBox)findViewById(R.id.checkBox);
        b=check.isChecked();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void increase(View view)
    {
         qnt1=qnt1+1;
            display(qnt1);
    }

    public void decrease(View view)
    {
        if(qnt1>=1) {
            qnt1 = qnt1 - 1;
            display(qnt1);
        }
        else
        {
            Snackbar.make(view, "Quantity Cannot Be Less Then Zero ", Snackbar.LENGTH_SHORT)
                    .setAction(null, null).show();
        }
    }

    private void display(int a)
    {
        TextView t=(TextView)findViewById(R.id.qnt);
        t.setText(" " + a);
        TextView t1=(TextView)findViewById(R.id.price);
        t1.setText(" "+a*15);
        TextView m=(TextView)findViewById(R.id.messege);
        m.setTextSize(19);
        m.setText("Amount Due Is " + a * 15 + " Rupees ");
        price=a*15;
    }

    public void place(View v)
    {
        TextView m=(TextView)findViewById(R.id.messege);
        String s="Name : Sachin Kumar"+"\nQuantity Is : "+qnt1+"\n" +"Amount Due Is : "+price+"\n"+"Whipped Cream : "+b+"\n\n\n"+" Thank You";
        m.setText(s);
        m.setTextSize(25);
    }

}
