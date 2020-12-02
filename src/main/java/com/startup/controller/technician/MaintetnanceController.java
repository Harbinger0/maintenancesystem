package com.startup.controller.technician;
import com.startup.entity.technician.Maintenance;
import com.startup.factory.technician.MaintenanceFactory;
import com.startup.service.technician.impl.MaintenanceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/maintenance")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MaintetnanceController {

    @Autowired
    private MaintenanceServiceImpl maintenanceService;

    @PostMapping("/create")
    @CrossOrigin(origins = "http://localhost:4200")
    public Maintenance create(@RequestBody Maintenance maintenance){
        Maintenance newMaintenance = MaintenanceFactory.buildMaintenance(maintenance.getName(), maintenance.getLastname(),
                maintenance.getProfession(), maintenance.getEmailm(), maintenance.getGender(), maintenance.getPhonenumber());
        return maintenanceService.create(newMaintenance);
    }


    @GetMapping("/read/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public Maintenance read(@PathVariable String id){
        return maintenanceService.read(id);
    }

    @PostMapping("/update")
    @CrossOrigin(origins = "http://localhost:4200")
    public Maintenance update(@RequestBody Maintenance maintenance){
        return maintenanceService.update(maintenance);
    }

    @GetMapping("/all")
    @CrossOrigin(origins = "http://localhost:4200")
    public Set<Maintenance> getAll(){
        return maintenanceService.getAll();
    }

    @DeleteMapping("/delete/{id}")
    @CrossOrigin(origins = "http://localhost:4200")
    public boolean delete(@PathVariable String id){
        return maintenanceService.delete(id);
    }


}
