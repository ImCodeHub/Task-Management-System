package com.TaskManagement.Task.Management.System.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TaskManagement.Task.Management.System.Entity.AddAdminRequest;
import com.TaskManagement.Task.Management.System.Service.AdminService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class TaskManagementController {
    
    @Autowired
    AdminService adminService;
    
    @PostMapping("/addAdmin")
    public ResponseEntity<String> addPerson(@RequestBody AddAdminRequest Admin){
        String response = adminService.addAdmin(Admin);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

}
