package br.com.meli.StarWarsCharacters.controller.advice;

public class CharacterNotFound extends RuntimeException {
    public CharacterNotFound() {
        super();
    }

    public CharacterNotFound(String message) {
        super(message);
    }

    public CharacterNotFound(String message, Throwable cause) {
        super(message, cause);
    }

    public CharacterNotFound(Throwable cause) {
        super(cause);
    }

    protected CharacterNotFound(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
