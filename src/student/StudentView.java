package student;

public class StudentView implements Observer {
	private boolean statusChange;
	private Student studentModel;
	
	public StudentView(){
		statusChange = false;
		studentModel = new Student();
		studentModel.registerObserver(this);
	}
	
	public void changeStudentName(String studentName){
		studentModel.setName(studentName);
	}
	
	public void changeStudentGender(String studentGender){
		studentModel.setGender(studentGender);
	}
	
	@Override
	public void setStatusChange(boolean statusChange) {
		this.statusChange = statusChange;	
	}

	@Override
	public void onUpdate() {
		System.out.println("\n----Displaying the new changes----\n");
		System.out.println(studentModel.toString());
	}

}
