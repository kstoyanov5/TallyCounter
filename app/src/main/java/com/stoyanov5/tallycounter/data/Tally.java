package com.stoyanov5.tallycounter.data;

/**
 * Created by B3f0r on 08-Feb-18.
 */

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Immutable model class for a Tally.
 */
@Entity(tableName = "tallies")
public final class Tally {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "entryid")
    private final String id;

    @NonNull
    @ColumnInfo(name = "counter")
    private int counter = 0;

    @Nullable
    @ColumnInfo(name = "name")
    private String Name;

    public Tally(@NonNull String id, @Nullable String name, @NonNull int counter){
        this.id = id;
        this.Name = name;
        this.counter = counter;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

}
