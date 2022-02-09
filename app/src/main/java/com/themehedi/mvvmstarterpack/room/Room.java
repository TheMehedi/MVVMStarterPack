package com.themehedi.mvvmstarterpack.room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.themehedi.mvvmstarterpack.model.dataModel.Divisions;


@Database(entities = {
        Divisions.class
}, version = 1, exportSchema = false)
public abstract class Room extends RoomDatabase {

    public abstract RoomDao moaDao();

    private static volatile Room INSTANCE;

    public static Room getInstance(Context context) {

        if (INSTANCE == null) {
            synchronized (Room.class) {
                if (INSTANCE == null) {

                    //INSTANCE = Room.databaseBuilder(context.getApplicationContext(), TheRoom.class, "room_db").build();
                    INSTANCE = androidx.room.Room.databaseBuilder(context, Room.class, "moa_db")
                            .allowMainThreadQueries()
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}