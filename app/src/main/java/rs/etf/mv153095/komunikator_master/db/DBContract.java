package rs.etf.mv153095.komunikator_master.db;

import android.provider.BaseColumns;

/**
 * Created by Verica Milanovic on 09.01.2016..
 */
public final class DBContract {
    public DBContract() {
    }

    // tabela za admina
    public static abstract class ComAdmin implements BaseColumns {
        // ime tabele
        public static final String TABLE_NAME = "com_admin";

        // password za prelazak u ADMIN rezim rada
        public static final String COLUMN_NAME_PASSWORD = "password";

        // profili usera koji pripadaju jednom adminu se uvezuju preko vezne tabele!!!

        // spisak svih kolona tabele
        public static final String[] COLUMNS = {_ID,
                COLUMN_NAME_PASSWORD};

    }

    // tabela za usera
    public static abstract class ComUser implements BaseColumns {
        // ime tabele
        public static final String TABLE_NAME = "com_user";

        // ime usera
        public static final String COLUMN_NAME_FIRST_NAME = "first_name";
        // prezime usera
        public static final String COLUMN_NAME_LAST_NAME = "last_name";

        // opcije usera se uvezuju preko vezne tabele!!!

        // spisak svih kolona tabele
        public static final String[] COLUMNS = {_ID,
                COLUMN_NAME_FIRST_NAME,
                COLUMN_NAME_LAST_NAME};
    }

    // opcija u komunikatoru
    public static abstract class ComOption implements BaseColumns {
        // ime tabele
        public static final String TABLE_NAME = "com_option";
        // ime opcije
        public static final String COLUMN_NAME_NAME = "name";
        // opis opcije - tekst finalne opcije
        public static final String COLUMN_NAME_DESCRIPTION = "description";
        // slika opcije
        public static final String COLUMN_NAME_IMG = "img";
        // zvuk opcije
        public static final String COLUMN_NAME_VOICE = "voice";

        // vlasnik - ako je sistem onda je ovo polje 0, a uvezivanje ide preko vezne tabele
        //public static final String COLUMN_NAME_OWNER = "owner";
        // new setting ide preko vezne tabele
        //public static final String COLUMN_NAME_NEW_SETTINGS = "new_settings";
        //public static final String COLUMN_NAME_IS_DEFAULT = "is_default";

        // da li je opcija krajnja
        public static final String COLUMN_NAME_IS_FINAL = "is_final";

        // statistika ide preko vezne tabele
        //public static final String COLUMN_NAME_STAT = "stat";

        // spisak svih kolona tabele
        public static final String[] COLUMNS = {_ID,
                COLUMN_NAME_NAME,
                COLUMN_NAME_DESCRIPTION,
                COLUMN_NAME_IMG,
                COLUMN_NAME_VOICE,
                //COLUMN_NAME_OWNER,
                //COLUMN_NAME_NEW_SETTINGS,
                //COLUMN_NAME_IS_DEFAULT,
                COLUMN_NAME_IS_FINAL};
        //COLUMN_NAME_STAT};
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
