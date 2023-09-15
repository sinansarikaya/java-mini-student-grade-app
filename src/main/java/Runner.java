public class Runner {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut", "555444333", "TRH");
        Teacher t2 = new Teacher("Kemal", "555444333", "FZK");
        Teacher t3 = new Teacher("CEMAL", "555444333", "BIO");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course biyo = new Course("Fizik", "102", "BIO");
        biyo.addTeacher(t3);

        Student s1 = new Student("Ahmet","234", "4", tarih, fizik, biyo);
        s1.addBulkExamNote(100,78,50);
        s1.isPass();

        Student s2 = new Student("Mehmet","324", "4", tarih, fizik, biyo);
        s2.addBulkExamNote(50,30,70);
        s2.isPass();
    }
}
