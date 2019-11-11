package com.gmail.masonashment.tasktimer;

import android.provider.BaseColumns;

public class TaskContract {

    static final String TABLE_NAME = "Tasks";

    // Tasks fields
    public static class Columns {
        public static final String _ID = BaseColumns._ID;
        public static final String TASKS_NAME = "Name";
        public static final String TASKS_DESCRIPTION = "Description";
        public static final String TASKS_SORTORDER = "SortOrder";

        private Columns() {
            //private to prevent instantiation
        }
    }
}
