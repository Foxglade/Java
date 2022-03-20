package com.example.Kasperi.Controller;
import java.util.List;
import com.example.Kasperi.Data.CourseManager;
import com.example.Kasperi.Service.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @Autowired
    Services myServices;
    

    @GetMapping("courses")
    public List<CourseManager> getCourses()
    {
        return myServices.getCourses();

    }

    @GetMapping("courses/{Oppilas}")
    public List<CourseManager> getOppilasCourses(@PathVariable String Oppilas){
        
       
        
        return myServices.getCoursesByOppilas(Oppilas);
    }

    @PostMapping("addCourse")
    public String addCourse(@RequestBody CourseManager course){
        myServices.addCourse(course); 
        
        
        
        return "";
       
    }

    @PostMapping("addcourseinfo")
    public String addCourseInfo(@RequestParam String Oppilas,@RequestParam String Kurssi){
        myServices.addCourse(new CourseManager(Oppilas, Kurssi));
        
      
        
        return "";
    }
    
}
