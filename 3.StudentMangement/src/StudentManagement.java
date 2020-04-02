import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    ArrayList<Student> students = new ArrayList<>();
    private int idToChange = -1;
    private int idToDelete = -1;
    private int idToFind = -1;
    private String nameToFind = "";

    public void inputStudent() {
        Student student1 = new Student(1, "Nguyen", 5.1, "Nam");
        students.add(student1);
        Student student2 = new Student(2, "Hoang", 8.0, "Nu");
        students.add(student2);
        Student student3 = new Student(3, "Vu", 7.4, "Nu");
        students.add(student3);
        Student student4 = new Student(4, "Truong", 9.1, "Nam");
        students.add(student4);
    }

    public void displayTitleOfList() {
        System.out.printf("%-5s%-11s%-15s%-15s\n", "ID", "GENDER", "NAME", "AVG-MARK");
    }

    public void displayStudentList() {
        System.out.println("Danh sach sinh vien hien tai : ");
        displayTitleOfList();
        for (Student student : students) {
            student.displayStudent();
        }
    }

    //Them sinh vien
    public void addNewStudent() {
        students.add(inputInfoANewStudent());
    }

    public Student inputInfoANewStudent() {
        Student newStudent = new Student();
        newStudent.inputNewId();
        newStudent.inputNewName();
        newStudent.inputNewAvgMark();
        newStudent.inputNewGender();
        return newStudent;
    }

    //Nhap Id cua sinh vien muon thao tac tu ban phim
    public void getIdFromUserToAccess() {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ID cua sinh vien de thuc hien : ");
        idToChange = input.nextInt()-1;
        idToDelete = idToChange;
        idToFind = idToChange;
    }

    //Nhap Ten cua sinh vien muon thao tac tu ban phim
    public void getNameFromUserToAccess() {
        System.out.print("Nhap Ten cua sinh vien muon tim : ");
        Scanner input = new Scanner(System.in);
        nameToFind = input.nextLine();
    }

    //Xoa Sinh Vien
    public void deleteStudent() {
        System.out.println("Can xoa thong tin sinh vien ?");
        getIdFromUserToAccess();
        students.remove(idToDelete);
    }

    //Thay doi thong tin
    public void changeInfoStudent() {
        System.out.println("Can sua thong tin sinh vien nao ?");
        getIdFromUserToAccess();
        students.set(idToChange, studentChangeTo());
    }

    public Student studentChangeTo() {
        System.out.println("Nhap vao thong tin moi cua sinh vien de thay doi:");
        Student studentChangeTo = new Student();
        studentChangeTo.setId(students.get(idToChange).getId());
        studentChangeTo.inputNewName();
        studentChangeTo.inputNewAvgMark();
        studentChangeTo.inputNewGender();
        return studentChangeTo;
    }

    //Tim bang Id
    public Student findStudentViaId() {
        Student foundOutStudentViaId = null;

        getIdFromUserToAccess();

        for (Student student : students) {
            if (student.getId() == idToFind + 1) {
                foundOutStudentViaId = student;
                break;
            }
        }
        return foundOutStudentViaId;
    }

    //Tim bang Ten
    public Student findStudentViaName() {
        Student foundOutStudentViaName = null;

        getNameFromUserToAccess();

        for (Student student : students) {
            if (student.getName().contentEquals(nameToFind)) {
                foundOutStudentViaName = student;
            }
        }
        return foundOutStudentViaName;
    }

    public void displayAfterFind(Student student) {
        if (isFindOutStudent(student)) {
            System.out.println("Sinh vien tim duoc la : ");
            displayTitleOfList();
            student.displayStudent();
        } else {
            System.out.println("Khong tim thay nhan vien");
        }
    }

    public boolean isFindOutStudent(Student student) {
        boolean concludeIsFindOut = false;
        if (student != null) {
            concludeIsFindOut = true;
        }
        return concludeIsFindOut;
    }

    //Hien thi Sinh vien Nu
    ArrayList<Student> femaleList = new ArrayList<>();
    public boolean isFemale(Student student) {
        boolean concludeIsFemale = false;
        if (student.getGender().contentEquals("Nu")) {
            concludeIsFemale = true;
        }
        return concludeIsFemale;
    }

    public void addFemaleToList() {
        for (Student student : students) {
            if (isFemale(student)) {
                femaleList.add(student);
            }
        }
    }

    public void displayFemaleList(){
        addFemaleToList();
        displayTitleOfList();
        for (Student student : femaleList) {
            student.displayStudent();
        }
    }

    //Hien thi Sinh vien Nhan Hoc bong
    ArrayList<Student> scholarshipList = new ArrayList<>();
    public boolean canReceiveScholarship(Student student) {
        boolean concludeScholarship = false;
        if (student.getAgvMark() >=8.0) {
            concludeScholarship = true;
        }
        return concludeScholarship;
    }

    public void addToSchorlapshipList() {
        for (Student student : students) {
            if (canReceiveScholarship(student)) {
                scholarshipList.add(student);
            }
        }
    }

    public void displayScholarshipList(){
        addToSchorlapshipList();
        displayTitleOfList();
        for (Student student : scholarshipList) {
            student.displayStudent();
        }
    }
}
