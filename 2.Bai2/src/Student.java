import java.util.Scanner;

public class Student extends Person {
    private int id;
    private String email;
    private double averageMark;

    public Student() {
    }

    public Student(int id, String email, double averageMark) {
        this.id = id;
        this.email = email;
        this.averageMark = averageMark;
    }

    public Student(String name, String gender, String birthDay, String address, int id, String email, double averageMark) {
        super(name, gender, birthDay, address);
        this.id = id;
        this.email = email;
        this.averageMark = averageMark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    Scanner input = new Scanner(System.in);
    public void inputName() {
        System.out.print("Nhap vao ten : ");
        this.setName(input.nextLine());
    }

    public void inputGender() {
        System.out.print("Nhap vao gioi tinh : ");
        this.setGender(input.nextLine());
    }

    public void inputAddress() {
        System.out.print("Nhap vao dia chi : ");
        this.setAddress(input.nextLine());
    }

    public void inputBirthday() {
        System.out.print("Nhap vao ngay sinh : ");
        this.setBirthDay(input.nextLine());
    }

    public void inputId() {
        System.out.print("Nhap vao ID : ");
        this.id = input.nextInt();
        input.nextLine();
    }
    public void inputAverageMark() {
        System.out.print("Nhap vao Diem trung binh : ");
        this.averageMark = input.nextDouble();
        input.nextLine();
    }
    public void inputEmail() {
        System.out.print("Nhap vao Email : ");
        this.email = input.nextLine();
    }

    public void displayName() {
        System.out.printf("Ten : %s\n", this.getName());
    }

    public void displayGender() {
        System.out.printf("Gioi tinh : %s\n", this.getGender());
    }

    public void displayBirthday() {
        System.out.printf("Ngay sinh : %s\n", this.getBirthDay());
    }

    public void displayAddress() {
        System.out.printf("Dia chi : %s\n", this.getAddress());
    }

    public void displayId() {
        System.out.printf("Ma Sinh Vien : %d\n", this.id);
    }

    public void displayAverageMark() {
        System.out.printf("Diem trung binh : %-3.1f\n", this.averageMark);
    }

    public void displayEmail() {
        System.out.printf("Dia chi : %s\n", this.email);
    }

    public boolean willGetScholarship (){
        boolean result = false;
        if (this.averageMark >= 8.0){
            result = true;
        }
        return result;
    }

    public void concludeScholarship(){
        if (willGetScholarship()){
            System.out.print("Du dieu kien nhan hoc bong");
        }else {
            System.out.print("Khong du dieu kien nhan hoc bong");
        }
    }
}
