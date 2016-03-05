package student;

public interface StudentSubject {
	public void registerObserver(Observer observer);
	public void deregisterObserver(Observer observer);
	public void notify(Observer observer);
	public void notifyAllObservers();
}
