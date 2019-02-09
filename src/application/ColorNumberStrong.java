package application;

import java.awt.Color;

public class ColorNumberStrong {
	
	private Color cor;
	private String number;
	private Double strong;
	
	
	
	public ColorNumberStrong(Color cor, String number, Double Strong) {
		this.cor = cor;
		this.number = number;
		this.strong = Strong;
	}

	public Color getCor() {
		return cor;
	}
	public void setCor(Color cor) {
		this.cor = cor;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Double getStrong() {
		return strong;
	}
	public void setStrong(Double strong) {
		this.strong = strong;
	}
}
