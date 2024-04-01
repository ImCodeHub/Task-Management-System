package com.TaskManagement.Task.Management.System.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.TaskManagement.Task.Management.System.Model.AddTask;
import com.TaskManagement.Task.Management.System.Model.ManagerTaskInfo;
import com.TaskManagement.Task.Management.System.TaskServiceImpl.TaskServiceImpl;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@CrossOrigin
@RestController
@RequestMapping("/task")
public class TaskInfoController {

    @Autowired
    TaskServiceImpl taskServiceImpl;
    
    //to add new task and assign it.
    @PostMapping("/addTask")
    public ResponseEntity<String> task(@RequestBody AddTask task){
        String response = taskServiceImpl.addTask(task);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    //get the task by specific manager by managerId 
    @GetMapping("/getTask/{managerId}")
    public ResponseEntity<List<ManagerTaskInfo>> getTask(@PathVariable Long managerId){
        
        return new ResponseEntity<>(taskServiceImpl.getManagerTask(managerId),HttpStatus.FOUND);
    }
    
    
    
}
