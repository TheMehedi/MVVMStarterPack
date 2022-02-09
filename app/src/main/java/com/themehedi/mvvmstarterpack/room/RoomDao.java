package com.themehedi.mvvmstarterpack.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;


import com.themehedi.mvvmstarterpack.model.dataModel.Divisions;

import java.util.List;

@Dao
public interface RoomDao {

    /*Division Start*/
    @Insert
    void insertDivision(Divisions divisions);

    @Insert
    void insertAllDivision(List<Divisions> divisionsList);

    @Query("SELECT * FROM Divisions")
    List<Divisions> getAllDivision();

    @Query("SELECT * FROM Divisions WHERE value =:value")
    List<Divisions> getDivisionByValue(int value);

    @Query("DELETE FROM Divisions WHERE value =:value")
    void deleteDivisionByValue(int value);

    @Query("DELETE FROM Divisions")
    void deleteAllDivision();

    @Query("UPDATE Divisions SET value = :value")
    void updateDivisionDataByValue(int value);
    /*Division End*/
}
