package project07;

public class EcDef extends Exception{
    static final long serialVersionUID = -3387516993124229948L;

    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public EcDef() {
    }

    /**
     * Constructs a new exception with the specified detail message.  The
     * cause is not initialized, and may subsequently be initialized by
     * a call to {@link #initCause}.
     *
     * @param args the detail message. The detail message is saved for
     *                later retrieval by the {@link #getMessage()} method.
     */
    public EcDef(String args) {
        super(args);
    }

}
