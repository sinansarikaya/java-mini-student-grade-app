public class Course {
    String name;
    String code;
    String prefix;
    int note;
    Teacher teacher;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        int note = 0;
    }
    public void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
            printTeacher();
        } else {
            System.out.println("Öğretmen ve ders bölümleri uyuşmuyor!");
        }

    }
    public void printTeacher(){
        this.teacher.print();
    }
}
