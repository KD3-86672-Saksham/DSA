public class LinkedList {
   private Employee head;

   public LinkedList(){
        head = null;
   }



   public void addEmployee(int id, String name, double salary){
    Employee newEmp = new Employee(id, name, salary);
    
    // if there is empty node
    if(head == null)
    head = newEmp;

    else{
        Employee trav = head;
        while(trav.next != null){
            trav = trav.next;
        }
        trav.next = newEmp;
    }

    

    
   }

   public void displayEmp(){
    Employee trav = head;
    while(trav != null){
        System.out.println(trav.toString());
        trav = trav.next;
    }
        
   }

   public void deleteEmpById(int id) {
    if (head == null) {
        System.out.println("Employee list is empty.");
        return;
    }
    if (head.id == id) {
        head = head.next;
        System.out.println("Employee with ID " + id + " deleted.");
        return;
    }   
    Employee trav = head;
    
    while (trav != null && trav.id != id) {
        
        trav = trav.next;
    }
    if (trav == null) {
        System.out.println("Employee with ID " + id + " not found.");
    } else {
        
        System.out.println("Employee with ID " + id + " deleted.");
    }
}

   public void searchEmpeByName(String name) {
    Employee trav = head;
    boolean found = false;
    while (trav != null) {
        if (trav.name.equalsIgnoreCase(name)) {
            System.out.println("EmpID: " + trav.id + ", Name: " + trav.name + ", Salary: " + trav.salary);
            found = true;
        }
        trav = trav.next;
    }
    if (!found) {
        System.out.println("Employee with name '" + name + "' not found.");
    }
}


  
   

    
}
