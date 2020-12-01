package com.example.vaibansh.newsapp.data.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.example.vaibansh.newsapp.models.Source;

import java.util.List;

@Dao
public interface SourcesDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void bulkInsert(List<Source> sources);

    @Query("SELECT * FROM sources")
    LiveData<List<Source>> getAllSources();
}
