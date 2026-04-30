package it.unipd.mtss; 

public class RomanPrinter {
    public RomanPrinter(){
        for(int i =0;i<=1000;i++){
            print(i);
        }
        print(0);
    }
    public void print(int num){ 
        IntegerToRoman itr = new IntegerToRoman();
        System.out.println(itr.convert(num));
        printAsciiArt(itr.convert(num));
    } 
    private void printAsciiArt(String romanNumber){
        System.out.println("");
        String output1="";
        String output2="";
        String output3="";
        String output4="";
        String output5="";
        String output6="";
        char b = '\\'; 

        for ( char c : romanNumber.toCharArray()){
        switch(c){
            case 'i' : 
                    output1 += "  _____ ";
                    output2 += " |_   _|";
                    output3 += "   | |  ";
                    output4 += "   | |  ";
                    output5 += "  _| |_ ";  
                    output6 += " |_____|";
                 break;
             case 'v' : 
                    output1 += "  __      __ ";
                    output2 += "  "+b+" "+b+"    / / ";
                    output3 += "   "+b+" "+b+"  / /  ";
                    output4 += "    "+b+" "+b+"/ /   ";
                    output5 += "     \\  /    ";  
                    output6 += "      \\/     ";
                 break; 
            
            case 'x' : 
                    output1 += "  __   __ ";
                    output2 += "  "+b+" "+b+" / / ";
                    output3 += "   "+b+" V /  ";
                    output4 += "    > <   ";
                    output5 += "   / . "+b+"  ";  
                    output6 += "  /_/ "+b+"_"+b+ " ";
                 break;   
            
            case 'l' : 
                    output1 += "  _      ";
                    output2 += " | |     ";
                    output3 += " | |     ";
                    output4 += " | |     ";
                    output5 += " | |___  ";  
                    output6 += " |_____| ";
                 break;
                                
            case 'c' : 
                    output1 += "   _____   ";
                    output2 += "  / ____|  ";
                    output3 += " | |       ";
                    output4 += " | |       ";
                    output5 += " | |____   ";  
                    output6 += "  "+b+"_____|  ";
                 break;
            
            case 'd' : 
                    output1 += "  _____   ";
                    output2 += " | __  "+b+"  ";
                    output3 += " | |  | | ";
                    output4 += " | |  | | ";
                    output5 += " | |__| | ";  
                    output6 += " |_____/  ";
                 break;
            
            case 'm' : 
                    output1 += "  __  __  ";
                    output2 += " |  "+b+"/  | ";
                    output3 += " | "+b+"  / | ";
                    output4 += " | |"+b+"/| | ";
                    output5 += " | |  | | ";  
                    output6 += " |_|  |_| ";
                 break;
        };   
    }
        System.out.println(output1);
        System.out.println(output2);
        System.out.println(output3);
        System.out.println(output4);
        System.out.println(output5);
        System.out.println(output6);
    } 
}