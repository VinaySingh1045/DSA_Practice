package OOPS;

class ComplexNumber {
    double real;
    double imaginary;

    ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    void print() {
        if (imaginary >= 0)
            System.out.println(real + " + " + imaginary + "i");
        else
            System.out.println(real + " - " + (-imaginary) + "i");
    }

    void add(ComplexNumber z) {
        this.real = this.real + z.real;
        this.imaginary = this.imaginary + z.imaginary;
    }

    void sub(ComplexNumber z) {
        this.real = this.real - z.real;
        this.imaginary = this.imaginary - z.imaginary;
    }

    // Formula ---> (a+bi)×(c+di)=(ac−bd)+(ad+bc)i
    void multiply(ComplexNumber z) {
        double r = this.real * z.real - this.imaginary * z.imaginary;
        double i = this.real * z.imaginary + this.imaginary * z.real;
        this.real = r;
        this.imaginary = i;
    }

    // Let's say we have to divide --> a+bi/c+di
    // formula --> for divide--> a+bi/c+di ​× c−di/c−di
    void divide(ComplexNumber z) {
        double denominator = z.real * z.real + z.imaginary * z.imaginary;
        double r = (this.real * z.real + this.imaginary * z.imaginary) / denominator;
        double i = (this.real * z.imaginary - this.imaginary * z.real) / denominator;
        this.real = r;
        this.imaginary = i;
    }

}

public class ComplexNumberPracice {
    public static void main(String[] args) {
        ComplexNumber cn = new ComplexNumber(2, 3);
        ComplexNumber cn2 = new ComplexNumber(2, -4);
        // cn.add(cn2);
        // cn.print();
        // cn.sub(cn2);
        // cn.print();
        // cn.multiply(cn2);
        // cn.print();
        cn.divide(cn2);
        cn.print();
    }
}
