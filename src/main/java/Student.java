public class Student {
    String name, stuNo, classes;
    Course c1, c2, c3;
    double average;
    boolean isPass;

    public Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    public void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
            this.isPass = true;
        } else {
            this.isPass = false;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
            this.isPass = true;
        } else {
            this.isPass = false;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
            this.isPass = true;
        } else {
            this.isPass = false;
        }
    }

    public void isPass() {
        System.out.println("================================");
        this.average = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
        if (this.average >= 55) {
            System.out.println("Sınıfı geçtiniz!");
        } else {
            System.out.println("Sınıfta kaldınız!");
        }
        printNote();
    }

    public void calcAvarage() {

    }

    public void printNote() {
        System.out.println(c1.name + " Notu\t" + c1.note);
        System.out.println(c2.name + " Notu\t" + c2.note);
        System.out.println(c3.name + " Notu\t" + c3.note);
        System.out.println("Ortalamanız : " + this.average);
    }

}
