package com.heba.tadbeer.Util;

import android.content.Context;
import android.database.sqlite.*;
/**
 * Created by root on 3/13/16.
 */
public class DBHelper extends SQLiteOpenHelper {

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Tadbeer.db";

    /** TABLE NAMES **/
    private static final String TABLE_NAME_CARD = "Cards";
    private static final String TABLE_NAME_RECEIPT = "Receipts";
    private static final String TABLE_NAME_RETAILER = "Receipts";

    /** COLUMN NAMES **/
    private static final String COLUMN_NAME_ID = "id";
    private static final String COLUMN_NAME_NAME = "name";
    private static final String COLUMN_NAME_RETAILER_ID = "retailerId";
    private static final String COLUMN_NAME_NUMBER = "number";
    private static final String COLUMN_NAME_TYPE_ID = "typeId";
    private static final String COLUMN_NAME_POINTS = "points";
    private static final String COLUMN_NAME_ISSUED = "issued";
    private static final String COLUMN_NAME_EXPIRES = "expires";
    private static final String COLUMN_NAME_CARD_ID = "card_id";
    private static final String COLUMN_NAME_BRANCH_ID = "branch_id";
    private static final String COLUMN_NAME_TOTAL = "total";
    private static final String COLUMN_NAME_DATE = "date";
    private static final String COLUMN_NAME_OID = "ownerIdentifier";

    public DBHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        /** Create Table DDL **/
        String SQL_CREATE_CARDS_TABLE =
                "CREATE TABLE " + TABLE_NAME_CARD + " (" +
                        COLUMN_NAME_ID + " INTEGER PRIMARY KEY," +
                        COLUMN_NAME_NUMBER + " INTEGER," +
                        COLUMN_NAME_RETAILER_ID + " INTEGER," +
                        COLUMN_NAME_OID + " TEXT," +
                        COLUMN_NAME_TYPE_ID + " INTEGER," +
                        COLUMN_NAME_POINTS + " REAL," +
                        COLUMN_NAME_ISSUED + " INTEGER," +
                        COLUMN_NAME_EXPIRES + " INTEGER," +
                        " )";
        String SQL_CREATE_RETAILER_TABLE =
                "CREATE TABLE " + TABLE_NAME_RETAILER + " (" +
                        COLUMN_NAME_ID + " INTEGER PRIMARY KEY," +
                        COLUMN_NAME_NAME + " TEXT," +
                        " )";
        String SQL_CREATE_RECEIPT_TABLE =
                "CREATE TABLE " + TABLE_NAME_RECEIPT + " (" +
                        COLUMN_NAME_ID + " INTEGER PRIMARY KEY," +
                        COLUMN_NAME_NUMBER + " TEXT," +
                        COLUMN_NAME_CARD_ID + " INTEGER," +
                        COLUMN_NAME_BRANCH_ID + " INTEGER," +
                        COLUMN_NAME_POINTS + " REAL," +
                        COLUMN_NAME_TOTAL + " REAL," +
                        COLUMN_NAME_DATE + " REAL," +
                        " )";

        /** Create Tables **/
        db.execSQL(SQL_CREATE_CARDS_TABLE);
        db.execSQL(SQL_CREATE_RECEIPT_TABLE);
        db.execSQL(SQL_CREATE_RETAILER_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String SQL_DELETE_CARDS = "DROP TABLE IF EXISTS " + TABLE_NAME_CARD;
        String SQL_DELETE_RECEIPT = "DROP TABLE IF EXISTS " + TABLE_NAME_RECEIPT;
        String SQL_DELETE_RETAILERS = "DROP TABLE IF EXISTS " + TABLE_NAME_RETAILER;

        db.execSQL(SQL_DELETE_CARDS);
        db.execSQL(SQL_DELETE_RECEIPT);
        db.execSQL(SQL_DELETE_RETAILERS);

        onCreate(db);
    }
}
