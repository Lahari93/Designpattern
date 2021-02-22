package patterns;

public class Factorypattern {

		
		
		public Os getInstance(String str) {
			
			
			if(str.equals("open"))
				return new Android();
			
			else if(str.equals("closed"))
				return new IOS();
			
			
			return null;
			
			
			
		}


}
