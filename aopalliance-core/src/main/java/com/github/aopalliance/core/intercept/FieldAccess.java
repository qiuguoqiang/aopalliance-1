
package com.github.aopalliance.core.intercept;

import java.lang.reflect.Field;

/**
 * 本接口表示程序中的域访问.
 *
 * @see FieldInterceptor
 */
public interface FieldAccess extends Joinpoint {

   /** The read access type (see {@link #getAccessType()}). */
   int READ=0;
   /** The write access type (see {@link #getAccessType()}). */
   int WRITE=1;

    /**
     * Gets the field being accessed.
     *
     * <p>This method is a frienly implementation of the {@link
     * Joinpoint#getStaticPart()} method (same result).
     *
     * @return the field being accessed.  */
    Field getField();

   /**
    * Gets the value that must be set to the field.
    *
    * <p>This value can be intercepted and changed by a field
    * interceptor. */
   Object getValueToSet();

   /**
    * Returns the access type.
    *
    * @return FieldAccess.READ || FieldAccess.WRITE */
   int getAccessType();

}

