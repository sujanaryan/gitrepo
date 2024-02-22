package classandobject;

public class Busmain {

	public static void main(String[] args) {

		Bus bb = new Bus();
		 bb.Steering();
		 bb.Emergency();
		 bb.Compartments();
		 bb.Run();
		 System.out.println(bb.Tyre);
		 System.out.println(bb.seats);
		 System.out.println(bb.color);
		 
		 Bus cc = new Bus("Red");
		 
		 cc.Steering();
		 cc.Emergency();
		 cc.Compartments();
		 cc.Run();
		 System.out.println(cc.Tyre);
		 System.out.println(cc.seats);
		 System.out.println(cc.color); 
		 
		 Bus dd = new Bus ("Yellow", "Blue");
		 dd.Steering();
		 dd.Emergency();
		 dd.Compartments();
		 dd.Run();
		 System.out.println(dd.Tyre);
		 System.out.println(dd.seats);
		 System.out.println(dd.color);
		 
		 Bus ee = new Bus (9);
		 ee.Steering();
		 ee.Emergency();
		 ee.Compartments();
		 ee.Run();
		 System.out.println(ee.Tyre);
		 System.out.println(ee.seats);
		 System.out.println(ee.color);
		 
		 
		 
		 
		

}
}