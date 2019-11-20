
public interface Indexed
    {
    /** Should return the base component type for this Indexed object, or
        null if the component type should be queried via getValue(index).getClass.getComponentType() */
    public Class componentType();
    public int size();
    /** Throws an IndexOutOfBoundsException if index is inappropriate, and IllegalArgumentException
        if the value is inappropriate.  Not called set() in order to be consistent with getValue(...)*/
    public Object setValue(final int index, final Object value)
        throws IndexOutOfBoundsException, IllegalArgumentException;
    /** Throws an IndexOutOfBoundsException if index is inappropriate.  Not called get() because
        this would conflict with get() methods in IntarrayFF etc. which don't return objects. */
    public Object getValue(final int index);
    }
