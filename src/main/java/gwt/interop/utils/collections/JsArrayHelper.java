package gwt.interop.utils.collections;

import elemental2.core.JsArray;

public class JsArrayHelper {

    /**
     * Cast an Array interface as a Java array
     * @param src The Array
     * @param <E> The type the array holds
     * @return The java array
     */
    public static native <E> E[] castAsArray(JsArray<?> src) /*-{
		return src;
	}-*/;

    /**
     * Set the Array value at the supplied index
     *
     * @param a The array
     * @param i The index
     * @param v The value
     * @param <T> The type of value
     */
    public static native <T> void setArrayValue(JsArray<T> a, int i, T v) /*-{
		a[i] = v;
	}-*/;

    /**
     * Return the Array value at the supplied index
     * @param a The array
     * @param i The index
     * @param <T> The type of value
     * @return The value
     */
    public static native <T> T getArrayValue(JsArray<T> a, int i) /*-{
		return a[i];
	}-*/;
}
