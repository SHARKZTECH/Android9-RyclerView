package com.example.recyclerview1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<MyModel> userlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initData();

        RecyclerView recyclerView=findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        MyAdapter myAdapter=new MyAdapter(getApplicationContext(),userlist);
        recyclerView.setAdapter(myAdapter);
    }

    private void initData() {
        userlist=new ArrayList<>();
        userlist.add(new MyModel(R.drawable.sharkz,"Sharkz","3.00pm","Hii"));
        userlist.add(new MyModel(R.drawable.sharkz,"Sharkz","3.00pm","Hii"));
        userlist.add(new MyModel(R.drawable.sharkz,"Sharkz","3.00pm","Hii"));
        userlist.add(new MyModel(R.drawable.sharkz,"Sharkz","3.00pm","Hii"));
        userlist.add(new MyModel(R.drawable.sharkz,"Sharkz","3.00pm","Hii"));
        userlist.add(new MyModel(R.drawable.sharkz,"Sharkz","3.00pm","Hii"));
        userlist.add(new MyModel(R.drawable.sharkz,"Sharkz","3.00pm","Hii"));
        userlist.add(new MyModel(R.drawable.sharkz,"Sharkz","3.00pm","Hii"));
        userlist.add(new MyModel(R.drawable.sharkz,"Sharkz","3.00pm","Hii"));
        userlist.add(new MyModel(R.drawable.sharkz,"Sharkz","3.00pm","Hii"));
        userlist.add(new MyModel(R.drawable.sharkz,"Sharkz","3.00pm","Hii"));
    }
}