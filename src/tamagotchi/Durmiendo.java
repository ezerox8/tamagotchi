package tamagotchi;

import java.util.Timer;
import java.util.TimerTask;

public class Durmiendo implements State {
	
	private Tamagotchi tamagotchi;

	@Override
	public void jugar() {
		// TODO Auto-generated method stub
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comoEstas() {
		// TODO Auto-generated method stub
		System.out.println("ZzZzZz...");
		
	}

	@Override
	public void setTamagotchi(Tamagotchi tamagotchi) {
		// TODO Auto-generated method stub
		this.tamagotchi = tamagotchi;
		
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				Durmiendo.this.tamagotchi.setState(new Hambriento());
				
			}
		}, 7000);
	}
	
}