package com.example.nouredine.hospitalrdv;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DBHandler extends SQLiteOpenHelper {

    public DBHandler(Context context){
        super(context, "hspitalDB.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE user (id INTEGER PRIMARY KEY AUTOINCREMENT, login VARCHAR (50), password VARCHAR(50) );");
        db.execSQL("CREATE TABLE patient (id INTEGER PRIMARY KEY AUTOINCREMENT, num_patient VARCHAR(50) UNIQUE, age INTEGER, telephone INTEGER, prenom VARCHAR (50), nom VARCHAR(50), sex VARCHAR (1));");
        db.execSQL("CREATE TABLE rdv (id INTEGER PRIMARY KEY AUTOINCREMENT, patient VARCHAR(50), docteur VARCHAR(50), date_consul DATE, heure VARCHAR(50), jour VARCHAR (50));");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS user;");
        db.execSQL("DROP TABLE IF EXISTS patient;");
        db.execSQL("DROP TABLE IF EXISTS rdv;");
        onCreate(db);
    }

    public boolean addUser (String login, String password){
        try {
            SQLiteDatabase db=this.getWritableDatabase();
            ContentValues cv=new ContentValues();
            cv.put("login" , login);
            cv.put("password" , password);
            db.insert("user", null, cv);
            db.close();
            return true;
        } catch (Exception e)  {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateUser (String login, String password) {
        try {
            SQLiteDatabase db=this.getWritableDatabase();
            ContentValues cv=new ContentValues();
            cv.put("login" , login);
            cv.put("password" , password);
            db.update("user", cv, "login='"+login+"'", null);
            db.close();
            return true;

        } catch (Exception e)  {
            e.printStackTrace();
            return false;
        }
    }
    public boolean deleteUser (String login)
    {
        try {
            SQLiteDatabase db=this.getWritableDatabase();
            db.delete("user", "login='"+login+"'", null);
            db.close();
            return true;

        } catch (Exception e)  {
            e.printStackTrace();
            return false;
        }
    }

    public List<String> getUsers () {
        List<String> list=new ArrayList<>();
        try {
            SQLiteDatabase db=this.getReadableDatabase();
            Cursor c=db.query("user", null, null, null, null, null, null);

            if (c.getCount()>0)

            {
                c.moveToFirst();
                do {
                    String login=c.getString(1);
                    String password=c.getString(c.getColumnIndex("password"));
                    list.add(login+"/"+password);

                }while (c.moveToNext());
            }
            db.close();
            return list;

        } catch (Exception e)  {
            e.printStackTrace();
            return list;
        }
    }

    public boolean addRdv (String date, String heure, String numPatient, String doctor){
        try {
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues cv = new ContentValues();
            cv.put("patient" , numPatient);
            cv.put("docteur" , doctor);
            cv.put("date_consul" , date);
            cv.put("heure" , heure);
            cv.put("jour" , "lundi");
            db.insert("rdv", null, cv);
            db.close();
            return true;
        } catch (Exception e)  {
            e.printStackTrace();
            return false;
        }
    }
}
