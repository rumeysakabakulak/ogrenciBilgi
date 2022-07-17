public class OgrenciBilgiSistemi {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut Hoca" , "TRH", "0000000000");
        Teacher t2 = new Teacher("Graham Bell", "FZK" , "555");
        Teacher t3 = new Teacher("külyutmaz", "BİO", "111");

        Course tarih = new Course("tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("fizik", "fzk102", "FZK");
        fizik.addTeacher(t2);

        Course bio = new Course("Biyoloji", "101", "BİO");
        bio.addTeacher(t3);


        Student s1 = new Student("Şaban", "123", "4", tarih, fizik, bio);
        s1.addBulkExamNote(100,70,50);
        s1.isPass();

        Student s2 = new Student("Necmi", "444", "4", tarih, fizik, bio);
        s2.addBulkExamNote(50,30,70);
        s2.isPass();

    }
}
