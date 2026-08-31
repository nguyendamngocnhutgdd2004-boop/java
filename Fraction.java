public class Fraction {
    private int numerator;
    private int denominator;

    // 1. Constructor co kiem tra dieu kien mau so != 0
    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Loi: Mau so khong duoc bang 0.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        this.simplify(); // Tu dong rut gon phan so ngay khi khoi tao
    }

    // 2. Ham tim uoc chung lon nhat (GCD) bang thuat toan Euclid
    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // 3. Phuong thuc rut gon phan so
    public void simplify() {
        int ucln = gcd(this.numerator, this.denominator);
        this.numerator = this.numerator / ucln;
        this.denominator = this.denominator / ucln;

        // Chuyen dau tru len tu so neu mau so am
        if (this.denominator < 0) {
            this.numerator = -this.numerator;
            this.denominator = -this.denominator;
        }
    }

    // 4. Phep cong: a/b + c/d = (ad + bc) / bd
    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // 5. Phep tru: a/b - c/d = (ad - bc) / bd
    public Fraction subtract(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // 6. Phep nhan: a/b * c/d = ac / bd
    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    // 7. Phep chia: a/b / c/d = ad / bc
    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Loi: Khong the chia cho phan so co tu so bang 0.");
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    // 8. Phuong thuc toString de hien thi dinh dang "tu/mau"
    @Override
    public String toString() {
        if (this.denominator == 1) {
            return String.valueOf(this.numerator); // Neu mau = 1 thi in so nguyen
        }
        return this.numerator + "/" + this.denominator;
    }

    // Cac phuong thuc Getter va Setter
    public int getNumerator() { return numerator; }
    public void setNumerator(int numerator) { 
        this.numerator = numerator; 
        this.simplify();
    }

    public int getDenominator() { return denominator; }
    public void setDenominator(int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Loi: Mau so khong duoc bang 0.");
        }
        this.denominator = denominator;
        this.simplify();
    }
}
