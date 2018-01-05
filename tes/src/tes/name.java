package tes;

public class name {
	private String name;
	private int age;
	private int xing;
	private int shenfen;

	public void SetName(String n) {
		name = n;
	}

	public void SetAge(int a) {
		age = a;
	}
	public void SetXing(int x){
		xing=x;
	}
	public void SetShenfen(int s){
		shenfen=s;
	}
	public String GetName(){
		return name;
	}
	public int GetAge(){
		return age;
	}
	public int GetXing(){
		return xing;
	}
	public int GetShenfen(){
		return shenfen;
	}
}
