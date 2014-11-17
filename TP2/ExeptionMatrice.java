
public class ExeptionMatrice extends Exception{

		private String s;
		
		public ExeptionMatrice(String err){
			s = err;
		}
		
	
		public String toString() {
			return "Une erreur est survenue : " + s;
		}
		
}
