package rs.etf.mv153095.komunikator_master.model;

import com.orm.SugarRecord;
import com.orm.dsl.NotNull;

import java.util.List;

/**
 * Created by Verica Milanovic on 24.01.2016..
 */
public class CUser extends SugarRecord {
    @NotNull
    CAdmin admin;
    @NotNull
    String first_name;
    @NotNull
    String last_name;


    public CUser() {
    }

    public CUser(CAdmin admin, String first_name, String last_name) {
        this.admin = admin;
        this.first_name = first_name;
        this.last_name = last_name;
    }

    List<COptionNewSettingsAndStats> getCOptionNewSettingsAndStats() {
        return COptionNewSettingsAndStats.find(COptionNewSettingsAndStats.class,
                "owner = ?", new String(getId().toString()));
    }
}
