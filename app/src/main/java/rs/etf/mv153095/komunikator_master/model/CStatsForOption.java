package rs.etf.mv153095.komunikator_master.model;

import com.orm.SugarRecord;

import java.util.List;

/**
 * Created by Verica Milanovic on 24.01.2016..
 */
public class CStatsForOption extends SugarRecord {
    Integer allClicks;
    Long lastClick;

    public CStatsForOption(Integer allClicks, Long lastClick) {
        this.allClicks = allClicks;
        this.lastClick = lastClick;
    }

    public CStatsForOption() {
    }


    List<COptionNewSettingsAndStats> getCOptionNewSettingsAndStats() {
        return COptionNewSettingsAndStats.find(COptionNewSettingsAndStats.class,
                "statsForOption = ? or statsForSettings = ?", new String(getId().toString()),
                new String(getId().toString()));
    }
}
