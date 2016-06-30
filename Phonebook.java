package com.example.vishal.phonesicalcapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.orm.SugarRecord;
import com.orm.util.NamingHelper;

import java.util.List;

public class Phonebook extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phonebook);
        //A listview is created to show all the contacts that exist in the database.
        List<PhoneDB> db1 = PhoneDB.listAll(PhoneDB.class);
        //To maintain this listview an ArrayAdapter is created which is used to fill the list.
        ContactArrayAdapter adapter = new ContactArrayAdapter(this, db1);
        ListView listView = (ListView) findViewById(R.id.lv);
        listView.setAdapter(adapter);
        //the setOnItemClickListener is used for an item when it is clicked
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                PhoneDB dd = (PhoneDB) parent.getItemAtPosition(position);
                Toast.makeText(getApplication(), dd.getNumber(), Toast.LENGTH_LONG).show();
            }
        });
    }
    //the add fucntion connects the AddContact java class file with the Phonebook class file with the intent abstraction
    public void add(View v){
        Intent intent= new Intent(Phonebook.this,AddContact.class);
        startActivity(intent);
    }
    //the search fucntion connects the SearchContact java class file with the Phonebook class file with the intent abstraction
    public void search(View v){
        Intent intent= new Intent(Phonebook.this,SearchContact.class);
        startActivity(intent);
    }



    }






