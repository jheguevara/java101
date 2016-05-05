package com.mcnz.rps;

public class GameSummary {
	
	private String clientGesture;
	private String serverGesture;
	private String result;
	private java.util.Date date;
	
	public GameSummary(String clientGesture, String serverGesture, String result) {
		super();
		this.clientGesture = clientGesture;
		this.serverGesture = serverGesture;
		this.result = result;
		date = new java.util.Date();
	}
	
	public String toString() {
		String output = "Client :: " + this.getClientGesture();
		output = output + " :: Server :: " + this.getServerGesture();
		output = output + " :: Result :: " + this.getResult();
		output = output + " :: Time played :: " + this.getDate();
		return output;
	}
	
	public void cheat() {
		clientGesture = "rock";
		serverGesture = "scissors";
		result="win";
	}
	
	public String getClientGesture() {
		return clientGesture;
	}

	public String getServerGesture() {
		return serverGesture;
	}

	public String getResult() {
		return result;
	}

	public java.util.Date getDate() {
		return date;
	}

}
