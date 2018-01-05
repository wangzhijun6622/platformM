package tes;

import java.io.Serializable;

public abstract class boss implements Comparable,Serializable { 
	   private String yonghuming;
	     private String name;
	     private int shenfenzheng;
	     private int xing;
	     private int rujin;
	     private int chujin;
	     private int gongzi;
	     public void SetYonghuming(String y){
	    	 yonghuming=y;
	     }
	     public void SetName(String n){
	     	name=n;
	     } 
	     public void SetShenfenzheng(int s){
	     	shenfenzheng=s;
	     }
	     public void Setxing(int x){
	     	xing=x;
	     }
	     public void SetRujin(int r){
	     	rujin=r;
	     }
	     public void SetChujin(int c){
	     	chujin=c;
	     }
	     public void SetGongzi(int g){
	     	gongzi=g;
	     }
	     public String GetYonghuming(){
	    	 return yonghuming;
	     }
	     public String GetName(){
	    	 return name;
	     }
	     
	     public int GetShenfenzheng(){
	    	 return shenfenzheng;
	     }
	     
	     public int GetXing(){
	    	 return xing;
	     }
	     
	     public int GetRujin(){
	    	 return rujin;
	     }
	     
	     public int GetChujin(){
	    	 return chujin;
	     }
	     
	     public int GetGongzi(){
	    	 return gongzi;
	     }
}
