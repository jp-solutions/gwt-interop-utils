package gwt.interop.utils.plainobjects;

import elemental2.core.JsArray;
import gwt.interop.utils.collections.StringMap;
import gwt.interop.utils.collections.StringMapFactory;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class CommonDataObject {
    public int intVal;
    public double doubleVal;
    public Double doubleObjVal; //This is synonymous with a javascript Number object
    public boolean booleanVal;
    public Boolean booleanObjVal; //This is synonymous with a javascript Boolean object
    public String stringVal;
    public JsArray<String> anArray;
    public StringMap<String> aMap;
    public CommonDataObject2 embeddedObj;

    @JsOverlay
    public final String convolutedSharedMethod(String someArg) {
        StringBuilder o = new StringBuilder();

        anArray.forEach((e, p1, p2) -> {
            o.append(aMap.get(someArg));
            o.append(embeddedObj.field1);
            o.append(e);
            return null;
        });

        return o.toString();
    }

    @JsOverlay
    public static CommonDataObject create() {
        CommonDataObject o = new CommonDataObject();
        o.intVal = 10;
        o.doubleVal = 20.20;
        o.doubleObjVal = 20.20;
        o.booleanVal = true;
        o.booleanObjVal = true;
        o.stringVal = "A String Value";
        o.anArray = JsArray.of();

        o.anArray.push("ArrayValue1");
        o.anArray.push("ArrayValue2");
        o.anArray.push("ArrayValue3");

        o.aMap = StringMapFactory.create();

        o.aMap.set("v1", "A Map Value 1");
        o.aMap.set("v2", "A Map Value 2");

        o.embeddedObj = new CommonDataObject2();
        o.embeddedObj.field1 = "An embbeded object";
        return o;
    }
}
