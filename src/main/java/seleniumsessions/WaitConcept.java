package seleniumsessions;

public class WaitConcept {

	public static void main(String[] args) {

		
		//types of waits:
		//1. static wait: Thread.sleep(10000) --> ele found - 2 secs ---> wait for 10 secs only
		//2. dynamic wait: time out = 10 secs ---> ele found - 2 secs ---> rest 8 secs ignored
			//2.a: Implicitly wait
			//2.b: Explicit wait:
					//2.b.1: WebDriverWait
					//2.b.2: FluentWait
		//WebDriverWait(c) --> extends --> FluentWait (c) ---> implements --> Wait(I) --> method -> until();
		
		
		
		
		
	}

}
