package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class RestTesting implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        RestTemplate restTemplate  = new RestTemplate();

        ResponseEntity<List<Student>> response = restTemplate.exchange(
                "http://10.51.10.111:1000/registrations",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Student>>(){});
        List<Student> students = response.getBody();

        for(Student student : students){
            System.out.println(student.toString());
        }

        System.err.println("Find One(GET)--------------------------------");

        Student student = restTemplate.getForObject(
                "http://10.51.10.111:1000/registrations",
                Student.class);
        System.out.println(student.toString());

        System.err.println("Creating(POST)______________________________");

        Student newStudent = new Student("Tobias",
                2);

       Student registerStudent = restTemplate.postForObject(
                "http://10.51.10.111:1000/registrations",
                newStudent, Student.class);
        System.out.println(registerStudent.toString());

        System.err.println("____________________________________");
        String registerStudentUrl = "http://10.51.10.111:1000/registrations"
                +registerStudent.getId()+"/students";




    }
}
