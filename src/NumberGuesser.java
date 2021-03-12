class NumberGuesser extends Game {

    public NumberGuesser() {
        super("NumberGuesser");
    }

    public int generateRandomInt() {
        return (int)(Math.random() * 20);
    }
    public void play() {
        generateRandomInt();

    }
}