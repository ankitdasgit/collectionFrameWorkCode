package list;

public class PairGenerics<X,Y > {

	X x;
	Y y;
	public PairGenerics ( X x, Y y) {
		this.x= x;
		this.y= y;
	}
		public void des() {
			System.out.println(x+" and "+ y);
		}
		
	}


