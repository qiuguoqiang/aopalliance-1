package com.github.aopalliance.core.intercept;


import com.github.aopalliance.core.aop.Advice;

/**
 * 本接口代表通用拦截器.
 *
 * 通用拦截器能够拦截发生在基本程序中的运行时事件.
 * <p>A generic interceptor can intercept runtime events that occur
 * within a base program. Those events are materialized by (reified
 * in) joinpoints. Runtime joinpoints can be invocations, field
 * access, 。...
 *
 * 本接口不能直接被使用. 而是使用子接口来拦截特定事件.
 * 例如,以下类为了实现调试器而实现了一些特定的拦截器:
 *
 * <pre>
 * class DebuggingInterceptor implements MethodInterceptor, 
 *     ConstructorInterceptor, FieldInterceptor {
 *
 *   @Override
 *   Object invoke(MethodInvocation i) throws Throwable {
 *     debug(i.getMethod(), i.getThis(), i.getArgs());
 *     return i.proceed();
 *   }
 *
 *   @Override
 *   Object construct(ConstructorInvocation i) throws Throwable {
 *     debug(i.getConstructor(), i.getThis(), i.getArgs());
 *     return i.proceed();
 *   }
 *
 *   @Override
 *   Object get(FieldAccess fa) throws Throwable {
 *     debug(fa.getField(), fa.getThis(), null);
 *     return fa.proceed();
 *   }
 *
 *   @Override
 *   Object set(FieldAccess fa) throws Throwable {
 *     debug(fa.getField(), fa.getThis(), fa.getValueToSet());
 *     return fa.proceed();
 *   }
 *
 *   void debug(AccessibleObject ao, Object this, Object value) {
 *     ...
 *   }
 * }
 * </pre>
 *
 * @see Joinpoint
 */
public interface Interceptor extends Advice {
}
