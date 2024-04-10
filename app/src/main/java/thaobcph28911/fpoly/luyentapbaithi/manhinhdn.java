package thaobcph28911.fpoly.luyentapbaithi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import thaobcph28911.fpoly.luyentapbaithi.userdao.dao;

public class manhinhdn extends AppCompatActivity {
private EditText taikhoan,pass;
private Button btnluu,btnshow;
private user doituong;
private dao nv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manhinhdn);
        taikhoan= findViewById(R.id.user);
        pass= findViewById(R.id.pass);
        btnluu= findViewById(R.id.btn1);
        btnshow= findViewById(R.id.btn2);
        btnshow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new  Intent(manhinhdn.this,MainActivity.class);
            }
        });
        btnluu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(taikhoan.getText().toString().length()==0||
                   taikhoan.getText().toString().length()==0){
                    Toast.makeText(getApplicationContext(),"nhap chua du",Toast.LENGTH_SHORT).show();
                }else{
                    doituong= new user();
                    doituong.setName(taikhoan.getText().toString());
                    doituong.setAddress(pass.getText().toString());
                    nv = new dao(getApplicationContext());
                    if(nv.insertStudent(doituong)>0){
Toast.makeText(getApplicationContext(),"thanh cong",Toast.LENGTH_SHORT).show();

                    }else{
                        Toast.makeText(getApplicationContext(),"khong thanh cong",Toast.LENGTH_SHORT).show();

                    }
                }
                return;



                //aaaaaaaa




            }
        });
    }
}