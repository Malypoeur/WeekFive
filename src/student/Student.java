package student;

import java.util.ArrayList;

public class Student implements StudentSubject {
	private String name;
	private String gender;
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	
	public Student(){
		this.name = "N/A";
		this.gender = "N/A";
	}
	
	public String toString(){
		return "Name: " + name + " | " +
				"Gender: " + gender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		this.notifyAllObservers();
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
		this.notifyAllObservers();
	}
	public void setGender(String gender, Observer observer) {
		this.gender = gender;
		this.notify(observer);
	}
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	@Override
	public void deregisterObserver(Observer observer) {
		observers.remove(observer);
	}
	@Override
	public void notify(Observer observer) {
		observer.setStatusChange(true);
		observer.onUpdate();
	}
	@Override
	public void notifyAllObservers() {
		for(Observer observer : observers){
			observer.setStatusChange(true);
			observer.onUpdate();
		}
	}
	
}
