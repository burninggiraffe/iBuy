package com.example.owner.ibuy;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

/**
 * Created by David on 2015-11-20.
 */
public class MyItemsActivity extends Activity{
    ListView theListView;
    ItemModel[] itemList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myitems); //must be the name of the layout you want to use
        theListView = (ListView) findViewById(R.id.myItemsList);
        itemList = new ItemModel[2];
        itemList[0] = new ItemModel("pizza", "office", "user", false);
        itemList[1] = new ItemModel("paperclips", "office", "Larry", true);

        CustomAdapter adapter = new CustomAdapter(this, itemList);
        theListView.setAdapter(adapter);
    }
    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }*/
}
