package week2.task2;

public class Fraction {

    private int numerator;
    private int denominator;
    public int getNumerator() {
        return numerator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public int getDenominator() {
        return denominator;
    }
    public void setDenominator(int denominator) {
        if (denominator != 0)
            this.denominator = denominator;
        else {
            System.out.println("denominator = 0. Yeu cau nhap lai: ");
            setNumerator(denominator);
        }
    }
    // TODO: khai báo các thuộc tính

    public Fraction(int numerator, int denominator) {
        this.denominator = denominator;
        this.numerator = numerator;

        // TODO: khởi tạo giá trị cho các thuộc tính    numberator (tử số), denominator (mẫu số)
    }

    public Fraction add(Fraction other) {
        Fraction result = Fraction(0,1);
        result.numberator = this.numberator*other.denominator + other.numberator*this.denominator;
        result.denominator = this.denominator*other.denominator;
        return result;
    }
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới



    public Fraction subtract(Fraction other) {
        Fraction result = Fraction(0,1);
        result.numberator = this.numberator*other.denominator - other.numberator*this.denominator;
        result.denominator = this.denominator*other.denominator;
        return result;
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới

    }

    public Fraction multiply(Fraction other) {
        Fraction result = Fraction(0,1);
        result.numberator = this.numberator * other.denominator ;
        result.denominator = this.denominator * other.denominator;
        return result;
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới

    }

    public Fraction divide(Fraction other) {
        Fraction result = Fraction(0, 1)
        result.numberator = this.numberator * other.denominator;
        result.denominator = this.denominator * other.numerator;
        return result;
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới}
    }
    public boolean equals(Object obj) {
        if(obj == null ) return false ;
        else if(obj.getClass() != this.getClass()){
            Fraction other = (Fraction) obj ;

            if(this.equals(other)) return true ;
            return false ;
        }
        else{ if(this.equals(obj)) return true ;
            return false;
        }
    }
}
