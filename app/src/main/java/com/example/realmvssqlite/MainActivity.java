package com.example.realmvssqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import java.util.ArrayList;

import io.realm.Realm;
import io.realm.RealmList;
import io.realm.RealmResults;

import static com.example.realmvssqlite.Constant.getRandomData;

public class MainActivity extends AppCompatActivity {

    private long startingTime;
    private long endingTime;
    private long recordedTimeDiff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Card card = getRandomData();

//        new Handler().post(new Runnable() {
//            @Override
//            public void run() {
//                SqliteDB db = new SqliteDB(MainActivity.this);
//
//                startingTime = System.currentTimeMillis();
//
//                ArrayList<Card> allCards = db.getAllCards(card.getUuId());
//
//                endingTime = System.currentTimeMillis();
//
//                recordedTimeDiff = endingTime - startingTime;
//
//                Log.e("Total Time Difference", String.valueOf(recordedTimeDiff));
//            }
//        });

        new Handler().post(new Runnable() {
            @Override
            public void run() {
                Realm.getDefaultInstance().executeTransaction(new Realm.Transaction() {
                    @Override
                    public void execute(Realm realm) {
                        startingTime = System.currentTimeMillis();

                        RealmResults<Card> allCards = realm.where(Card.class).equalTo("uuId", card.getUuId()).findAll();

                        RealmList<Card> results = new RealmList<>();

                        results.addAll(allCards.subList(0, allCards.size()));

                        endingTime = System.currentTimeMillis();

                        Log.e("Card Count", String.valueOf(results.size()));
                    }
                });

                recordedTimeDiff = endingTime - startingTime;

                Log.e("Total Time Difference", String.valueOf(recordedTimeDiff));
            }
        });
    }
}