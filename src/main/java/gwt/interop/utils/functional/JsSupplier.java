package gwt.interop.utils.functional;

import jsinterop.annotations.JsFunction;

/**
 * Represents a supplier of results.
 *
 * @param <T> The return type
 */
@JsFunction
public interface JsSupplier<T> {
    T get();
}
