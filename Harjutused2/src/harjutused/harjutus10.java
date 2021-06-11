// Carlos Jõesaar
package harjutused;

public class harjutus10 {

	public static void main(String[] args) {
	    for(int number = 1; number <= 66; number++) { //arvude lugemine 66-ni
	        if(number % 5 == 0 && number > 0) //arvude jaotamine ridadesse 5 kaupa
	            System.out.println(number); //arvude väljastamine
	        else
	            System.out.print(number + " "); //arvude väljastamine
	    }

	}
}
