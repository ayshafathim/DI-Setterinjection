package UstBatch.DI_Setterinjuction;

public class Roles {
	public String charactername;
	public String responsibility;
@Override
	public String toString() {
		return "Roles [charactername=" + charactername + ", responsibility=" + responsibility + "]";
	}
public String getCharactername() {
		return charactername;
	}
	public String getResponsibility() {
		return responsibility;
	}
	public void setCharactername(String charactername) {
		this.charactername = charactername;
	}
	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}


public	void display() {
System.out.println("my name is" +charactername + "  "+"and my responsibility is:"+responsibility );
}
}


