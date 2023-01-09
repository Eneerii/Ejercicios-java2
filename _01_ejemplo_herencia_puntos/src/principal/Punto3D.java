package principal;

public class Punto3D extends Punto{
	private int z;
	public Punto3D(int z) {
		this.z=z;
	}
	public Punto3D(int x, int y, int z) {
		super(x,y);
		this.z=z;
		
	}
	public void mover(int d) {
		//x=x+d; //no tiene acceso, son privados
		//y=y+d;
		setX(getX()+d); //modificamos atributos heredados a través de setter
		setY(getY()+d);
		z=z+d;
	}
	//sobrescribimos el método dibujar()
	public void dibujar() {
		System.out.println("Coordenadas: "+getX()+ ","+getY()+","+z);
	}
}
