package com.teligen.handler;

import com.teligen.entity.Student;
import com.teligen.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentHandler {

    @Autowired
    private StudentRepository studentRepository;

    @Value("${server.port}")
    private String index;

    @GetMapping("/findAll")
    public Collection<Student>findAll(){
        return studentRepository.findAll();
    }

    //传参数
    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") long id){
        return studentRepository.findById(id);
    }

    //传json用 requestbody
    @PostMapping("/save")
    public void save(@RequestBody Student student){
         studentRepository.saveOrUpdate(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student){
         studentRepository.saveOrUpdate(student);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable("id")long id){
        studentRepository.deleteById(id);
    }

    @GetMapping("/index")
    public String index(){
        return "当前的服务端口:"+this.index;
    }

}

