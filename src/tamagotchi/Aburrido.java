package tamagotchi;

public class Aburrido implements State {
	
	private Tamagotchi tamagotchi;

	@Override
	public void jugar() {
		// TODO Auto-generated method stub
		System.out.println("Siiii!!!! juguemos!!!!");
		this.tamagotchi.setState(new Cansado());
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		System.out.println("No quiero dormir!");
		
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("No quiero!");
		
	}

	@Override
	public void comoEstas() {
		// TODO Auto-generated method stub
		System.out.println("Estoy aburrido!!!! quiero jugar!!!!");
		
	}

	@Override
	public void setTamagotchi(Tamagotchi tamagotchi) {
		// TODO Auto-generated method stub
		this.tamagotchi = tamagotchi;
		
	}
	
}
