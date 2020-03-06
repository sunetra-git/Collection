import java.util.*;
public class TestCollection{
	public static void main(String[] args){
		List<String> language=new ArrayList<>(Arrays.asList("C","C++","C#","Java","Javascript","Python","R","Swift","Scala","GoLang"));
		System.out.println(language);
		language.add("Ruby");
		language.add("Kotlin");
		System.out.println("*----------------*");
		for(String i:language){
			System.out.println(i);
		}
		System.out.println("*----------------*");
		language.remove("C#");
		for(String i:language){
			System.out.println(i);
		}
		System.out.println("*----------------*");
		System.out.println("Before Update "+language.get(1));
		language.set(1,"PHP");
		System.out.println("After Update "+language.get(1));
		System.out.println("*---------------*");
		System.out.println(language);
	}
}