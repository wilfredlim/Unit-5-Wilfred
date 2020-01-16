/*Write the Num class… (we will be using it to understand Passing Objects)
        A Num has an integer value
        The value of the integer is set in the constructor
        The value needs a getter and a setter method
        The Num class has a toString method that returns the value of the Num 		as a string
        The Num class has an equals method that compares the value of two Nums to see if they are equal.
*/
public class Num implements Comparable{
    private int value;

    public Num(){
        value = 0;
    }

    public Num(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString(){
        return "" + value;
    }

    public boolean equals(Num otherNum){
        return this.value == otherNum.value;
    }

    public int compareTo(Object other){
        Num otherNum = (Num) other;
        return this.getValue() - otherNum.getValue();
    }
}
