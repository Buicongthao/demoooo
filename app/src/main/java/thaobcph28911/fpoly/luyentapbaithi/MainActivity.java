package thaobcph28911.fpoly.luyentapbaithi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import thaobcph28911.fpoly.luyentapbaithi.userdao.dao;

public class MainActivity extends AppCompatActivity implements userInterface{
private ListView mListView;
private user nd;
private dao Dao;
private userAdapter adapter;
private ArrayList<user> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView =findViewById(R.id.lv);
        Dao = new dao(this);
        list = (ArrayList<user>) Dao.getALl();
        adapter = new userAdapter(getApplicationContext(),this::onClickDelete);
        adapter.setData(list);
        mListView.setAdapter(adapter);
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),list.get(i).getName(),Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,)
            }
        });
    }


    @Override
    public void onClickDelete(int index) {

    }
}