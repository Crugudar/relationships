package com.ironhack.relationships.repository;

import com.ironhack.relationships.model.Course;
import com.ironhack.relationships.model.Section;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private SectionRepository sectionRepository;

    @BeforeEach
    public void setUp() {
        List<Course> courses = courseRepository.saveAll(
                List.of(new Course("CS101", "Pociones"),
                        new Course("CS102", "Defensa contra las artes obscuras")
                )
        );
        List<Section> sections = sectionRepository.saveAll(
                List.of(new Section("CS101-A", Short.valueOf("100"), "Severus Snape", courses.get(0)),
                        new Section("CS101-B", Short.valueOf("100"), "Horace Slughorn ", courses.get(0))
                )
        );

    }

    @AfterEach
    public void tearDown() {
        sectionRepository.deleteAll();
        courseRepository.deleteAll();
    }

    @Test
    public void findById_ValidId_Course() {
        Optional<Course> course = courseRepository.findById("CS101");

        if (course.isPresent()) {
            assertEquals("Pociones", course.get().getCourseName());
            assertEquals(2, course.get().getSections().size());
        } else {
            fail("Course not found");
        }

    }



}