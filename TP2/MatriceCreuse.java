import java.util.*;

public class MatriceCreuse<T>{
	
	private ArrayList<ArrayList<T>> matrice;
	
	public MatriceCreuse(int hauteur, int longueur){
		matrice = new ArrayList<ArrayList<T>>();
		
		for(int i=0;i<hauteur;i++)
		{
		ArrayList<T> ligne = new ArrayList<T>();
			for(int j=0;j<longueur;j++)
			{
				ligne.add(null);
			}
			matrice.add(ligne);
		}
	}
	
	public T get(int numLigne, int numCol) throws ExeptionMatrice{
		if(exists(numLigne, numCol))
		{
			return matrice.get(numLigne).get(numCol);
		}else
		{
			ExeptionMatrice ex = new ExeptionMatrice("La case n'existe pas");
			throw ex;
		}
	}
	
	public void set(int numLigne, int numCol, T data)throws ExeptionMatrice{
		if(numLigne<0 || numLigne>this.width() || numCol<0 || numCol>this.height())
		{
			ExeptionMatrice ex = new ExeptionMatrice("Valeur des colones ou ligne invalide");
			throw ex;
		}
		matrice.get(numLigne).set(numCol, data);
	}
	
	public boolean exists(int numLigne, int numCol){
		return((matrice.get(numLigne).get(numCol)) != null);
	}
	
	public int width(){
		//testMatriceCreuse
		return matrice.get(0).size();
	}
	
	public int height(){
		return matrice.size();
	}
}
