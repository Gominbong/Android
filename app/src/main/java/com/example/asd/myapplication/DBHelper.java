package com.example.asd.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "MyDB";
    private static final int DB_VERSION = 1;

    public DBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE MENU " +
                "(_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "IMAGE_RESOURCE_ID INTEGER," +
                "NAME TEXT, " +
                "PRICE TEXT);");


    }
    public void delect(){

    };
    public void insert(){

    };
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
