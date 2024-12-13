package com.example.a7chapp;

import java.util.*;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
    ListView lvMenu = findViewById(R.id.lvMenu);
    List<Map<String, String>> menuList = new ArrayList<>();

    for(int i = 0; i < 10; i++){
        Map<String, String> menu = new HashMap<>();
        menu.put("name", "ハンバーグ" + i);
        menu.put("price",  (100 * i) + "円");
        menuList.add(menu);
    }

    String[] from = {"name", "price"};
    int[] to = {android.R.id.text1, android.R.id.text2};
    SimpleAdapter adapter = new SimpleAdapter(MainActivity.this, menuList, android.R.layout.simple_list_item_2, from, to);

    lvMenu.setAdapter(adapter);
    lvMenu.setOnItemClickListener(new ListItemClickListenter());
    }
    private class ListItemClickListenter implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id){
            Map<String, String> item = (Map<String, String>)parent.getItemAtPosition(position);
            String menuName = item.get("name");
            String menuPrice = item.get("price");
            Intent intent = new Intent(MainActivity.this, MenuThanksActivity.class);
            intent.putExtra("menuName", menuName);
            intent.putExtra("menuPrice", menuPrice);
            startActivity(intent);
        }
    }
}