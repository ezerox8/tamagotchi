package tamagotchi;

public interface State {
	
	void jugar();
	void dormir();
	void alimentar();
	void comoEstas();
	
	void setTamagotchi(Tamagotchi tamagotchi);
}
