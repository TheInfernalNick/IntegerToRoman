package it.unipd.mtss; 

public class IntegerToRoman {
    public String output="";

    public IntegerToRoman(){
    }
    public String convert(int number){
        output="";
        if(number>0){
            while(number>0){
                if(number>=1000){
                    output+='m';
                    number-=1000;
                }else if(number>=900){
                    output+="cm";
                    number-=900;
                }else if(number>=500){
                    output+="d";
                    number-=500;
                }else if(number>=400){
                    output+="cd";
                    number-=400;
                }else if(number>=100){
                    output+="c";
                    number-=100;
                }else if(number>=90){
                    output+="xc";
                    number-=90;
                }else if(number>=50){
                    output+="l";
                    number-=50;
                }else if(number>=40){
                    output+="xl";
                    number-=40;
                }else if(number>=10){
                    output+="x";
                    number-=10;
                }else if(number>=9){
                    output+="ix";
                    number-=9;
                }else if(number>=5){
                    output+="v";
                    number-=5;
                }else if(number>=4){
                    output+="iv";
                    number-=4;
                }else{
                    output+="i";
                    number-=1;
                }
            }
            return output; 
        }else{
            return "error";
        }
    }
}