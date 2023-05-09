package StudentDomen;

import java.util.Iterator;
import java.util.List;
 
public class StudentGroup implements Iterable<Student>, Comparable<Student> {
    private List<Student> students;

    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>(){
            private int index = 0;
            @Override
            public boolean hasNext() {
               return index<students.size();
            }
            @Override
            public Student next() {
                if(!hasNext())
                {
                    return null;
                }
                //counter++;
                return students.get(index++);        
            }

        };
    }

    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }


    // @Override
    // public int compareTo(Student o) {
        
    //     System.out.println(super.getFirstName()+" - "+o.getFirstName());
    //      if(super.getAge()==o.getAge())
    //      {
    //         if(this.studentID==o.studentID)
    //         {
    //             return 0;
    //         }
    //         if(this.studentID<o.studentID)
    //         {
    //             return -1;
    //         }
    //         return 1;
    //      } 
    //      if(super.getAge()<o.getAge())
    //      {
    //         return -1;
    //      }   
    //      return 1;
    // }
    
    
}
