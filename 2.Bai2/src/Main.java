public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.inputId();
        student.inputName();
        student.inputGender();
        student.inputBirthday();
        student.inputEmail();
        student.inputAverageMark();
        student.inputAddress();

        System.out.println();
        System.out.println("====> HIEN THI THONG TIN SINH VIEN<====");
        student.displayId();
        student.displayName();
        student.displayGender();
        student.displayBirthday();
        student.displayEmail();
        student.displayAverageMark();
        student.displayAddress();

        student.concludeScholarship();
    }
}
