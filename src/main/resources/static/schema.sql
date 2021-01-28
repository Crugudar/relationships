DROP SCHEMA relationships;
CREATE SCHEMA relationships;
USE relationships;


CREATE TABLE house_assignment(
  id INT AUTO_INCREMENT NOT NULL,
  house VARCHAR(255),
  wing VARCHAR(255),
  assigned_bed INT,
  PRIMARY KEY(id)
);

CREATE TABLE student (
  id INT AUTO_INCREMENT NOT NULL,
  first_name VARCHAR(255),
  last_name VARCHAR(255),
  house_assignment_id INT UNIQUE,
  PRIMARY KEY(id),
  FOREIGN KEY (house_assignment_id) REFERENCES house_assignment(id)
);

SELECT * FROM student;
SELECT * FROM house_assignment;


CREATE TABLE faculty (
  id INT AUTO_INCREMENT NOT NULL,
  first_name VARCHAR(255),
  last_name VARCHAR(255),
  department VARCHAR(255),
  tenure BOOLEAN,
  PRIMARY KEY(id)
);

CREATE TABLE office(
  id INT AUTO_INCREMENT NOT NULL,
  room_number INT,
  building VARCHAR(255),
  faculty_id INT,
  PRIMARY KEY(id),
  FOREIGN KEY (faculty_id) REFERENCES faculty(id)
);


CREATE TABLE spell(
	id INT AUTO_INCREMENT NOT NULL,
    name VARCHAR(255),
    level VARCHAR(255),
    PRIMARY KEY(id)
);

CREATE TABLE students_casts_spells(
	student_id INT,
    spell_id INT,
    FOREIGN KEY (student_id) REFERENCES student(id),
    FOREIGN KEY (spell_id) REFERENCES spell(id)
 );


CREATE TABLE course(
    course_code VARCHAR(6) NOT NULL,
    course_name VARCHAR(255),
    PRIMARY KEY (course_code)
 );

CREATE TABLE section(
    id VARCHAR(8) NOT NULL,
    course_code VARCHAR(6),
    room_num SMALLINT,
    instructor VARCHAR(255),
    PRIMARY KEY (id),
    FOREIGN KEY (course_code) REFERENCES course(course_code)
 );