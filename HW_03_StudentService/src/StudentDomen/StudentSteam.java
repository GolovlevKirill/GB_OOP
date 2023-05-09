package StudentDomen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentSteam implements Iterable<StudentGroup>,  Comparable<StudentGroup>{
    int idStudentSteam;
    /**Создание списка учебных групп на потоке */
    private List<StudentGroup> studentGroups;
    
    // конструктор потока 
    public StudentSteam(List<StudentGroup> groups) {
        this.studentGroups = groups;
    }
    /** Получение списка групп */
    public List<StudentGroup> getGroups() {
        return studentGroups;
    }


    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>(){
            private int index = 0;
            @Override
            public boolean hasNext() {
               return index<studentGroups.size();
            }
            @Override
            public StudentGroup next() {
                if(!hasNext())
                {
                    return null;
                }
                //counter++;
                return studentGroups.get(index++);        
            }

        };
    }

    @Override
    public int compareTo(StudentGroup o) {
       
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }


}
