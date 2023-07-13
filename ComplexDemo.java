class Complex
{
    private double real;
    private double imaginary;
    Complex()
    {
        real = 0.0; imaginary = 0.0;
    }
    Complex(double real, double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }
    public Complex add (Complex obj1, Complex obj2)
    {
        Complex temp = new Complex();
        temp.real = obj1.real + obj2.real;
        temp.imaginary = obj1.imaginary + obj2.imaginary;
        return temp;
    }
    public void display()
    {
        System.out.println("Number = " + real + " +  i" + imaginary);
    }
}

public class ComplexDemo {
    public static void main(String[] args) {
        Complex obj1 = new Complex(5, 5);
        Complex obj2 = new Complex(10, 10);
        Complex obj3 = new Complex();
        obj3 =  obj3.add(obj1, obj2);
        obj3.display();
    }
}
