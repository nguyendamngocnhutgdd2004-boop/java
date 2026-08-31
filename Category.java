public class Category {
    private String id;
    private String name;
    private String description;

    // Constructor khong tham so
    public Category() {
    }

    // Constructor co tham so
    public Category(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    // Phuong thuc hien thi thong tin danh muc
    public void display() {
        System.out.println("ID: " + id + " | Ten: " + name + " | Mo ta: " + description);
    }

    // Cac phuong thuc Getter va Setter
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}
