package com.example.vishal.phonesicalcapplication;

import com.orm.SugarRecord;

/**
 * Created by vishal on 29-Jun-16.
 */
/*This uses an Object-Relational-Mapping(ORM) called Sugar and is intended to simplify the interaction with SQLite database in Android.
It eliminates writing SQL queries to interact with SQLite db.
It takes care of creating your database.
It provides you with clear and simple APIs for db operations
 */
//SugarRecord for all the classes that you need persisted and for which database is necessary
//Here the class PhoneDB creates a database containing the first name, last name and the number
public class PhoneDB extends SugarRecord {
        String f_name;
        String l_name;
        String number;

        public PhoneDB() {
        }

        public PhoneDB(String f_name,String l_name,String number) {
            this.f_name = f_name;
            this.l_name = l_name;
            this.number = number;
        }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getL_name() {
        return l_name;
    }

    public void setL_name(String l_name) {
        this.l_name = l_name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
