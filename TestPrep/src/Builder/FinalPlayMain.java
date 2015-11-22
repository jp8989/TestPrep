package Builder;

import org.junit.Test;

public class FinalPlayMain  {
	
	@Test
	public void legalBuild()  throws IllegalStateException {
		final FinalPlay.Builder builder = new FinalPlay.Builder();
		final FinalPlay fp = builder
			.withS1("S1")
			.withS2("S2")
			.build();
	}
	
	@Test (expected = IllegalStateException.class)
	public void illegalBuild() throws IllegalStateException {
		final FinalPlay.Builder builder = new FinalPlay.Builder();
		//try {
			final FinalPlay fp = builder
					.withS2("S2")
					.build();
		//} catch (IllegalStateException ise) {
		//	ise.printStackTrace();
		//	throw new 
		//}
	}

	
	public static void main(String[] args) {
		
		FinalPlayMain fpm = new FinalPlayMain();
		fpm.legalBuild();
		fpm.illegalBuild();
		 
	}
}
