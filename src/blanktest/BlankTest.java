package blanktest;

public class BlankTest {
    public static void main(String[] args){
        String string="Today is Monday.";
        final Character BLANK=' ';
        do{
            System.out.println(string);
            Integer position=(Input.getInteger("position: ")-1);
            System.out.print("character at position "+(position+1)); 
            char ch1 = string.charAt(position);
            if (Character.compare(ch1, BLANK)==0)
            {System.out.println(" is blank");}
            else
            {System.out.println(" is not blank");}        
        }while(Repeat.repeat());
    }
    
}
