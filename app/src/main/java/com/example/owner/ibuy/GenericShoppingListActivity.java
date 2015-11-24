package com.example.owner.ibuy;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

/**
 * Created by Owner on 11/23/2015.
 * Used to generate the shopping lists that are for the different groups.
 */
public class GenericShoppingListActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.shoppinglists); //must be the name of the layout you want to use


    }

    public void clickAddPerson(View v) {
        startActivity(new Intent(GenericShoppingListActivity.this, AddPersonActivity.class));
    }

    public void clickAddItem(View v) {
        startActivity(new Intent(GenericShoppingListActivity.this, AddItemActivity.class));
    }
}