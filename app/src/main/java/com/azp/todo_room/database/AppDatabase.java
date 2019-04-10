package com.azp.todo_room.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.azp.todo_room.Entity.Task;
import com.azp.todo_room.dao.TaskDao;

@Database(entities = {Task.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract TaskDao taskDao();
}
