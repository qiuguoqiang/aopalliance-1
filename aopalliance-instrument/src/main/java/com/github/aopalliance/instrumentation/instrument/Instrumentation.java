
package com.github.aopalliance.instrumentation.instrument;


import com.github.aopalliance.instrumentation.reflect.Locator;

/**
 * 本接口表示程序检测.
 *
 * <p>The program instrumentor implementation should return an
 * intrumentation instance for each intrumentation which is performed.
 *
 * @see Instrumentor
 */
public interface Instrumentation {

   // /////// instrumentation类型

   /** 接口 */
   int ADD_INTERFACE   = 0;

   /** 超类 */
   int SET_SUPERCLASS  = 1;

   /** 本类 */
   int ADD_CLASS       = 2;

   /** 代码之前 */
   int ADD_BEFORE_CODE = 3;

   /** 代码之后 */
   int ADD_AFTER_CODE  = 4;

   /** 元数据 */
   int ADD_METADATA    = 5;

   /** 返回instrumentation位置 */
   Locator getLocation();
   
   /**
    * Gets the instrumentation type.
    *
    * @return ADD_INTERFACE | SET_SUPERCLASS | ADD_CLASS |
    * ADD_AFTER_CODE | ADD_BEFORE_CODE | ADD_AROUND_CODE |
    * ADD_METADATA */
   int getType();

}

