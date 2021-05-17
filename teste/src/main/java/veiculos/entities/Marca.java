package veiculos.entities;

public enum Marca {
	
	FIAT("Fiat"),
	VOLKSWAGEN("Volkswagen"),	
	GM("Chevrolet"),
	HYUNDAY("Hyundai"),
	JEEP("Jeep"),
	RENAULT("Renault"),	
	TOYTOTA("Toyota"),
	FORD("Ford"),
	HONDA("Honda"),	
	NISSAN("Nissan"),	
	CAOA("Caoa Chery"),	
	PEUGEOT("Peugeot"),
	MITSUBISHI("Mitsubishi"),	
	CITROEN("Citroen"),
	BMW("BMW"),
	VOLVO("Volvo"),	
	MERCEDES("Mercedes"),	
	AUDI("Audi"),
	KIA("Kia"),
	RAM("RAM"),
	IVECO("Iveco"),	
	LAND("Land Rover"),	
	PORSCHE("Porsche"),
	SUZUKI("Suzuki"),
	MINI("Mini"),
	JAC("JAC"),
	TROLER("Troler"),	
	SUBARU("Subaru"),
	JAGUAR("Jaguar"),
	DODGE("Dodge"),
	FOTON("Foton"),
	LEXUS("Lexus");
	
	private String descricao;

    Marca(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
