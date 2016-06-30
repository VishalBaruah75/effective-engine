package com.example.vishal.phonesicalcapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.orm.util.NamingHelper;

import java.util.ArrayList;
import java.util.List;

public class SearchContact extends AppCompatActivity {

    EditText fname;
    TextView a,b,c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_contact);
        fname = (EditText) findViewById(R.id.idtxtsearch1);
        a = (TextView) findViewById(R.id.tvfname);
        b = (TextView) findViewById(R.id.tvlname);
        c = (TextView) findViewById(R.id.tvnumber);
    }

    public void searchcontact(View v)
    {
        //This creates a list of all the names that match the search criteria and are retrieved from the database.
        List<PhoneDB> db1 = PhoneDB.find(PhoneDB.class, NamingHelper.toSQLNameDefault("f_name") +" = ? ", String.valueOf(fname.getText().toString()));
        //List<PhoneDB> db1 = PhoneDB.listAll(PhoneDB.class);
        //this get(0) method puts the name with the most matched criteria at the top tuple so that is can be retrieved easily.
        PhoneDB ss = db1.get(0);
        a.setText(ss.getF_name());
        b.setText(ss.getL_name());
        c.setText(ss.getNumber());
        //Toast.makeText(getApplication(), db.toString(), Toast.LENGTH_LONG).show();

    }
}
