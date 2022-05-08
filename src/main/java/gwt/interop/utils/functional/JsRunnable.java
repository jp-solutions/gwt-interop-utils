package gwt.interop.utils.functional;

import jsinterop.annotations.JsFunction;

/**
 * A callback that takes no arguments and returns nothing
 */
@JsFunction
public interface JsRunnable {
    void run();
}
