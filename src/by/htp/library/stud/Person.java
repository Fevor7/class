package by.htp.library.stud;

public abstract class  Person {
	private  int id;
	private  String family, name, otch, datarozd, adress;
	private  String fac, kurs, gruppa;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFamily() {
		return family;
	}

	public void setFamily(String family) {
		this.family = family;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOtch() {
		return otch;
	}

	public void setOtch(String otch) {
		this.otch = otch;
	}

	public String getDatarozd() {
		return datarozd;
	}

	public void setDatarozd(String datarozd) {
		this.datarozd = datarozd;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getFac() {
		return fac;
	}

	public void setFac(String fac) {
		this.fac = fac;
	}

	public String getKurs() {
		return kurs;
	}

	public void setKurs(String kurs) {
		this.kurs = kurs;
	}

	public String getGruppa() {
		return gruppa;
	}

	public void setGruppa(String gruppa) {
		this.gruppa = gruppa;
	}
    public void facultel(String facul)
    {
    	if (fac == facul) System.out.println(" family= " + family + ", name= " + name +" fakultet= " + fac);
    }
}
