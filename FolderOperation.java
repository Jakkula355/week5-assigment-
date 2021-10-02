package com.state.pattern.folder;

public class FolderOperation {
	
	private State state = new CreateFolder(); 
	
	 
	
	public void changeState() {
		state = new OpenFolder();
		 
	}
	
	 public void closeSate() {
		 state.close();
	 }
	
}
