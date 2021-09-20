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

        Contact jason = new Contact();
        jason.setName("Jason");
        jason.setPhoneNumber("34243657");

//        Get 1 contact
//        Contact oneContact = handler.getContact(1);
//        oneContact.setName("New Contact");
//        oneContact.setPhoneNumber("098765");

//        handler.updateContact(oneContact);
//
//        Log.d("OneC", "onCreate: " + oneContact.getName() + ", " + oneContact.getPhoneNumber());


//        handler.addContact(jason);
        Contact newC = new Contact();
        newC.setName("NewContact");
        newC.setPhoneNumber("00000000");

        handler.deleteContact(newC);
        handler.deleteContact(mike);
        handler.deleteContact(jason);

        Log.d("Count", "Total Count: " + handler.getContactsCount());


        List<Contact> contactList = handler.getAllContacts();

        for (Contact contact : contactList) {
            Log.d("MAIN", "Created: " + contact.getId() + " " + contact.getName() + " " + contact.getPhoneNumber());
        }
    }
}