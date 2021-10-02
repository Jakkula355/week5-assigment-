package com.state.pattern.folder;

public class TestFolderStatepattern {

	public static void main(String[] args) {
		
		System.out.println("In File system changed the folder state \n ");
		
		FolderOperation fo =new FolderOperation();
		
		fo.changeState();
		
		fo.closeSate();
		 
	}

}
