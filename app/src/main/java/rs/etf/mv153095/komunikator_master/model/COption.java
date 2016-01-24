package rs.etf.mv153095.komunikator_master.model;

import com.orm.SugarRecord;

import java.util.List;

/**
 * Created by Verica Milanovic on 24.01.2016..
 */
public class COption extends SugarRecord {
    String name;
    String description;
    String img;
    String voice;
    Boolean is_final;
    Boolean is_alive;
    Boolean is_settings;

    public COption(String name, String description, String img, String voice,
                   Boolean is_final, Boolean is_alive, Boolean is_settings) {
        this.name = name;
        this.description = description;
        this.img = img;
        this.voice = voice;
        this.is_final = is_final;
        this.is_alive = is_alive;
        this.is_settings = is_settings;
    }


    public COption() {
    }

    List<COptionNewSettingsAndStats> getCOptionNewSettingsAndStats() {
        if (is_settings)
            return COptionNewSettingsAndStats.find(COptionNewSettingsAndStats.class,
                    "new_settings = ?", new String(getId().toString()));
        else
            return COptionNewSettingsAndStats.find(COptionNewSettingsAndStats.class,
                    "option = ?", new String(getId().toString()));
    }
}
