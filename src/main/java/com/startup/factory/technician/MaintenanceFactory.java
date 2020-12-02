package com.startup.factory.technician;

import com.startup.entity.technician.Maintenance;
import com.startup.entity.technician.MaintenanceProf;

import static com.startup.util.Amr.generateId;

/**
 * @author: Christ Amour NM
 * Desc: MaintenanceFactory
 * Date: 30 June 2020
 */

public class MaintenanceFactory {

    public static Maintenance buildMaintenance(String name, String lastname, String profession
    , String emailm, String gender, String phonenumber){
        return new Maintenance.Builder().maintenanceId(generateId())
                .name(name)
                .phonenumber(phonenumber)
                .emailm(emailm)
                .gender(gender)
                .profession(profession)
                .lastname(lastname)
                .build();
    }
}
