package assignment1.q3;

import java.util.Objects;

public class Employess {
	
	int empid;
	String name;
	
	public Employess() {
		
	}
	
	public Employess(int empid, String name) {
		this.empid = empid;
		this.name = name;	
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employess [empid=" + empid + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(empid, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employess other = (Employess) obj;
		return empid == other.empid && Objects.equals(name, other.name);
	}

	public Employess(String name) {
		this.name = name;
	}

	public Employess(int empid) {
		super();
		this.empid = empid;
	}
	
	
	
	

}
