package Sekolah_QA.com;

public class fish_conversation extends ikan {
	
	public void conversation1()
	{
		System.out.println("===================Fish Conversation==================");
	}

	@Override
	public void move() {
		System.out.println("The fish says : I move with fins and tail ");
	}

	@Override
	public void live_in() {
		System.out.println("The fish says : I live in fresh water ");
	}

	@Override
	public void breed() {
		System.out.println("The fish says : of course by laying eggs or ovipar");
	}
}
