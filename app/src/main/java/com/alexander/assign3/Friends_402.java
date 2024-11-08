package com.alexander.assign3;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class Friends_402 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.alexander402_listview);

        // Sample data for friends
        ArrayList<Friend> friendsList = new ArrayList<>();
        friendsList.add(new Friend("Alex", "ILAC12345", 10, R.drawable.friend1));
        friendsList.add(new Friend("Elon", "ILAC23456", 5, R.drawable.friend2));
        friendsList.add(new Friend("Chris", "ILAC34567", 8, R.drawable.friend3));
        friendsList.add(new Friend("Taylor", "ILAC45678", 12, R.drawable.friend4));

        MyCustomAdapter_402 adapter = new MyCustomAdapter_402(this, friendsList);
        listView.setAdapter(adapter);
    }
}
