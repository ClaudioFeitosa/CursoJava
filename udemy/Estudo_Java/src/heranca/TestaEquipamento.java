package heranca;

public class TestaEquipamento {

	public static void main(String[] args) {
		Equipamento e1 = new Equipamento("Samsumg", "Notebook");
		Computador comp1 = new Computador ("Samsumg", "Notebook","Xp400", 8);
		
		e1.imprimeEquipamento();
		
		comp1.imprimeEquipamento();
		
		

	}

}
