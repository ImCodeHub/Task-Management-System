package com.TaskManagement.Task.Management.System.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TaskManagement.Task.Management.System.Entity.TaskManagementAdmin;
import com.TaskManagement.Task.Management.System.Service.AdminService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class TaskManagementController {
    
    @Autowired
    AdminService adminService;
    
    @PostMapping("/addAdmin")
    public ResponseEntity<TaskManagementAdmin> addPerson(@RequestBody TaskManagementAdmin Admin){
        TaskManagementAdmin person = adminService.addAdmin(Admin);
        return new ResponseEntity<>(person, HttpStatus.CREATED);
    }

}
