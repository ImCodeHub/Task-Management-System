package com.TaskManagement.Task.Management.System.TaskServiceImpl;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TaskManagement.Task.Management.System.Entity.TaskInfo;
import com.TaskManagement.Task.Management.System.Model.AddTask;
import com.TaskManagement.Task.Management.System.Model.ManagerTaskInfo;
import com.TaskManagement.Task.Management.System.Repository.TaskInfoRepo;
import com.TaskManagement.Task.Management.System.Service.TaskService;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskInfoRepo taskRepository;

    // to add a Task.
    @Override
    public String addTask(AddTask addTask) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try{
        Timestamp startDate = new Timestamp(sdf.parse(addTask.getStartDate()).getTime());

        Timestamp endDate = new Timestamp(sdf.parse(addTask.getEndDate()).getTime());
        TaskInfo taskinfo = new TaskInfo(addTask.getTaskName(),addTask.getDescription(),startDate,endDate,addTask.getStatus(),addTask.getAsignTo());
        taskRepository.save(taskinfo);
        return "Task successfully Added";
        } catch(Exception e){
            return "Task addition failed";
        }
    }

    // To get the specific task using specific id. 
    @Override
    public List<ManagerTaskInfo> getManagerTask(Long managerId) {
        List<ManagerTaskInfo> response = new ArrayList<>();
       List<TaskInfo> taskInfos = taskRepository.findByAsignTo(managerId);
       for (TaskInfo taskInfo : taskInfos) {
            ManagerTaskInfo managerTaskInfo = new ManagerTaskInfo();
            managerTaskInfo.setTaskName(taskInfo.getTaskName());
            managerTaskInfo.setDescription(taskInfo.getDescription());
            managerTaskInfo.setStartDate(taskInfo.getStartDate());
            managerTaskInfo.setEndDate(taskInfo.getEndDate());
            managerTaskInfo.setStatus(taskInfo.getStatus());
            response.add(managerTaskInfo);
       }
       return response;
    }

    
    // To update details the specific task using id. 
    @Override
    public String updateTask(Long taskId, AddTask task) {
        
        return "";
    }
    

}
