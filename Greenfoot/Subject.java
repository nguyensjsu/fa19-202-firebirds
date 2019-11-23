
public interface Subject {
	
	/*
	 * Send notification to observers 
	 */
	public void notifyObserver(int X1, int X2);

	/*
	 * Add new observer
	 */
	public void addObserver(Observer sub);

	/*
	 * Remove an observer 
	 */
	public void removeObserver(Observer sub);
	
}
