import java.util.ArrayList;

// 1. Lop cha Animals
class Animals {
    // Thuoc tinh duoc bao ve bang private de dam bao tinh bao dong
    private String name;
    private int age;

    // Constructor khoi tao co kiem tra hop le du lieu
    public Animals(String name, int age) {
        setName(name);
        setAge(age);
    }

    // Phuong thuc hien thi thong tin chung
    public void displayInfo() {
        System.out.print("Ten: " + name + " | Tuoi: " + age);
    }

    // Phuong thuc phat ra am thanh chung
    public String makeSound() {
        return "Some generic sound";
    }

    // Cac phuong thuc Getter va Setter co kiem tra dieu kien hop le
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            this.name = "Unknown Animal"; // Xu ly khi ten trong
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Loi: Tuoi khong duoc am. Mac dinh gan bang 0.");
            this.age = 0; // Xu ly khi tuoi am
        } else {
            this.age = age;
        }
    }
}

// 2. Lop Dog ke thua tu Animals
class Dog extends Animals {
    private String breed; // Thuoc tinh rieng cua lop Dog

    // Constructor su dung tu khoa super de goi lai constructor lop cha
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = (breed == null || breed.trim().isEmpty()) ? "Unknown Breed" : breed;
    }

    // Ghi de phuong thuc displayInfo bang cach su dung super de dung lai code lop cha
    @Override
    public void displayInfo() {
        super.displayInfo(); // Goi ham displayInfo cua Animals
        System.out.print(" | Giong cho: " + breed);
    }

    // Ghi de phuong thuc makeSound
    @Override
    public String makeSound() {
        return "Woof Woof";
    }

    // Getter va Setter cho thuoc tinh rieng
    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }
}

// 3. Lop Cat ke thua tu Animals
class Cat extends Animals {
    private String furColor; // Thuoc tinh rieng cua lop Cat

    // Constructor su dung tu khoa super de goi lai constructor lop cha
    public Cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = (furColor == null || furColor.trim().isEmpty()) ? "Unknown Color" : furColor;
    }

    // Ghi de phuong thuc displayInfo bang cach su dung super de dung lai code lop cha
    @Override
    public void displayInfo() {
        super.displayInfo(); // Goi ham displayInfo cua Animals
        System.out.print(" | Mau long: " + furColor);
    }

    // Ghi de phuong thuc makeSound
    @Override
    public String makeSound() {
        return "Meow Meow";
    }

    // Getter va Setter cho thuoc tinh rieng
    public String getFurColor() { return furColor; }
    public void setFurColor(String furColor) { this.furColor = furColor; }
}

// 4. Lop chay chinh chua phuong thuc main de quan ly danh sach va kiem thu
public class QuanLyDongVat {
    public static void main(String[] args) {
        // Tao mot danh sach kieu Animals chua ca doi tuong Dog va Cat (Tinh da hinh)
        ArrayList<Animals> animalList = new ArrayList<>();

        System.out.println("--- KHOI TAO CAC DOI TUONG DONG VAT ---");
        // Them doi tuong hop le
        animalList.add(new Dog("Ki Ki", 3, "Poodle"));
        animalList.add(new Cat("Miu Miu", 2, "Vang"));

        // Them doi tuong de kiem tra tinh hop le (ten trong, tuoi am)
        animalList.add(new Dog("", -2, "Becgie")); 
        System.out.println("---------------------------------------\n");

        // Duyet danh sach de hien thi thong tin va am thanh (Da hinh)
        System.out.println("--- DANH SACH DONG VAT VA AM THANH ---");
        for (Animals animal : animalList) {
            animal.displayInfo(); // Tu dong goi ham displayInfo tuong ung cua Dog hoac Cat
            System.out.println(" | Am thanh: " + animal.makeSound()); // Tu dong goi makeSound phu hop
        }
    }
}
