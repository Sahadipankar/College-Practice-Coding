CREATE DATABASE College_Practice;

USE COLLEGE_PRACTICE;

SELECT 
    *
FROM
    STUD_MEMBER;

CREATE TABLE STUD_MEMBER (
    Roll_no VARCHAR(16),
    Name VARCHAR(50),
    Dept_id INT,
    Sem INT,
    Contact_no INT,
    Gender VARCHAR(10)
);

INSERT INTO stud_member (Roll_no, Name, Dept_id, Sem, Contact_No, Gender) 
VALUES ("BWU/BIT/19/01", "Ankur Das", 1, 1, 271210011, "Male");


INSERT INTO stud_member (Roll_no, Name, Dept_id, Sem, Contact_No, Gender) 
VALUES 
	("BWU/BIT/19/02", "Kamal Saha", 1, 1, 85696556, "Male"),
    ("BWU/BIT/19/03", "Ankita Banerjee", 1, 1, 45255215, "Female"),
    ("BWU/BEE/19/01", "Kamal Nandy", 2, 3, 59622371, "Male"),
    ("BWU/BCE/19/08", "Amit Saha", 3, 3, 45366767, "Male"),
    ("BWU/BEE/19/14", "Avijit Ghosh", 2, 1, 32327643, "Male"),
    ("BWU/BEE/19/09", "Ganesh Sill", 2, 3, 12424443, "Male"),
    ("BWU/BCE/19/05", "Sheta Thakur", 3, 1, 12427644, "Female"),
    ("BWU/BCE/19/12", "Puja Patra", 3, 3, 64634289, "Female"),
    ("BWU/BEE/19/15", "Kamal Halder", 2, 3, 32862345, "Male"),
    ("BWU/BME/19/06", "Kiran Das", 5, 1, 25742678, "Male");


SET SQL_SAFE_UPDATES = 1;	-- 0 To Disable Safe Update Mode and 1 to Enable to UPDATE rows


UPDATE stud_member 
SET 
    Mobile_No = 271210015
WHERE
    Roll_no = 'BWU/BIT/19/01';
    
ALTER TABLE stud_member
CHANGE COLUMN Contact_No Mobile_No INT;

ALTER TABLE stud_member
ADD PRIMARY KEY (Roll_no);


-- Find duplicates in Roll_no
SELECT 
    Roll_no, COUNT(*)
FROM
    stud_member
GROUP BY Roll_no
HAVING COUNT(*) > 1;

-- To delete a duplicate entry, keeping only one
DELETE FROM stud_member 
WHERE
    Roll_no = 'BWU/BIT/19/01' LIMIT 1;

-- Adding Roll_no as the primary key
ALTER TABLE stud_member
ADD PRIMARY KEY (Roll_no);

ALTER TABLE stud_member
CHANGE COLUMN Roll_no Roll_No VARCHAR(16);


-- Select names and mobile numbers
SELECT Name, Mobile_No FROM stud_member;


-- Create STUD_DETAILS table with data from STUD_MEMBER
CREATE TABLE stud_details AS 
SELECT * FROM stud_member;


-- Rename Mobile_No to Ph_No in stud_details
ALTER TABLE stud_details 
RENAME COLUMN Mobile_No TO Ph_No;


SELECT * FROM stud_details;


-- Update phone number for Puja Patra
UPDATE stud_details
SET Ph_No = 033255666
WHERE Name = 'Puja Patra';


-- Attempt to insert a record without Roll_no (will fail due to primary key constraint)
INSERT INTO stud_member (Name, Dept_id, Sem, Mobile_No, Gender)
VALUES ('New Student', 1, 1, 1234567890, 'M');


-- Select students with names starting with A
SELECT * FROM stud_member 
WHERE Name LIKE 'A%';


-- Select male students
SELECT * FROM stud_member 
WHERE Gender = 'Male';


-- Select students in semester 3
SELECT * FROM stud_member 
WHERE Sem = 3;


-- Select female students ordered by name
SELECT * FROM stud_member 
WHERE Gender = 'Female' 
ORDER BY Name;


-- Select students whose names start with A and are at least 5 characters long
SELECT Name FROM stud_member 
WHERE Name LIKE 'A%' AND LENGTH(Name) >= 5;


-- Extract numeric part from Roll_no
SELECT SUBSTRING(Roll_no, 9) AS Numeric_Roll 
FROM stud_member 
WHERE Name = 'Avijit Ghosh';


-- Create DEPARTMENT table
CREATE TABLE Department (
    Dept_id INT,
    Dept_name VARCHAR(20)
);


ALTER TABLE department 
CHANGE COLUMN Dept_name Dept_Name VARCHAR(50);


select * from Department;


-- Insert data into department table
INSERT INTO department (Dept_id, Dept_name) 
VALUES 
(1, 'Information Technology'),
(2, 'Electrical'),
(3, 'Civil'),
(4, 'Mechanical'),
(5, 'Electronics');


-- Add Dept_loc column
ALTER TABLE department 
ADD Dept_Loc VARCHAR(20);


-- Update Dept_loc for each department
UPDATE department 
SET Dept_loc = 'Kolkata'
WHERE Dept_id IN (1, 4); -- Information Technology and Mechanical

UPDATE department 
SET Dept_loc = 'Barasat'
WHERE Dept_id IN (2, 3, 5); -- Electrical, Civil, and Electronics


-- Set Dept_id as primary key
ALTER TABLE department 
ADD CONSTRAINT pk_dept PRIMARY KEY (Dept_id);


-- Add foreign key constraint in stud_member
ALTER TABLE stud_member 
ADD CONSTRAINT fk_dept_id FOREIGN KEY (Dept_id) 
REFERENCES department(Dept_id);


TRUNCATE TABLE department;
DROP TABLE department;


-- Remove the primary key constraint from the department table
ALTER TABLE department DROP PRIMARY KEY;
ALTER TABLE stud_member DROP FOREIGN KEY fk_dept_id;
ALTER TABLE department DROP COLUMN Dept_Loc;


-- Select students in Information Technology department
SELECT Name, Roll_no FROM stud_member 
WHERE Dept_id = (SELECT Dept_id FROM department WHERE Dept_name = 'Information Technology');


-- Select all department names
SELECT Dept_name FROM department;


-- Find department of Amit Saha
SELECT Dept_name FROM department 
WHERE Dept_id = (SELECT Dept_id FROM stud_member WHERE Name = 'Amit Saha');


-- Select students from Kolkata branch
SELECT Name, Roll_no FROM stud_member 
WHERE Dept_id IN (SELECT Dept_id FROM department WHERE Dept_loc = 'stud_detailsstud_detailsstud_detailsstud_memberKolkata');


-- Select students in Information Technology
SELECT Name, Roll_no FROM stud_member 
WHERE Dept_id = 1;


-- Attempt to delete Electronics department
DELETE FROM department 
WHERE Dept_name = 'Electronics';

    
select * from department;
select * from stud_details;
select * from stud_member;