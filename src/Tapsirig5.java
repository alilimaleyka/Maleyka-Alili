public class Tapsirig5 {
    public static void main(String[] args) {

    int bal1 = 78, bal2 = 91, bal3 = 84;
    // (bal1 + bal2 + bal3) / 3 (int / int olduqda Java nəticəni int kimi hesablayır və ondalıq hissəni göstərmir.
                                 //Ona görə 3 əvəzinə 3.0 yazırıq ki, nəticə double alınsın.)
    double orta = (bal1 + bal2 + bal3) / 3.0;
    System.out.println("Orta bal: " + orta);
    }
}