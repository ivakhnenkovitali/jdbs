package by._java_SE._1_javadoc;
//над классом и ПАКЕТОМ!!!!
//Можем вставлять картинки
/**
 * @author Max
 * @version 1.1
 * @since 1.0
 * This is my Main class here I will write my code <strong>code</strong>
 * <img src = "by/_java_SE/_javadoc/doc-files/img.png" alt="bla"/>
 */
 //над полем
public class Main {
    /**
     * This is int fields where I will store my values
     */
    static int myFields;

    /**
     * над методом
     * Here start point of the program
     * @param args command line values
     */
    public static void main(String[] args) {

    }
//над методами не в классе main
//описываем что он делает, что получает, что возвращает
    /**
     * This is method will return i
     * @param i some int value
     * @param s other String value
     * @return i from params
     * @throws RuntimeException if something goes wrong this exception is throws
     */
    int getMyFields(int i, String s) throws RuntimeException {
        return i;
    }

    /**
     * @deprecated please une newMethod
     */
    void oldMethod() {
    }
    //новый метод будет ссылаться например на другой метод из другого класса
    /**
     * {@link OtherClass#otherMethod()}
     *
     * @see OtherClass#otherMethod()
     */
    void newMethod() {

    }
}
