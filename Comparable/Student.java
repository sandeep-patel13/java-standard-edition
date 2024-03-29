
public class Student implements Comparable<Student>{
    
    int marks;
    String name;



    public Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }



    @Override
    public String toString() {
        return "Student [marks=" + marks + ", name=" + name + "]";
    }



    public int getMarks() {
        return marks;
    }



    public void setMarks(int marks) {
        this.marks = marks;
    }



    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Student obj) {

        // return this.marks - obj.marks ; ascending 
        return obj.marks - this.marks; //descending

    }

}
