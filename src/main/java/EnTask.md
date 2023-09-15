## Course Class

**Attributes:**

- `name`: Course name
- `code`: Course code
- `prefix`: Course prefix
- `note`: Course note
- `Teacher`: Course teacher

**Methods:**

- `Course()`: Constructor method for the Course class.
- `addTeacher()`: Used to add a teacher to the course.
- `printTeacher()`: Used to print the teacher information for the course.

---

## Teacher Class

**Attributes:**

- `name`: Teacher name
- `mpno`: Teacher phone number
- `branch`: Teacher's field of expertise

**Methods:**

- `Teacher()`: Constructor method for the Teacher class.

---

## Student Class

**Attributes:**

- `name`: Student name
- `stuNo`: Student number
- `classes`: Student's class
- `course1`, `course2`, `course3`: Courses taken by the student
- `average`: Student's grade average
- `isPass`: Whether the student passed the course

**Methods:**

- `Student()`: Constructor method for the Student class.
- `addBulkExamNote()`: Used to add bulk exam grades to the student.
- `isPass()`: Used to check if the student passed the course.
- `calculateAverage()`: Used to calculate the student's grade average.
- `printNote()`: Used to print the student's grades.
