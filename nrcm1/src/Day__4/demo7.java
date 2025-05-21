package Day__4;

public class demo7 {
	
		float x;
		int y;
		float z;
		public demo7(){
			System.out.println("welcome to my profile");
		}
		public demo7(float x){
			this.x=x;
			System.out.println(x);
		}
		public demo7(float x,int y) {
			this.x=x;
			this.y=y;
			System.out.println(x+y);
		}
		public demo7(float x,int y,float z) {
			this.x=x;
			this.y=y;
			this.z=z;
			System.out.println("SSC:"+(x)+"INTER"+(y)+"B.TECH"+(z));
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			demo7 t=new demo7();
			demo7 t2=new demo7(8.7f);
			demo7 t3=new demo7(8.7f,73);
			demo7 t4=new demo7(9.3f,650,7.4f);

		}

	}
