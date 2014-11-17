
public interface MatriceCreuseInterface<T>{

	public T get(int numLigne, int numCol) throws ExeptionMatrice;
	public void set(int numLigne, int numCol, T data);
	public boolean exists(int numLigne, int numCol);
	public int width();
	public int height();
}
