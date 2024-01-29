package week9;

public class Class9_10_4_To_Do_List_Organizer_Arrays_with_Loops {
    public static void main(String[] args) {
        printLastTask(new String[]{"Buy groceries", "Call the doctor", "Finish the report", "Pay bills"});
    }

    public static void printLastTask(String[] toDoLists) {

        if (toDoLists==null|| toDoLists.length==0 ) {
            System.out.println("Your to-do list is empty");
        }else {
            System.out.println("Last Task: "+toDoLists[toDoLists.length - 1]);
        }
    }
}
