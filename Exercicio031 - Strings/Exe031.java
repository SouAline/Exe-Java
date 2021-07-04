public class Exe031{
        
    public static void main (String[] args){
        String original = "abcd FGHI ABCD abc DEFG   ";
        String exemplo1 = original.toLowerCase();
        String exemplo2 = original.toUpperCase();
        String exemplo3 = original.trim();
        String exemplo4 = original.substring(2);//busca dentro da frase o index 2.
        String exemplo5 = original.subSequence(2, 9);// recorta do inde 2 ate o index 9
        String exemplo6 = original.replace('a', 'x'); //substitui a por x
        String exemplo7 = original.replaceAll('abc', 'xy'); //substitui abc por xy
        int i = original.indexOf("bc"); //mostra primeira ocorrencia do bc
        int j = original.lastIndexOf("bc"); //mostra ultima ocorrencia do bc

        System.out.println("Original : *" original + "*");
        System.out.println("toLowerCase: *" + exemplo1 + "*");
        System.out.println("toUpperCase : *" exemplo2+ "*");
        System.out.println("trim : *" exemplo3+ "*");
        System.out.println("substring(2) : *" exemplo4+ "*");
        System.out.println("substring(2,9) : *" exemplo5+ "*");
        System.out.println("replace('a', 'x') : *" exemplo6+ "*");
        System.out.println("replace('abc', 'xy') : *" exemplo7+ "*");
        System.out.println("Index of 'bc': *" + i  exemplo6+ "*");
        System.out.println("Index of 'bc': *" + j exemplo6+ "*");
    }

}