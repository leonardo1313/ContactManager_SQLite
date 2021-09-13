package com.optimahorizonapps.contactmanager_sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.optimahorizonapps.contactmanager_sqlite.data.DatabaseHandler;
import com.optimahorizonapps.contactmanager_sqlite.model.Contact;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseHandler handler = new DatabaseHandler(MainActivity.this);

        //First we need to create new contact object
        Contact paul = new Contact();
        paul.setName("Paul");
        paul.setPhoneNumber("7837430234287");

        Contact mike = new Contact();
        mike.setName("Mike");
        mike.setPhoneNumber("028438750");


//        handler.addContact(mike);

        List<Contact> contactList = handler.getAllContacts();

        for (Contact contact : contactList) {
            Log.d("MAIN", "Created: " + contact.getId() + " " + contact.getName() + " " + contact.getPhoneNumber());
        }
    }
}