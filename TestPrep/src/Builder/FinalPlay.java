package Builder;

public class FinalPlay {
	
	public static class Builder {
		private String s1;
		private String s2;
		
		public Builder withS1 (final String s1) {
			this.s1=s1;
			return this;
		}
		
		public Builder withS2 (final String s2) {
			this.s2=s2;
			return this;
		}
		
		public FinalPlay build() {
			if (s1==null || s2==null) {
				throw new IllegalStateException("Cannot create FinalPlay");
			}
			
			return new FinalPlay (s1,s2);
		}
	}
	
	private final String s1;
	private final String s2;

 	private FinalPlay(final String s1,final String s2) {
		this.s1=s1;
		this.s2=s2;
	}

}
