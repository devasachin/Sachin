package for3;

public class UseMarker {
	public static void main(String[]args) {
		Marker m1=new Marker();
		m1.brand="Camalin";
		m1.color="Blue";
		m1.price=40;
		Marker m2=new Marker();
		m2.brand="Faber Castle";
		m2.color="Black";
		m2.price=50;
		Marker m3=new Marker();
		m3.brand="Parker";
		m3.color="Green";
		m3.price=25;
		Marker[] m= {m1,m2,m3};
		for(int i=0;i<m.length;i++) {
			System.out.println(m[i].brand+" "+m[i].color+" "+m[i].price);
		}
				
	}

}
