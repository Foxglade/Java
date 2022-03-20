package com.example.Kasperi.Service;
import java.util.ArrayList;
import java.util.List;
import com.example.Kasperi.Data.CourseManager;
import org.springframework.stereotype.Service;
@Service
public class Services {
    private List<CourseManager> courses = new ArrayList<>();
    
    public void addCourse(CourseManager course){
       
        courses.add(course);
    }

    public List<CourseManager> getCourses(){
       
        return new ArrayList<>(courses);
    }

    public List<CourseManager> getCoursesByOppilas(String Oppilas){
        List<CourseManager> foundCourses = new ArrayList<>();
        
        for(CourseManager b : courses){
            if(b.getOppilas().equals(Oppilas)){
                foundCourses.add(b);
            }
        }

        return foundCourses;
    }
}
