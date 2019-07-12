// package com.week05;

public class WordScore
{
	String word;
	int score;
	
	public WordScore(String w)
	{
		this.word = w;
	}

	public int score(String s)
	{
	    int countSpace = 0;
	    char space = '\f';
	    
	    for (int i = 0; i < s.length(); i++){
	        if (s.charAt(i) == space){
	            countSpace++;
	        }
	    }
	    String [] wordList = s.split(" ", countSpace);
	    
	    for (int i = 0; i < wordList.length; i++){
	        if (wordList[i].equals(this.word)){
	            for (int j = 0; j < wordList.length; j++){
	                if (wordList[j].matches("[0-9]")){
	                    int result = Integer.parseInt(wordList[j]);
	                    return result;
	                }
	            }
	        }
	    }
	    return -1;
	    
	}
}
