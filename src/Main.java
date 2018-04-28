import java.util.Scanner;

/**
 * @author Suyash Raj Bhandari
 *
 */
public class Main {

	private static Scanner scanner = new Scanner(System.in);
	private static ToDoList toDoList = new ToDoList();
	
	public static void main(String[] args) {
		
		boolean quit = false;
		int choice = 0;
		
		printInstructions();
		
		while(!quit) {
			System.out.println("Enter your choice: ");
			
			choice = scanner.nextInt();
			scanner.nextLine();
			
			 switch (choice) {
             case 0:
                 printInstructions();
                 break;
             case 1:
                 toDoList.printList();
                 break;
             case 2:
                 addTask();
                 break;
             case 3:
                 modifyTask();
                 break;
             case 4:
                 removeATask();
                 break;
             case 5:
                 searchForTask();
                 break;
             case 6:
                 quit = true;
                 break;
         }
		}

	}
	
	  public static void printInstructions() {
	        System.out.println("\nPress ");
	        System.out.println("\t 0 - To print choice options.");
	        System.out.println("\t 1 - To print the list of tasks.");
	        System.out.println("\t 2 - To add a task to the list.");
	        System.out.println("\t 3 - To modify a task in the list.");
	        System.out.println("\t 4 - To remove a task from the list.");
	        System.out.println("\t 5 - To search for a task in the list.");
	        System.out.println("\t 6 - To quit the application.");
	    }

	  public static void addTask() {
	        System.out.print("Please enter the task: ");
	        toDoList.addToDoTask(scanner.nextLine());
	    }
	  
	  public static void modifyTask() {
	        System.out.print("Current task name: ");
	        String taskNo = scanner.nextLine();
	        System.out.print("Enter new task: ");
	        String newTask = scanner.nextLine();
	        toDoList.modifyToDoList(taskNo, newTask);
	    }
	  
	  public static void removeATask() {
	        System.out.print("Enter task name: ");
	        String taskNo = scanner.nextLine();
	        toDoList.removeTask(taskNo);
	    }

	    public static void searchForTask() {
	        System.out.print("Task to search for: ");
	        String searchTask = scanner.nextLine();
	        if(toDoList.onFile(searchTask)) {
	            System.out.println("Found " + searchTask);
	        } else {
	            System.out.println(searchTask + ", not on file.");
	        }
	    }
}
