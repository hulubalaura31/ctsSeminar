package ro.ase.cts.gr1085.lab01;

public class UpperCaseException extends Exception{
    public void upperCaseLetters(String s){
        Exception e = new Exception();
        if(s.toUpperCase() == s){
            System.out.println("litere mari: " + s);
        }else{
            e.printStackTrace();
        }
    }
}
