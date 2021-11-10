package bai1_1;

public class MyComplex {
    private double real = 0.0;
    private double imag = 0.0;

    public MyComplex() {

    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getImag() {
        return imag;
    }

    public double getReal() {
        return real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setVlue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    @Override
    public String toString() {
        return "("+ this.real + " + " + this.imag + "i)";
    }

    public boolean isReal() {
        if (this.imag == 0) {
            return true;
        }
        return false;
    }

    public boolean isImaginary() {
        if (this.real == 0) {
            return true;
        }
        return false;
    }

    public boolean equals(double real, double imag) {
        if (this.real == real && this.imag == imag) {
            return true;
        }
        return false;
    }

    public boolean equals(MyComplex anothor) {
        if (this.real == anothor.real && this.imag == anothor.imag) {
            return true;
        }
        return false;
    }

    public double mangitude() {
        return Math.sqrt(real * real + imag + imag);
    }

    public MyComplex addInto(MyComplex right) {
        MyComplex myComplex = new MyComplex();
        myComplex.real = this.real + right.real;
        myComplex.imag = this.imag + right.imag;
        return myComplex;

    }

    public MyComplex addNew(MyComplex right) {
        return right;

    }
}
