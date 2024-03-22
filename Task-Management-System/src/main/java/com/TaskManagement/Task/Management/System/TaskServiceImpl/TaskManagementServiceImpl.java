package com.TaskManagement.Task.Management.System.TaskServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TaskManagement.Task.Management.System.Entity.AddAdminRequest;
import com.TaskManagement.Task.Management.System.Entity.TaskManagementAdmin;
import com.TaskManagement.Task.Management.System.Repository.TaskManagementRepository;
import com.TaskManagement.Task.Management.System.Service.AdminService;

@Service
public class TaskManagementServiceImpl implements AdminService {

    @Autowired
    private TaskManagementRepository taskRepository;

    // saving admin details inside database. 
    @Override
    public String addAdmin(AddAdminRequest admin) {
        TaskManagementAdmin obj = new TaskManagementAdmin(admin.getAdminName(),admin.getMobileNumber(),admin.getEmail(),admin.getPassword());
        taskRepository.save(obj);
        return "Admin saved Successfully";
    }
    
}
