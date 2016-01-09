package rs.etf.mv153095.komunikator_master.db;

import android.provider.BaseColumns;

/**
 * Created by Verica Milanovic on 09.01.2016..
 */
public final class DBContract {
    public DBContract() {
    }

    public static abstract class ComAdmin implements BaseColumns {
        public static final String TABLE_NAME = "com_admin";
        // public static final String COLUMN_NAME_ID = "_id";
        public static final String COLUMN_NAME_PASSWORD = "password";
        public static final String COLUMN_NAME_USERS = "users";

        public static final String[] COLUMNS = {_ID,
                COLUMN_NAME_PASSWORD,
                COLUMN_NAME_USERS};

    }

    public static abstract class ComUser implements BaseColumns {
        public static final String TABLE_NAME = "com_user";
        public static final String COLUMN_NAME_NAME = "name";
        public static final String COLUMN_NAME_LAST_NAME = "last_name";
        public static final String COLUMN_NAME_OPTIONS = "options";
        // public static final String COLUMN_NAME_ID = "_id";
        public static final String[] COLUMNS = {_ID,
                COLUMN_NAME_NAME,
                COLUMN_NAME_LAST_NAME,
                COLUMN_NAME_OPTIONS};
    }

    public static abstract class ComOption implements BaseColumns {
        public static final String TABLE_NAME = "com_option";
        public static final String COLUMN_NAME_NAME = "name";
        public static final String COLUMN_NAME_DESCRIPTION = "description";
        public static final String COLUMN_NAME_IMG = "img";
        public static final String COLUMN_NAME_VOICE = "voice";
        public static final String COLUMN_NAME_OWNER = "owner";
        public static final String COLUMN_NAME_NEW_SETTINGS = "new_settings";
        public static final String COLUMN_NAME_IS_DEFAULT = "is_default";
        public static final String COLUMN_NAME_IS_FINAL = "is_final";
        public static final String COLUMN_NAME_STAT = "stat";
        // public static final String COLUMN_NAME_ID = "_id";
        public static final String[] COLUMNS = {_ID,
                COLUMN_NAME_NAME,
                COLUMN_NAME_DESCRIPTION,
                COLUMN_NAME_IMG,
                COLUMN_NAME_VOICE,
                COLUMN_NAME_OWNER,
                COLUMN_NAME_NEW_SETTINGS,
                COLUMN_NAME_IS_DEFAULT,
                COLUMN_NAME_IS_FINAL,
                COLUMN_NAME_STAT};
    }

    public static abstract class ComNewOptionSettings implements BaseColumns {
        public static final String TABLE_NAME = "com_new_option_settings";
        public static final String COLUMN_NAME_NAME = "name";
        public static final String COLUMN_NAME_IMG = "img";
        public static final String COLUMN_NAME_VOICE = "voice";
        public static final String COLUMN_NAME_DESCRIPTION = "description";
        public static final String COLUMN_NAME_IS_ALIVE = "is_alive";
        public static final String COLUMN_IS_FINAL = "is_final";
        public static final String COLUMN_NAME_OWNER = "owner";
        public static final String[] COLUMNS = {_ID,
                COLUMN_NAME_NAME,
                COLUMN_NAME_IMG,
                COLUMN_NAME_VOICE,
                COLUMN_NAME_DESCRIPTION,
                COLUMN_NAME_IS_ALIVE,
                COLUMN_IS_FINAL,
                COLUMN_NAME_OWNER};
    }

    // TODO: add Stat Table... {lastClick, allClicks, ...}
}
