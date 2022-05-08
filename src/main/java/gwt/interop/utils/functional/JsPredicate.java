package gwt.interop.utils.functional;

import jsinterop.annotations.JsFunction;

/**
 * A function that tests some condition and returns true or false
 */
@JsFunction
public interface JsPredicate {
    boolean test();
}

