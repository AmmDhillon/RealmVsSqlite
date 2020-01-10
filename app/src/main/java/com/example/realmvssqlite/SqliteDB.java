package com.example.realmvssqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.List;

import io.realm.RealmList;

import static com.example.realmvssqlite.Constant.SampleCard.COLUMN_NAME_USER_UNIQUE_ID;
import static com.example.realmvssqlite.Constant.SampleCard.COLUMN_NAME_UUID;
import static com.example.realmvssqlite.Constant.SampleCard.TABLE_NAME;

public class SqliteDB extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "test.db";
    public static final int DATABASE_VERSION = 1;

    private Context context;

    public SqliteDB(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        createTables(sqLiteDatabase);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    private void createTables(SQLiteDatabase db) {
        try {
            String SETTING_TABLE = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + " (" +
                    Constant.SampleCard._ID + " INTEGER PRIMARY KEY AUTOINCREMENT," +
                    Constant.SampleCard.COLUMN_NAME_ID + " TEXT," +
                    Constant.SampleCard.COLUMN_NAME_USER_UNIQUE_ID + " TEXT," +
                    Constant.SampleCard.COLUMN_NAME_CARD_ID + " TEXT," +
                    Constant.SampleCard.COLUMN_NAME_CARD_NAME + " TEXT," +
                    Constant.SampleCard.COLUMN_NAME_CARD_USERNAME + " TEXT," +
                    Constant.SampleCard.COLUMN_NAME_CARD_PHONE_NUMBER + " TEXT," +
                    Constant.SampleCard.COLUMN_NAME_CARD_COUNTRY_CODE + " TEXT," +
                    Constant.SampleCard.COLUMN_NAME_CARD_COUNTRY_NAME + " TEXT," +
                    Constant.SampleCard.COLUMN_NAME_CARD_COMPANY + " TEXT," +
                    Constant.SampleCard.COLUMN_NAME_CARD_POSITION + " TEXT," +
                    Constant.SampleCard.COLUMN_NAME_CARD_COMPANY_ADDRESS + " TEXT," +
                    Constant.SampleCard.COLUMN_NAME_CARD_TAGS + " TEXT," +
                    Constant.SampleCard.COLUMN_NAME_CARD_NOTES + " TEXT," +
                    Constant.SampleCard.COLUMN_NAME_CARD_STATUS + " TEXT," +
                    Constant.SampleCard.COLUMN_NAME_CARD_IMAGE_URL + " TEXT," +
                    Constant.SampleCard.COLUMN_NAME_CARD_COMPANY_DESCRIPTION + " TEXT," +
                    Constant.SampleCard.COLUMN_NAME_CARD_SELLING_INTERESTS + " TEXT," +
                    Constant.SampleCard.COLUMN_NAME_CARD_BUYING_INTERESTS + " TEXT," +
                    Constant.SampleCard.COLUMN_NAME_CARD_CREATED_AT + " TEXT," +
                    Constant.SampleCard.COLUMN_NAME_CARD_LAST_MODIFIED_AT + " TEXT," +
                    Constant.SampleCard.COLUMN_NAME_CARD_CONFIRMED_AT + " TEXT," +
                    Constant.SampleCard.COLUMN_NAME_CARD_SC_ID + " INTEGER," +
                    Constant.SampleCard.COLUMN_NAME_EMAIL + " TEXT," +
                    Constant.SampleCard.COLUMN_NAME_CARD_NON_SC_ID + " INTEGER," +
                    Constant.SampleCard.COLUMN_NAME_EVENT_IDENTIFIER + " TEXT," +
                    Constant.SampleCard.COLUMN_NAME_UUID + " TEXT," +
                    Constant.SampleCard.COLUMN_NAME_CARD_IS_NON_SC + " INTEGER DEFAULT " + 0 + "," +
                    Constant.SampleCard.COLUMN_NAME_CARD_IS_DELETED + " INTEGER," +
                    Constant.SampleCard.COLUMN_NAME_EXTRA_FIELDS + " TEXT  )";

            db.execSQL(SETTING_TABLE);

            Log.e("SQ", "Tables Created!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertCard(Card card, String userUniqueID) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(Constant.SampleCard.COLUMN_NAME_ID, card.getId());
        values.put(Constant.SampleCard.COLUMN_NAME_USER_UNIQUE_ID, userUniqueID);
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_ID, card.getCardId());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_NAME, card.getName());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_USERNAME, card.getUsername());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_PHONE_NUMBER, card.getPhoneNumber());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_COUNTRY_CODE, card.getCountryCode());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_COUNTRY_NAME, card.getCountryName());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_COMPANY, card.getCompany());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_POSITION, card.getPosition());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_COMPANY_ADDRESS, card.getCompanyAddress());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_TAGS, new Gson().toJson(card.getTags()));
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_NOTES, card.getNotes());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_STATUS, card.getStatus());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_IMAGE_URL, card.getImageUrl());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_COMPANY_DESCRIPTION, card.getCompanyDescription());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_SELLING_INTERESTS, card.getSellingInterests());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_BUYING_INTERESTS, card.getBuyingInterests());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_CREATED_AT, card.getCreatedAt());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_LAST_MODIFIED_AT, card.getLastModifiedAt());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_CONFIRMED_AT, card.getConfirmedAt());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_IS_DELETED, 0);
        values.put(Constant.SampleCard.COLUMN_NAME_EMAIL, card.getUsername());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_NON_SC_ID, card.getNonSampleCardID());
        values.put(Constant.SampleCard.COLUMN_NAME_EVENT_IDENTIFIER, card.getShowIdentifier());
        values.put(Constant.SampleCard.COLUMN_NAME_EXTRA_FIELDS, new Gson().toJson(card.getExtraFields()));

        values.put(COLUMN_NAME_UUID, card.getUuId());
        sqLiteDatabase.insert(TABLE_NAME, null, values);
    }

    public void updateCardIfExist(Card card, String userUniqueID) {
        SQLiteDatabase sqLiteDatabase = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(Constant.SampleCard.COLUMN_NAME_ID, card.getId());
        values.put(Constant.SampleCard.COLUMN_NAME_USER_UNIQUE_ID, userUniqueID);
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_ID, card.getCardId());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_NAME, card.getName());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_USERNAME, card.getUsername());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_PHONE_NUMBER, card.getPhoneNumber());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_COUNTRY_CODE, card.getCountryCode());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_COUNTRY_NAME, card.getCountryName());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_COMPANY, card.getCompany());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_POSITION, card.getPosition());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_COMPANY_ADDRESS, card.getCompanyAddress());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_TAGS, new Gson().toJson(card.getTags()));
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_NOTES, card.getNotes());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_STATUS, card.getStatus());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_IMAGE_URL, card.getImageUrl());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_COMPANY_DESCRIPTION, card.getCompanyDescription());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_SELLING_INTERESTS, card.getSellingInterests());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_BUYING_INTERESTS, card.getBuyingInterests());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_CREATED_AT, card.getCreatedAt());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_LAST_MODIFIED_AT, card.getLastModifiedAt());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_CONFIRMED_AT, card.getConfirmedAt());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_IS_DELETED, 0);
        values.put(Constant.SampleCard.COLUMN_NAME_EMAIL, card.getUsername());
        values.put(Constant.SampleCard.COLUMN_NAME_CARD_NON_SC_ID, card.getNonSampleCardID());
        values.put(Constant.SampleCard.COLUMN_NAME_EVENT_IDENTIFIER, card.getShowIdentifier());
        values.put(Constant.SampleCard.COLUMN_NAME_EXTRA_FIELDS, new Gson().toJson(card.getExtraFields()));

        if (checkIsDataAlreadyInDBorNot(card.getUuId(), card.getId() == null ? 0 : card.getId(), userUniqueID)) {
            if (!TextUtils.isEmpty(card.getUuId())) {
                sqLiteDatabase.update(TABLE_NAME, values,
                        Constant.SampleCard.COLUMN_NAME_UUID
                                + " = ? AND " + COLUMN_NAME_USER_UNIQUE_ID
                                + " = ?",
                        new String[]{String.valueOf(card.getUuId()),
                                userUniqueID});
            } else {
                sqLiteDatabase.update(TABLE_NAME, values,
                        Constant.SampleCard.COLUMN_NAME_ID
                                + " = ? AND " + COLUMN_NAME_USER_UNIQUE_ID
                                + " = ?",
                        new String[]{String.valueOf(card.getId() == null ? 0 : card.getId()), userUniqueID});
            }
        }
    }

    private boolean checkIsDataAlreadyInDBorNot(String uuID, int id, String userUniqueID) {
        SQLiteDatabase db = this.getReadableDatabase();
        String Query;
        if (!TextUtils.isEmpty(uuID)) {
            Query = "SELECT  * FROM " + TABLE_NAME +
                    " WHERE " + Constant.SampleCard.COLUMN_NAME_UUID
                    + " = '" + uuID + "' AND " + COLUMN_NAME_USER_UNIQUE_ID
                    + " ='" + userUniqueID + "'";
        } else {
            Query = "SELECT  * FROM " + TABLE_NAME +
                    " WHERE " + Constant.SampleCard.COLUMN_NAME_ID
                    + " = " + id + " AND " + COLUMN_NAME_USER_UNIQUE_ID
                    + " ='" + userUniqueID + "'";
        }
        Cursor cursor = db.rawQuery(Query, null);
        if (cursor.getCount() <= 0) {

            cursor.close();
            return false;
        }
        cursor.close();
        return true;
    }

    public Card getCardByUserIdIfExists(String uuID, int id, String userUniqueID) {
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        String selectQuery = "";
        if (!TextUtils.isEmpty(uuID)) {
            selectQuery = "SELECT  * FROM " + TABLE_NAME +
                    " WHERE " + Constant.SampleCard.COLUMN_NAME_CARD_IS_DELETED
                    + " = " + 0 + " AND " + Constant.SampleCard.COLUMN_NAME_UUID
                    + " = '" + uuID + "' AND " + COLUMN_NAME_USER_UNIQUE_ID
                    + " = '" + userUniqueID + "' ";
        } else {
            selectQuery = "SELECT  * FROM " + TABLE_NAME
                    + " WHERE " + Constant.SampleCard.COLUMN_NAME_CARD_IS_DELETED
                    + " = " + 0 + " AND " + Constant.SampleCard.COLUMN_NAME_ID
                    + " = " + id + " AND " + COLUMN_NAME_USER_UNIQUE_ID
                    + " = '" + userUniqueID + "' ";
        }

        Card card = null;
        Cursor cursor = null;
        try {
            cursor = sqLiteDatabase.rawQuery(selectQuery, null);
            if (cursor.moveToFirst()) {
                card = new Card();

                String ID = cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_ID));
                if (!TextUtils.isEmpty(ID) && TextUtils.isDigitsOnly(ID)) {
                    card.setId(Integer.parseInt(ID));
                }
                String cardID = cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_ID));
                if (!TextUtils.isEmpty(cardID) && TextUtils.isDigitsOnly(cardID)) {
                    card.setCardId(Integer.parseInt(cardID));
                }
                card.setName(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_NAME)));
                card.setUsername(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_USERNAME)));
                card.setPhoneNumber(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_PHONE_NUMBER)));
                card.setCountryCode(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_COUNTRY_CODE)));
                card.setCountryName(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_COUNTRY_NAME)));
                card.setCompany(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_COMPANY)));
                card.setPosition(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_POSITION)));
                card.setCompanyAddress(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_COMPANY_ADDRESS)));
                card.setTags(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_TAGS)) == null
                        ? new RealmList<String>()
                        : new Gson().<RealmList<String>>fromJson(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_TAGS)), new TypeToken<RealmList<String>>() {
                }.getType()));
                card.setNotes(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_NOTES)));
                card.setStatus(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_STATUS)));
                card.setImageUrl(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_IMAGE_URL)));
                card.setCompanyDescription(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_COMPANY_DESCRIPTION)));
                card.setSellingInterests(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_SELLING_INTERESTS)));
                card.setBuyingInterests(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_BUYING_INTERESTS)));
                card.setCreatedAt(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_CREATED_AT)));
                card.setLastModifiedAt(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_LAST_MODIFIED_AT)));
                card.setConfirmedAt(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_CONFIRMED_AT)));
                card.setNonSampleCardID(cursor.getInt(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_NON_SC_ID)));
                card.setShowIdentifier(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_EVENT_IDENTIFIER)));
                card.setUuId(cursor.getString(cursor.getColumnIndex(COLUMN_NAME_UUID)));
                card.setExtraFields(new Gson().fromJson(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_EXTRA_FIELDS)), ExtraFields.class));
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
        return card;
    }

    public ArrayList<Card> getAllCards(String userUniqueID) {
        ArrayList<Card> cardArrayList = new ArrayList<Card>();
        String selectQuery = "SELECT  * FROM " + TABLE_NAME
                + " WHERE " + Constant.SampleCard.COLUMN_NAME_CARD_IS_DELETED
                + " = " + 0 + " AND " + COLUMN_NAME_USER_UNIQUE_ID
                + " = '" + userUniqueID + "' ";
        SQLiteDatabase sqLiteDatabase = this.getReadableDatabase();
        Cursor cursor = null;
        try {
            cursor = sqLiteDatabase.rawQuery(selectQuery, null);

            // looping through all rows and adding to list
            if (cursor.moveToFirst()) {
                do {
                    Card card = new Card();
                    String ID = cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_ID));
                    if (!TextUtils.isEmpty(ID) && TextUtils.isDigitsOnly(ID)) {
                        card.setId(Integer.parseInt(ID));
                    }
                    String cardID = cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_ID));
                    if (!TextUtils.isEmpty(cardID) && TextUtils.isDigitsOnly(cardID)) {
                        card.setCardId(Integer.parseInt(cardID));
                    }

                    card.setName(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_NAME)));
                    card.setUsername(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_USERNAME)));
                    card.setPhoneNumber(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_PHONE_NUMBER)));
                    card.setCountryCode(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_COUNTRY_CODE)));
                    card.setCountryName(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_COUNTRY_NAME)));
                    card.setCompany(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_COMPANY)));
                    card.setPosition(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_POSITION)));
                    card.setCompanyAddress(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_COMPANY_ADDRESS)));
                    card.setTags(new Gson().<RealmList<String>>fromJson(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_TAGS)), new TypeToken<RealmList<String>>() {
                    }.getType()));
                    card.setNotes(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_NOTES)));
                    card.setStatus(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_STATUS)));
                    card.setImageUrl(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_IMAGE_URL)));
                    card.setCompanyDescription(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_COMPANY_DESCRIPTION)));
                    card.setSellingInterests(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_SELLING_INTERESTS)));
                    card.setBuyingInterests(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_BUYING_INTERESTS)));
                    card.setCreatedAt(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_CREATED_AT)));
                    card.setLastModifiedAt(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_LAST_MODIFIED_AT)));
                    card.setConfirmedAt(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_CONFIRMED_AT)));
                    card.setSampleCardId(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_SC_ID)) != null ? Integer.parseInt(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_SC_ID))) : 0);
                    card.setNonSampleCard(Integer.parseInt(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_IS_NON_SC))) == 1);
                    card.setNonSampleCardID(cursor.getInt(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_CARD_NON_SC_ID)));
                    card.setShowIdentifier(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_EVENT_IDENTIFIER)));
                    card.setUuId(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_UUID)));
                    card.setExtraFields(new Gson().fromJson(cursor.getString(cursor.getColumnIndex(Constant.SampleCard.COLUMN_NAME_EXTRA_FIELDS)), ExtraFields.class));
                    cardArrayList.add(card);
                } while (cursor.moveToNext());
            }
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }

        return cardArrayList;
    }
}
