package edu.kis.vh.nursery;

/**
 * Klasa defaultCountingOutRhymer implementuje prosty stos liczbowy (LIFO)
 * o maksymalnej pojemności 12 elementów.
 * Udostępnia metody do dodawania, usuwania, podglądania elementów oraz sprawdzania stanu stosu.
 */
public class defaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int PEEKABOO_ERROR_RETURN_VALUE = -1;
    private static final int COUNT_OUT_ERROR_RETURN_VALUE = -1;
    private static final int IF_FULL = 11;
    private static final int DEFAULT_ERROR = -1;
    private final int[] numbers = new int[CAPACITY];

    private int totalNum = -1;


    /**
     * Zwraca wartość domyślnego błędu.
     * @return -1
     */
    public static int getDefaultError() {
        return DEFAULT_ERROR;
    }


    /**
     * Zwraca wartość indeksu, przy którym stos jest pełny.
     * @return 11
     */


    public static int getIfFull() {
        return IF_FULL;
    }


    /**
     * Zwraca wartość błędu dla metody countOut().
     * @return -1
     */


    public static int getCountOutErrorReturnValue() {
        return COUNT_OUT_ERROR_RETURN_VALUE;
    }


    /**
     * Zwraca wartość błędu dla metody peekaboo().
     * @return -1
     */


    public static int getPeekabooErrorReturnValue() {
        return PEEKABOO_ERROR_RETURN_VALUE;
    }


    /**
     * Zwraca maksymalną pojemność stosu.
     * @return 12
     */


    public static int getCAPACITY() {
        return CAPACITY;
    }

    /**
     * Zwraca indeks ostatniego dodanego elementu.
     * Jeśli stos jest pusty, zwraca -1.
     * @return indeks ostatniego elementu lub -1
     */


    public int getTotalNum() {
        return totalNum;
    }


    /**
     * Dodaje element do stosu, jeśli stos nie jest pełny.
     * @param in wartość do dodania
     */


    protected void countIn(int in) {
        if (!isFull())
            numbers[++totalNum] = in;
    }


    /**
     * Sprawdza, czy stos jest pusty.
     * @return true jeśli pusty, false w przeciwnym razie
     */
    protected boolean callCheck() {
        return totalNum == DEFAULT_ERROR;
    }

    /**
     * Sprawdza, czy stos jest pełny.
     * @return true jeśli pełny, false w przeciwnym razie
     */
    protected boolean isFull() {
        return totalNum == IF_FULL;
    }


    /**
     * Zwraca ostatni element ze stosu bez jego usuwania.
     * Jeśli stos jest pusty, zwraca wartość błędu.
     * @return ostatni element lub -1
     */
    protected int peekaboo() {
        if (callCheck())
            return PEEKABOO_ERROR_RETURN_VALUE;
        return numbers[totalNum];
    }


    /**
     * Usuwa i zwraca ostatni element ze stosu.
     * Jeśli stos jest pusty, zwraca wartość błędu.
     * @return ostatni element lub -1
     */

            

    protected int countOut() {
        if (callCheck())
            return COUNT_OUT_ERROR_RETURN_VALUE;
        return numbers[totalNum--];
    }


    /**
     * Zwraca tablicę przechowującą elementy stosu.
     * @return tablica z elementami
     */

    public int[] getNumbers() {
        return numbers;
    }
}
