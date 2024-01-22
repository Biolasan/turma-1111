package br.com.logicaprogramacao;

public class Palindrono {

    public String validarPalindromo(String palavra) {
        if (checarPalindromo(palavra)) {
            return String.format("A palavra %s é um palíndromo", palavra);
        } else {
            return String.format("A palavra %s não é um palíndromo", palavra);
        }
    }

    private boolean checarPalindromo(String palavra) {
        int comprimento = palavra.length();

        for (int i = 0; i < comprimento / 2; i++) {

        if (palavra.charAt(i) != palavra.charAt(comprimento - i - 1)) {

        return false;
            }
        }

        return true;
    }
}

