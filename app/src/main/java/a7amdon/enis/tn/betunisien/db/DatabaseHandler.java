package a7amdon.enis.tn.betunisien.db;

/**
 * Created by 7amdon on 09/11/2016.
 */


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;

import java.util.ArrayList;
import java.util.List;

import a7amdon.enis.tn.betunisien.util.Reponse;

public class DatabaseHandler extends SQLiteOpenHelper{



    private static final int DATA_BASE_VERSION=1;
    private static final String DATA_BASE_NAME="tunisianAppManger";
    private static final String TABLE_RESPONSE="textresponse";
    private static final String Response_ID="id";
    private static final String Response_TEXT="text";
    private static final String Response_PERCENTAGE="percentage";
    private static final String Response_ID_LEVEL="id_level";
    private static final String Response_TYPE="type"; //0 = text  ; 1 = image

    public DatabaseHandler(Context context) {
        super(context, DATA_BASE_NAME, null, DATA_BASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE " + TABLE_RESPONSE + "(" + Response_ID + " INTEGER PRIMARY KEY AUTOINCREMENT," + Response_TYPE + " INTEGER," + Response_TEXT + " TEXT,"+ Response_PERCENTAGE + " FLOAT," + Response_ID_LEVEL + " INTEGER)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_RESPONSE);

        onCreate(db);
    }

    public void addReponse(Reponse reponse) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(Response_TYPE, reponse.getType());
        values.put(Response_TEXT, reponse.getTexte());
        values.put(Response_PERCENTAGE, reponse.getPourcentage());
        values.put(Response_ID_LEVEL, reponse.getId_level());

        db.insert(TABLE_RESPONSE, null, values);
        db.close();
    }

    public Reponse getTextResponse(int id_level) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_RESPONSE, new String[] { Response_ID, Response_TYPE, Response_TEXT, Response_PERCENTAGE, Response_ID_LEVEL }, Response_ID_LEVEL + "=?", new String[] { String.valueOf(id_level) }, null, null, null, null );

        if (cursor != null)
            cursor.moveToFirst();

        Reponse reponse = new Reponse(Integer.parseInt(cursor.getString(0)), Integer.parseInt(cursor.getString(1)), cursor.getString(2), Double.parseDouble(cursor.getString(3)) , Integer.parseInt(cursor.getString(4)));
        db.close();
        cursor.close();
        return reponse;
    }

    public void deleteContact(Reponse reponse) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_RESPONSE, Response_ID + "=?", new String[] { String.valueOf(reponse.getId()) });
        db.close();
    }

    public int getContactsCount() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_RESPONSE, null);
        int count = cursor.getCount();
        db.close();
        cursor.close();

        return count;
    }
/*
    public int updateContact(Contact contact) {
        SQLiteDatabase db = getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(KEY_NAME, contact.getName());
        values.put(KEY_PHONE, contact.getPhone());
        values.put(KEY_EMAIL, contact.getEmail());
        values.put(KEY_ADDRESS, contact.getAddress());
        values.put(KEY_IMAGEURI, contact.getImageURI().toString());

        int rowsAffected = db.update(TABLE_CONTACTS, values, KEY_ID + "=?", new String[] { String.valueOf(contact.getId()) });
        db.close();

        return rowsAffected;
    }
    */

    public List<Reponse> getAllResponses() {
        List<Reponse> reponses = new ArrayList<Reponse>();

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM " + TABLE_RESPONSE, null);

        if (cursor.moveToFirst()) {
            do {
                reponses.add(new Reponse(Integer.parseInt(cursor.getString(0)), Integer.parseInt(cursor.getString(1)), cursor.getString(2), Double.parseDouble(cursor.getString(3)) , Integer.parseInt(cursor.getString(4))));
            }
            while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return reponses;
    }
}