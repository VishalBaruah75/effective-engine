package com.example.vishal.phonesicalcapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.orm.util.NamingHelper;

import java.util.List;

public class AddContact extends AppCompatActivity {
    EditText fnametxt;
    EditText lnametxt;
    EditText numb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);
        fnametxt = (EditText)findViewById(R.id.fnametxt);
        lnametxt = (EditText)findViewById(R.id.lnametxt);
        numb = (EditText)findViewById(R.id.numb);
    }
    public void savecontact(View v){
        //Without creating a a datbase or executing any SQLlite queries a record can be saved into the database.
        PhoneDB db = new PhoneDB(fnametxt.getText().toString(),lnametxt.getText().toString(),numb.getText().toString());
        // This save feature here is done by save() method.
        db.save();
        List<PhoneDB> db1 = PhoneDB.find(PhoneDB.class, NamingHelper.toSQLNameDefault("f_name") +" = ? ", String.valueOf(fnametxt.getText().toString()));
        PhoneDB ss = db1.get(0);
        //Log.e(ss.getNumber(),"");
        Toast.makeText(getApplication(), ss.getNumber(), Toast. LENGTH_LONG).show();

    }

}
