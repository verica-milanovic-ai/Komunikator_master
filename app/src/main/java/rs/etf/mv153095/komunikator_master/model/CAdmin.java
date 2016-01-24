package rs.etf.mv153095.komunikator_master.model;

import com.orm.SugarRecord;

import java.util.List;

/**
 * Created by Verica Milanovic on 24.01.2016..
 */
public class CAdmin extends SugarRecord {
    String password;

    public CAdmin() {
    }

    public CAdmin(String password) {
        this.password = password;
    }

    List<CUser> getCUsers() {
        return CUser.find(CUser.class, "admin = ?", new String(getId().toString()));
    }
}
