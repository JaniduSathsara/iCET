class Box {
	int length;
	int width;
	int height;	
	
	
	public void printVolume(){
		int volume;
		
		volume = length * height * width;
		
		System.out.println("volume : "+volume);
	}
}
