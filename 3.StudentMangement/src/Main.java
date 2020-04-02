import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentManagement studentManagement = new StudentManagement();
        studentManagement.inputStudent();
        studentManagement.displayStudentList();

        System.out.println();
        int selection;

        do {
            selection = getSelection(input);

            if (selection!=0) {
                switch (selection) {
                    case 1: {
                        System.out.println("--Them--");
                        studentManagement.addNewStudent();
                        studentManagement.displayStudentList();
                        break;
                    }
                    case 2: {
                        System.out.println("--Sua--");
                        studentManagement.changeInfoStudent();
                        studentManagement.displayStudentList();
                        break;
                    }
                    case 3: {
                        System.out.println("--Xoa--");
                        studentManagement.deleteStudent();
                        studentManagement.displayStudentList();
                        break;
                    }
                    case 4: {
                        System.out.println("--Tim bang ID--");
                        Student foundOutStudent = studentManagement.findStudentViaId();
                        studentManagement.displayAfterFind(foundOutStudent);
                        break;
                    }
                    case 5: {
                        System.out.println("--Tim bang Ten--");
                        Student foundOutStudent = studentManagement.findStudentViaName();
                        studentManagement.displayAfterFind(foundOutStudent);
                        break;
                    }
                    case 6: {
                        System.out.println("--Hien thi Sinh vien Nu--");
                        studentManagement.displayFemaleList();
                    }
                    case 7:
                        System.out.println("--Hien thi Sinh vien nhan Hoc Bong--");
                        studentManagement.displayScholarshipList();
                }
            } else {
                System.out.println("Exit!");
            }
        } while (selection != 0);
    }

    private static int getSelection(Scanner input) {
        int selection;
        System.out.println("Lua chon thao tac : \n" +
                "1. Them 1 Sinh vien moi\n" +
                "2. Sua thong tin Sinh vien\n" +
                "3. Xoa 1 Sinh vien\n" +
                "4. Tim kiem theo ID\n" +
                "5. Tim kiem theo Ten\n" +
                "6. Hien thi sinh vien Nu\n" +
                "7. Hien thi sinh vien Nhan hoc bong\n" +
                "0. Exit");
        System.out.print("Lua chon : ");
        selection = input.nextInt();
        return selection;
    }
}

