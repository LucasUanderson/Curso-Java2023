package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		
		Stream<String> langs = Stream.of("Java ","Lua ", "Js\n");
		langs.forEach(print);
		
		String[] maisLangs = {"python ", "Lisp ", "Perl ", "Go\n"};
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 0,4).forEach(print);
		
		
		List<String> outrasLangs = Arrays.asList("C ","C# ","Php\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
		// loopinfinito Stream.generate(() -> "a").forEach(print);
		
	}
}
