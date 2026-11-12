package com.spring.spring_rest.mapper;

import com.spring.spring_rest.dto.StudentDto;
import com.spring.spring_rest.entity.Student;

/**
 * StudentMapper.
 */
public class StudentMapper {

    //method will map Student to StudentDto
    public static StudentDto maptoStudentDto(Student theStudent){
        return new StudentDto(theStudent.getId(), 
                                theStudent.getFirstName(),
                                theStudent.getLastName(),
                                theStudent.getEmail());
    }

    //method will map StudentDto to Student
    public static Student maptoStudent(StudentDto theStudentDto){
        return new Student(theStudentDto.getId(),
                            theStudentDto.getFirstName(),
                            theStudentDto.getLastName(),
                            theStudentDto.getEmail());
    }
}
