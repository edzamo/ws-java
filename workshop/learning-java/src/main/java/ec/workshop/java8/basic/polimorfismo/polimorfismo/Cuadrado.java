/**
 * Clase Cuadrado (es un tipo de Rect�ngulo)
 */
package ec.workshop.java8.basic.polimorfismo.polimorfismo;

/**
 * @author Openwebinars
 *
 */
public class Cuadrado extends Rectangulo{

	public Cuadrado(float lado) {
		super(lado, lado);
	}
	
	public float getLado() {
		return getBase();
	}
	
	public void setLado(float lado) {
		setBase(lado);
		setAltura(lado);
	}
	
	public float getArea() {
		System.out.println("Area de un cuadrado");
		return getBase()*getBase();
	}
	
	public float getPerimetro() {
		System.out.println("Perimetro de un cuadrado");
		return getBase()*4;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + getLado() + "]";
	}
	
	

}
