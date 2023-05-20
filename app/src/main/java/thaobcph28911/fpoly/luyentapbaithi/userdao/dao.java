package thaobcph28911.fpoly.luyentapbaithi.userdao;

import android.annotation.SuppressLint;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import thaobcph28911.fpoly.luyentapbaithi.helper.dbhelper;
import thaobcph28911.fpoly.luyentapbaithi.user;

public class dao {
private SQLiteDatabase db;
public dao(Context mContext){
    dbhelper dbhelperr = new dbhelper(mContext);
    db=dbhelperr.getWritableDatabase();
}
public long insertStudent(user obj){
    ContentValues values = new ContentValues();
    values.put("name",obj.getName());
    values.put("address",obj.getName());
            return db.insert("student",null,values);

}
public int deleteStudent(String id){
    return db.delete("student","id=?",new String[]{id});

}
public int deleteStudent(user obj){
    String id = String.valueOf(obj.getId());
    return db.delete("student","id=?",new String[]{id});

}
public int updateStudent(user obj){
    ContentValues values = new ContentValues();
    values.put("name",obj.getName());
    values.put("address",obj.getName());
    String id = String.valueOf(obj.getId());
    return db.update("student ",values,"id=?",new String[]{id});

}
public List<user>getALl(){
    String sql="Select *FROM student";
    return getData(sql);
}
@SuppressLint("Range")
public List<user>getData(String sql, String...SelectArgs){
List<user> list =new ArrayList<>();
    Cursor cursor = db.rawQuery(sql,SelectArgs);
    while (cursor.moveToNext()){
        user nd = new user();
        nd.setId(Integer.parseInt(cursor.getString(cursor.getColumnIndex("id"))));
        nd.setName(cursor.getString(cursor.getColumnIndex("name")));
        nd.setAddress(cursor.getString(cursor.getColumnIndex("address")));
        list.add(nd);


    }
    if(list!=null || list.size()!=0){
return list;
    }
    return null;
}


}
