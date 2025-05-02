package optionalclass;

import java.util.Optional;

public class OptionalExamples {
    public static void main(String[] args) {

        String email = null;

        //empty obj
        //Optional<Object> emptyOptional = Optional.empty();
        //System.out.println(emptyOptional);

        //of
        //Optional<String> optString = Optional.of(email);
        //System.out.println(optString);

        //ofNullable
        Optional<String> emailOpt = Optional.ofNullable(email);

        //orElse
        //System.out.println(emailOpt.orElse("default@email.com"));

        //orElseGet
        //System.out.println(emailOpt.orElseGet(() -> "default@gmail.com"));

        //orElseThrow
        //System.out.println(emailOpt.orElseThrow(() -> new IllegalArgumentException("illegal email")));

        //filter and map
        String result = " abc ";
        Optional<String > resultOpt = Optional.ofNullable(result);
        resultOpt.filter((res)-> res.contains("abc"))
                .map(String::trim)
                .ifPresent(System.out::println);
    }
}
