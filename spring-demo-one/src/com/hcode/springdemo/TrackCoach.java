package com.hcode.springdemo;

public class TrackCoach implements ICoach {

	// define a private field for the dependency
		private IFortuneService fortuneService;
		
		// constructor
		public TrackCoach() {
			super();
		}
		
		// define a constructor for dependency injection
		public TrackCoach(IFortuneService fortuneService) {
			this.fortuneService = fortuneService;
		}
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5 km";
	}

	@Override
	public String getDailyFortune() {
		return "Just Do It: " + fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	// add a destroy method
	public void doMyCleanUpStuffYoYo() {
		System.out.println("TrackCoach: inside method doMyCleanUpStuffYoYo");
	}
}
