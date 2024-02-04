package call_object_without_function;

class Student {
    private String name;
    private int rollNo;

    public Student(String n, int r) {
        name = n;
        rollNo = r;
    }

    public String toString(Object ob) {
        return name + " " + rollNo;
    }
} 