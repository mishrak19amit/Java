package StringT;
import java.text.Normalizer;

public class StringManupulation {

	public static void main(String[] args) {
		/*String subjectString="Amit,:#";
		subjectString="öäü";
		String resultString = subjectString.replaceAll("[^\\x00-\\x7F]", "");*/
		String subjectString = "öäü";
		subjectString = Normalizer.normalize(subjectString, Normalizer.Form.NFD);
		String resultString = subjectString.replaceAll("[^\\x00-\\x7F]", "");
		System.out.println(resultString);
		String text = "This - text ! has \\ /allot # of % special % characters";
		
		text = text.replaceAll("[^a-zA-Z0-9 ]", "").replaceAll("( )+", " ");
		System.out.println(text);
		
	}
	
}
