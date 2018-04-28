import java.util.ArrayList;

/**
 * @author Suyash
 *
 */

public class ToDoList {
	
	//create an arraylist to hold our to-do-list and all the tasks
	public ArrayList<String> toDoList = new ArrayList<>();
	
	//Methods to add, change, delete the tasks on our list
	
	public void addToDoTask(String task) {
		toDoList.add(task);
	}
	
	public void printList() {
		System.out.println("You have " + toDoList.size() + " tasks in your To-Do list");
		for(int i = 0; i < toDoList.size(); i++) {
			System.out.println((i + 1) + ". " + toDoList.get(i));
		}
	}
	
	public void modifyToDoList(String currentTask, String newTask) {
		int position = findTask(currentTask);
		if(position >= 0) {
			modifyToDoList(position, newTask);
		}
	}
	
	private void modifyToDoList(int position, String newTask) {
		toDoList.set(position, newTask);
		System.out.println("Task " + (position + 1) + " has been modified.");
	}
	
	public void removeTask(String task) {
		
		int position = findTask(task);
		if(position >=0) {
			removeTask(position);
		}
	}
	
	public void removeTask(int position) {
		toDoList.remove(position);
	}
	
	private int findTask(String searchTask) {	
		return toDoList.indexOf(searchTask);
	}
	
	public boolean onFile(String searchTask) {
		
		int position = findTask(searchTask);
		if(position >= 0) {
			return true;
		}
		return false;
	}

}
