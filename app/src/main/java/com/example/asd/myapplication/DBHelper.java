package com.example.asd.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "MyDB";
    private static final int DB_VERSION = 1;

    public DBHelper(Context context){
        super(context,DB_NAME,null,DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE menu (_id INTEGER PRIMARY KEY AUTOINCREMENT," + "name TEXT, price INTEGER); ";
        db.execSQL(sql);

        db.execSQL("INSERT INTO menu VALUES(NULL,'T-REX버거세트',5000);");



    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}