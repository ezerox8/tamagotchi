package tamagotchi;

public class Cansado implements State {
	
	private Tamagotchi tamagotchi;

	@Override
	public void jugar() {
		// TODO Auto-generated method stub
		System.out.println("No quiero jugar!!!!");
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		System.out.println("Por fin! A dormir!!!!!");
		this.tamagotchi.setState(new Durmiendo());
		
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("No quiero Comer!");
		
	}

	@Override
	public void comoEstas() {
		// TODO Auto-generated method stub
		System.out.println("Estoy cansado!!!! quiero dormir!!!!");
		
	}

	@Override
	public void setTamagotchi(Tamagotchi tamagotchi) {
		// TODO Auto-generated method stub
		this.tamagotchi = tamagotchi;
		
	}
	
}