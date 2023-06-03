class main {
	public static void main(String[] args){
	Shape sha = new Shape();
	Triangle tri = new Triangle();
	Rectangle rac = new Rectangle();
	Square sq = new Square();
	Circle cir=new Circle();
	tri.setA(5);
	tri.setB(8);
	rac.setA(16);
	rac.setB(17);
	sq.setA(9);
	cir.setA(11);
	sha.calculateArea();
	tri.calculateArea();
	rac.calculateArea();
	sq.calculateArea();
	cir.calculateArea();
	}
}