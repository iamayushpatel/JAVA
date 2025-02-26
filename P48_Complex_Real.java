public class P48_Complex_Real {
    public static void main(String[] args) {
		Complex c = new Complex(4, 0);
		Complex d = new Complex(5, 0);
		Complex e = Complex.add(c, d);
		Complex f = Complex.sub(c, d);
		e.print();
		f.print();
    }
}

class Complex{
	int real, imag;
	Complex(int r, int i){
		real = r;
		imag = i;
	}

	public static Complex add(Complex a, Complex b){
		return new Complex((a.real+b.real), (a.imag+b.imag));
	}

	public static Complex sub(Complex a, Complex b){
		return new Complex((a.real-b.real), (a.imag-b.imag));
	}

	public void print(){
		System.out.println(real + " + " + imag + "i");
	}
}