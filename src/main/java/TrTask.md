## Course Sınıfı

**Nitelikler:**

- `name`: Kurs adı
- `code`: Kurs kodu
- `prefix`: Kurs öneki
- `note`: Kurs notu
- `Teacher`: Kursun öğretmeni

**Metotlar:**

- `Course()`: Kurs sınıfının kurucu metodu.
- `addTeacher()`: Kursa bir öğretmen eklemek için kullanılır.
- `printTeacher()`: Kursun öğretmen bilgilerini yazdırmak için kullanılır.

---

## Teacher Sınıfı

**Nitelikler:**

- `name`: Öğretmen adı
- `mpno`: Öğretmen telefon numarası
- `branch`: Öğretmenin branşı

**Metotlar:**

- `Teacher()`: Öğretmen sınıfının kurucu metodu.

---

## Student Sınıfı

**Nitelikler:**

- `name`: Öğrenci adı
- `stuNo`: Öğrenci numarası
- `classes`: Öğrencinin sınıfı
- `course1`, `course2`, `course3`: Öğrencinin aldığı kurslar
- `avarage`: Öğrencinin not ortalaması
- `isPass`: Öğrencinin dersi geçip geçmediği

**Metotlar:**

- `Student()`: Öğrenci sınıfının kurucu metodu.
- `addBulkExamNote()`: Öğrenciye toplu sınav notları eklemek için kullanılır.
- `isPass()`: Öğrencinin dersi geçip geçmediğini kontrol etmek için kullanılır.
- `calcAvarage()`: Öğrencinin not ortalamasını hesaplamak için kullanılır.
- `printNote()`: Öğrencinin notlarını yazdırmak için kullanılır.**
