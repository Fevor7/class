package by.htp.library.stud;

public class Student extends Person {

	
	public Student (int  id,  String name, String family,  String fac){
		super.setId(id);
		super.setName(name);
		super.setFamily(family);
		super.setFac(fac);
	}
	public Student (String family, String name, String otch, String datarozd, String adress){
		super.setFamily(family);
		super.setName(name);
		super.setOtch(otch);
		super.setAdress(adress);
	}

    public void facultel(String facul)
    {
    	if (super.getFac() == facul) System.out.println(" family= " + super.getFamily() + ", name= " + super.getName() +" fakultet= " + super.getFac());
    }
    
	@Override
	public String toString() {
		return "Student [id= " + super.getId() + ", family= " + super.getFamily() + ", name= " + super.getName();
	}


	


	
}
