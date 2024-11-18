public class EmployeeLLMain {
    public static void main(String[] args) {
        
    
    LinkedList e = new LinkedList();
    e.addEmployee(100,"Ansh",50000);
    e.addEmployee(101,"Sakshi",60000);
    e.deleteEmpById(101);
    e.searchEmpeByName("Ansh");

    e.displayEmp();

}
    
}
