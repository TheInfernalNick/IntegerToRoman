package it.unipd.mtss; 

public class RomanPrinter {

    public RomanPrinter(){}
    public RomanPrinter(int input){
        print(input);
    }
    public String print(int num){ 
        IntegerToRoman itr = new IntegerToRoman();
        String convertedString = itr.convert(num);
        System.out.println(convertedString);
        return printAsciiArt(convertedString);
    } 
    private String printAsciiArt(String romanNumber){
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
        
        String output = output1+"\n"+output2+"\n"+output3+"\n"+output4+"\n"+output5+"\n"+output6;
        System.out.println(output);
        return output;
    } 
}