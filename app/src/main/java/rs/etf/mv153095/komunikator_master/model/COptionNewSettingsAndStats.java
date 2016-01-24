package rs.etf.mv153095.komunikator_master.model;

import com.orm.SugarRecord;
import com.orm.dsl.NotNull;

/**
 * Created by Verica Milanovic on 24.01.2016..
 */
public class COptionNewSettingsAndStats extends SugarRecord {
    @NotNull
    COption option;
    COption new_settings;
    @NotNull
    CUser owner;
    CStatsForOption statsForOption;
    CStatsForOption statsForSettings;

    public COptionNewSettingsAndStats() {
    }


}
