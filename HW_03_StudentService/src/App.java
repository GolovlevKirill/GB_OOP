import java.net.NoRouteToHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.StudentSteam;
import StudentDomen.User;

public class App {
    public static void main(String[] args) throws Exception {
        User u1 = new User("Сергей","Иванов",25);
        Student s1 = new Student("Сергей", "Иванов", 22, (long)101);
        Student s2 = new Student("Андрей", "Сидоров", 22, (long)111);
        Student s3 = new Student("Иван", "Петров", 22, (long)121);
        Student s4 = new Student("Игорь", "Иванов", 23, (long)301);
        Student s5 = new Student("Даша", "Цветкова", 23, (long)171);
        Student s6 = new Student("Лена", "Незабудкина", 23, (long)104);

        List<Student> listStud = new ArrayList<Student>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);

        StudentGroup group = new StudentGroup(listStud);

        for(Student stud : group)
        {
            System.out.println(stud);
        }

        System.out.println("============= после сортировки =============");
        Collections.sort(group.getStudents());


        for(Student stud : group)
        {
            System.out.println(stud);
        }



        /**Начало домашнего задания */
        System.out.println();
        System.out.println("============= Вывод потока групп =============");

        /**Создание студентов для 2-й группы */
        Student s7 = new Student("Олег", "Иванов", 22, (long)133);
        Student s8 = new Student("Виктор", "Сидоров", 22, (long)444);
        Student s9 = new Student("Марат", "Петров", 22, (long)345);
        Student s10 = new Student("Марина", "Иванова", 23, (long)756);
    
        //создание списка для второй группы и добавление студентов в него
        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s7);
        listStud2.add(s8);
        listStud2.add(s9);
        listStud2.add(s10);
        

        StudentGroup group2 = new StudentGroup(listStud2);
        List<StudentGroup> listGroups = new ArrayList<StudentGroup>();

        listGroups.add(group);
        listGroups.add(group2);

        // Создание потока групп и передача в него групп
        StudentSteam steam = new StudentSteam(listGroups);

        // Вывод групп в консоль
        int temp = 1;
        for(StudentGroup groupSteam : steam )
        {
            System.out.println(temp + " группа");
            System.out.println(groupSteam.getStudents());
            System.out.println();
            temp++;
        }
    }
}
