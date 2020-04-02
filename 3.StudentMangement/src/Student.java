import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private double agvMark;
    private String gender;

    public Student() {
    }

    public Student(int id, String name, double agvMark, String gender) {
        this.id = id;
        this.name = name;
        this.agvMark = agvMark;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAgvMark() {
        return agvMark;
    }

    public void setAgvMark(double agvMark) {
        this.agvMark = agvMark;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void displayStudent(){
        System.out.printf("%-5d%-11s%-15s%-3.1f\n",this.id,this.gender,this.name,this.agvMark);
    }


    Scanner input = new Scanner(System.in);
    public void inputNewId(){
        System.out.print("Nhap vao ID sinh vien : ");
        setId(input.nextInt());
        input.nextLine();
    }
    public void inputNewName(){
        System.out.print("Nhap vao Ten sinh vien : ");
        setName(input.nextLine());
    }
    public void inputNewAvgMark(){
        System.out.print("Nhap vao Diem cua sinh vien : ");
        setAgvMark(input.nextFloat());
        input.nextLine();
    }
    public void inputNewGender(){
        System.out.print("Nhap vao Gioi tinh cua sinh vien : ");
        setGender(input.nextLine());
    }
}
