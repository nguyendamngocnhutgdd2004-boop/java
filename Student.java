public class Student {
    // Cac thuoc tinh private thuc hien tinh bao dong
    private String name;
    private int age;
    private String className; // Doi 'class' thanh 'className' de tranh trung tu khoa cua Java
    private double avgScore;

    // Constructor khong tham so
    public Student() {
    }

    // Constructor co tham so de khoi tao nhanh danh sach
    public Student(String name, int age, String className, double avgScore) {
        this.name = name;
        this.age = age;
        this.className = className;
        this.avgScore = avgScore;
    }

    // Phuong thuc hien thi thong tin nhanh cua mot sinh vien
    public void display() {
        System.out.println("Ten: " + name + " | Tuoi: " + age + " | Lop: " + className + " | DTB: " + avgScore);
    }

    // Cac phuong thuc Getter va Setter
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getClassName() { return className; }
    public void setClassName(String className) { this.className = className; }

    public double getAvgScore() { return avgScore; }
    public void setAvgScore(double avgScore) { this.avgScore = avgScore; }
}
