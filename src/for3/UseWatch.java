package for3;

public class UseWatch {
	public static void main(String[]args) {
		Watch w1=new Watch();
		w1.brand="Fasttrack";
		w1.price=3000;
		w1.isWarrantyAvailable=true;
		
		Watch w2=new Watch();
		w2.brand="Titan";
		w2.price=2000;
		w2.isWarrantyAvailable=false;
		
		Watch w3=new Watch();
		w3.brand="iWatch";
		w3.price=4000;
		w3.isWarrantyAvailable=true;
		
		Watch w4=new Watch();
		w4.brand="Redmi";
		w4.price=1000;
		w4.isWarrantyAvailable=false;
		Watch[] w= {w1,w2,w3,w4};
		//for(int i=0;i<w.length;i++) {
			//System.out.println(w[i].brand+" "+w[i].price+" "+w[i].isWarrantyAvailable);
		//}
		//for(int i=0;i<w.length;i++) {
			//System.out.println(w[i].brand.charAt(w[i].brand.length()-1));
		//}
		//for(int i=0;i<w.length;i++) {
			//System.out.println(w[i].brand.substring(1,w[i].brand.length()-1));
		//}
		//for(int i=w.length-1;i>=0;i--) {
			//System.out.println(w[i].brand);
		//}
		//String a="";
		//for(int i=w.length-1;i>=0;i--) {
			//a=a+w[i].brand+"*";
		//}
		//System.out.println(a);
		//for(int i=0;i<w.length;i++) {
			//System.out.println(w[i].price-w[i].price*15/100);
		//}
		//int a=0;
		//for(int i=0;i<w.length;i++) {
			//a=a+w[i].price;
		//}
		//System.out.println(a);
		//for(int i=0;i<w.length;i++) {
			//System.out.println((w[i].price*100)/10000);
		String a=" ";
		for(int i=0;i<w.length;i++) {
			a=a+w[i].brand.charAt(w[i].brand.length()-2);
		}
		System.out.println(a);
		String b=" ";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
		
		}
		System.out.println(b);
			
			
	}

}
