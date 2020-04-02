import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

public class Person {
    private String name;
    private String gender;
    private String birthDay;
    private String address;

    public Person() {
    }

    public Person(String name, String gender, String birthDay, String address) {
        this.name = name;
        this.gender = gender;
        this.birthDay = birthDay;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    Scanner input = new Scanner(System.in);

    public void inputName() {
        System.out.print("Nhap vao ten : ");
        this.name = input.nextLine();
    }

    public void inputGender() {
        System.out.print("Nhap vao gioi tinh : ");
        this.gender = input.nextLine();
    }

    public void inputAddress() {
        System.out.print("Nhap vao dia chi : ");
        this.address = input.nextLine();
    }

    public void inputBirthday() {
        System.out.print("Nhap vao ngay sinh : ");
        this.birthDay = input.nextLine();
    }

    public void displayName() {
        System.out.printf("Ten : %s\n", this.name);
    }

    public void displayGender() {
        System.out.printf("Gioi tinh : %s\n", this.gender);
    }

    public void displayBirthday() {
        System.out.printf("Ngay sinh : %s\n", this.birthDay);
    }

    public void displayAddress() {
        System.out.printf("Dia chi : %s\n", this.address);
    }
}
