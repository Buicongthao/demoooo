package thaobcph28911.fpoly.luyentapbaithi.helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class dbhelper extends SQLiteOpenHelper {
    public static final String DB_NAME="db_student";
    public static final int Db_VERSION= 1;
    public dbhelper(@Nullable Context context) {
        super(context, DB_NAME,null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sqlCreateTable ="CREATE TABLE student("+
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "name TEXT NOT NULL," +
                "address TEXT NOT NULL)";

        sqLiteDatabase.execSQL(sqlCreateTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String droptable ="DROP TABLE IF  EXISTS student";
        sqLiteDatabase.execSQL(droptable);
        onCreate(sqLiteDatabase);
    }
}
